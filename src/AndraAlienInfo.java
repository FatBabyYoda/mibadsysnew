
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lucasandersson
 */
public class AndraAlienInfo extends javax.swing.JFrame {

    /**
     * Creates new form AndraAlienInfo
     */
    String Epost;
    public AndraAlienInfo() {
        initComponents();
        fyllHittaAgentCombobox();
        fyllHittaPlatsCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfEpostSok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        tfNamn = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        tfRegDatum = new javax.swing.JTextField();
        tfLosen = new javax.swing.JTextField();
        cbAnsAgnt = new javax.swing.JComboBox<>();
        cbPlats = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        btnRadera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfEpostSok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfEpostSokKeyReleased(evt);
            }
        });

        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Epost");

        jButton1.setText("Spara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAvbryt.setForeground(new java.awt.Color(255, 0, 0));
        btnAvbryt.setText("Tillbaka");
        btnAvbryt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAvbrytMousePressed(evt);
            }
        });

        btnRadera.setForeground(new java.awt.Color(255, 0, 0));
        btnRadera.setText("Radera");
        btnRadera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRaderaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfRegDatum)
                    .addComponent(tfTel)
                    .addComponent(tfNamn)
                    .addComponent(tfLosen)
                    .addComponent(cbPlats, 0, 96, Short.MAX_VALUE)
                    .addComponent(cbAnsAgnt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEpostSok, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRadera)
                        .addContainerGap())
                    .addComponent(btnAvbryt, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(cbAnsAgnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(tfLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1))
                            .addComponent(btnAvbryt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEpostSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(tfRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnRadera))))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            
       
        {
           getAlienInfo();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jList1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Start.idb.update("Update alien set Namn = '"+tfNamn.getText()+"',Telefon= '"+tfTel.getText()+"',Losenord= '"+tfLosen.getText()+"',Registreringsdatum='"+tfRegDatum.getText()+"',Plats="+(cbPlats.getSelectedIndex()+1)+",Ansvarig_Agent="+(cbAnsAgnt.getSelectedIndex()+1)+" where epost = '"+Epost+"'");
        } catch (InfException ex) {
           System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfEpostSokKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEpostSokKeyReleased
        // TODO add your handling code here:
           try {
    ArrayList<String> Epostlista = Start.idb.fetchColumn("select epost from alien where epost like '%" + tfEpostSok.getText() + "%'");
    DefaultListModel<String> listModel = new DefaultListModel<>();   
    for (String epost : Epostlista) {
        listModel.addElement(epost);
    }
    jList1.setModel(listModel);
} catch (InfException ex) {
    System.out.println(ex);
}
    }//GEN-LAST:event_tfEpostSokKeyReleased

    private void btnAvbrytMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvbrytMousePressed
        dispose();
        new AdminAlienVal().setVisible(true);
    }//GEN-LAST:event_btnAvbrytMousePressed

    private void btnRaderaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRaderaMousePressed
        //Ber användaren att bekräfta sitt val innan alien raderas
        int bekrafta = JOptionPane.showConfirmDialog(null, "Är du säker?", "" ,JOptionPane.YES_NO_OPTION);
        if(bekrafta == JOptionPane.YES_OPTION)
        {
            //Metod för att radera aline
            taBortAlien();
        }

        //Ingen else sats behövs eftersom att fönstret endast ska stängas ned

    }//GEN-LAST:event_btnRaderaMousePressed
    private void getAlienInfo() {                                            
        try {
            // TODO add your handling code here:
            Epost = jList1.getSelectedValue();
            HashMap<String, String> AlienInfo = Start.idb.fetchRow("Select * from alien where epost = '"+ Epost +"'");
            cbAnsAgnt.setSelectedIndex(Integer.parseInt(AlienInfo.get("Ansvarig_Agent"))-1);
            cbPlats.setSelectedIndex(Integer.parseInt(AlienInfo.get("Plats"))-1);
            tfLosen.setText(AlienInfo.get("Losenord"));
            tfNamn.setText(AlienInfo.get("Namn"));
            tfTel.setText(AlienInfo.get("Telefon"));
            tfRegDatum.setText(AlienInfo.get("Registreringsdatum"));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }          
    
    private void fyllHittaAgentCombobox() {
        try
        {
            ArrayList<HashMap<String,String>> AgentLista = Start.idb.fetchRows("SELECT NAMN, Agent_ID FROM AGENT");
            for(HashMap<String,String> i: AgentLista){
            cbAnsAgnt.addItem(i.get("Namn"));    
        }
            }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
                }  
            }
    private void fyllHittaPlatsCombobox() {
        try
        {
            ArrayList<HashMap<String,String>> AgentLista = Start.idb.fetchRows("SELECT Benamning, Omrades_ID FROM OMRADE");
            for(HashMap<String,String> i: AgentLista){
            cbPlats.addItem(i.get("Benamning"));    
        }
            }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
                }  
            }
    
    private void taBortAlien()
    {
        //Vi börjar med att se variabeln epost är ifylld, detta enligt metoden getAlienInfo()
        if(Epost != null)
        {
          //Vår infoLista är inte tom, sql frågor ställs
          try
          {
              //Vi använder oss av Epost för att ställa våra SQL Frågor
             
              //SQL frågor där all information ska tas bort
              Start.idb.delete("Delete from boglodite where alien_id = (select Alien_ID from alien where epost = '" + Epost + "')");
              Start.idb.delete("Delete from worm where alien_id = (select Alien_ID from alien where epost = '" + Epost + "')");
              Start.idb.delete("Delete from squid where alien_id = (select Alien_ID from alien where epost = '" + Epost + "')");
              Start.idb.delete("Delete from alien where epost = '" + Epost + "'");
              
              JOptionPane.showMessageDialog(null, "Alien borttagen!");
              
              //Uppdaterar texten, Först ändrar vi våra textfield till tom av den Alien som blivit borttagen
              tfLosen.setText("");
            tfNamn.setText("");
            tfTel.setText("");
            tfRegDatum.setText("");
              
          }
          
          catch(InfException e)
          {
              JOptionPane.showMessageDialog(null, "Något gick fel!");
              System.out.println(e);
          }
        }
            
        //Ingen vald alien, felmeddelande
         else
        {
           JOptionPane.showMessageDialog(null, "Välj alien som ska raderas!"); 
        }
    
      }
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraAlienInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnRadera;
    private javax.swing.JComboBox<String> cbAnsAgnt;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfEpostSok;
    private javax.swing.JTextField tfLosen;
    private javax.swing.JTextField tfNamn;
    private javax.swing.JTextField tfRegDatum;
    private javax.swing.JTextField tfTel;
    // End of variables declaration//GEN-END:variables
}