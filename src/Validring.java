
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucasandersson
 */
public class Validring {
    
    public static Boolean finnsEpostenRedan(String Epost)
    {
        try {
            ArrayList<String> EpostAgnt = Start.idb.fetchColumn("Select epost from agent");
             ArrayList<String> EpostAlien = Start.idb.fetchColumn("Select epost from alien");
             for (String x:EpostAlien) {
            if (Epost.toLowerCase().equals(x)) {
               JOptionPane.showMessageDialog(null, "Eposten finns redan"); 
                return true;
            }
        }
        for (String x: EpostAgnt) {
            if (Epost.toLowerCase().equals(x)) {
                JOptionPane.showMessageDialog(null, "Eposten finns redan");
                return true;
            }
        }
        } catch (InfException ex) {
            Logger.getLogger(Validring.class.getName()).log(Level.SEVERE, null, ex);
        }
                

       return false;
    }
    public static Boolean rattLangd(javax.swing.JPasswordField pfNytt, int maxlangdd)
    {
        String losenordStr = new String(pfNytt.getPassword());

        //Databasen tillåter endast ett lösenord med 6 tecken
        int maxLangd = maxlangdd;
        if (losenordStr.length() <= maxLangd) {
            return true;
        }
        else{        
            JOptionPane.showMessageDialog(null, "Lösenord är för långt max 6 symboler");
            return false;
    }}
    
    public static Boolean rattLangd(javax.swing.JTextField pfNytt, int maxlangdd)
    {
        String losenordStr = pfNytt.getText();

        
        int maxLangd = maxlangdd;
        if (losenordStr.length() <= maxLangd) {
            return true;
        }
                JOptionPane.showMessageDialog(null, "nåt fält är för långt");

       return false;
    }
    
    public static Boolean finnsText(javax.swing.JTextField tfNytt)
    {
   
        if (tfNytt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fyll i alla rutor");
            return false;
            
        }
        
       return true;
    }
    
    public static Boolean finnsText(javax.swing.JPasswordField tfNytt)
    {
   
        if (tfNytt.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, "Fyll i alla rutor");
            return false;
        }
      
       return true;
    }
    
    
    private boolean valideringDatum(String date) {
        String legitimtDatum = "\\d{4}-\\d{2}-\\d{2}";
        return date.matches(legitimtDatum);
    }
    public static Boolean epostCheck(javax.swing.JTextField epostTextField)
    {
   if (epostTextField.getText().contains("@") && epostTextField.getText().contains(".")) 
        {
        return true;
        }
        return false;
    }
    
}
