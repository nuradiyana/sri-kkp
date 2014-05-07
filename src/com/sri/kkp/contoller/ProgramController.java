package com.sri.kkp.contoller;

import com.sri.kkp.connection.ConnectionDB;
import com.sri.kkp.entity.Program;
import com.sri.kkp.service.ProgramService;
import com.sri.kkp.view.PanelProgram;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProgramController {
    private ConnectionDB cdb;
    
    public void inputProgram(PanelProgram panelProgram){
        cdb = new ConnectionDB();
        
        String kodeProgram = panelProgram.getTextKodeProgram().getText();
        String jenisSeminar = String.valueOf(panelProgram.getComboSeminar().getSelectedItem());
        String judulProgram = panelProgram.getTextJudulProgram().getText();
        
        if(kodeProgram.trim().equals("")){
        }else if (judulProgram.trim().equals("")){
        } else {
            try {
                Program p = new Program();
                p.setKodeProgram(kodeProgram);
                p.setJenisProgram(judulProgram);
                p.setJudulProgram(judulProgram);
                
                ProgramService service = new ProgramService();
                service.setConnection(cdb);
                service.inputProgram(p);
                JOptionPane.showMessageDialog(panelProgram, "Input Succes!");
                reset(panelProgram);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(panelProgram, e.getMessage());
            }
        }
    }
    
    public void cancel(PanelProgram panelProgram){
        reset(panelProgram);
    }
    
    private void reset(PanelProgram panelProgram){
        panelProgram.getTextKodeProgram().setText("");
        panelProgram.getComboSeminar().setSelectedIndex(0);
        panelProgram.getTextJudulProgram().setText("");
    }
}
