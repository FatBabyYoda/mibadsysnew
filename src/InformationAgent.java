
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author David
 */
public class InformationAgent extends javax.swing.JFrame {

    /**
     * Creates new form sokAllInformationAgent
     */
    public InformationAgent() {
        initComponents();
        fyllIagentComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoLista = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Alternativen = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Agent Information");

        btnAvbryt.setForeground(new java.awt.Color(255, 0, 0));
        btnAvbryt.setText("X");
        btnAvbryt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAvbrytMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvbryt))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAvbryt)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        infoLista.setColumns(20);
        infoLista.setRows(5);
        jScrollPane1.setViewportView(infoLista);

        jLabel2.setText("Information");

        jLabel3.setText("Agent:");

        Alternativen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternativenActionPerformed(evt);
            }
        });

        jButton1.setText("Sök");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Radera");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setText("Uppdatera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Alternativen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Alternativen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlternativenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternativenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlternativenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                infoLista.setText("");
        try {
            String valdAgent = Alternativen.getSelectedItem().toString();
            String agentNamn = Start.idb.fetchSingle("SELECT NAMN FROM AGENT WHERE NAMN ='" + valdAgent + "'");
            ArrayList<String> namnLista = Start.idb.fetchColumn("SELECT NAMN FROM AGENT WHERE NAMN ='" + agentNamn + "'");
            ArrayList<String> idLista = Start.idb.fetchColumn("SELECT AGENT_ID FROM AGENT WHERE NAMN ='" + agentNamn + "'");
            ArrayList<String> epostLista = Start.idb.fetchColumn("SELECT EPOST FROM AGENT WHERE NAMN ='" + agentNamn + "'");
            ArrayList<String> anstallningDatumLista = Start.idb.fetchColumn("SELECT ANSTALLNINGSDATUM FROM AGENT WHERE NAMN ='" + agentNamn + "'");
            ArrayList<String> telefonLista = Start.idb.fetchColumn("SELECT TELEFON FROM AGENT WHERE NAMN ='" + agentNamn + "'");
            ArrayList<String> platsLista = Start.idb.fetchColumn("SELECT BENAMNING FROM OMRADE JOIN AGENT ON OMRADES_ID = AGENT.OMRADE WHERE AGENT.NAMN ='" + agentNamn + "'");
            ArrayList<String> adminLista = Start.idb.fetchColumn("SELECT ADMINISTRATOR FROM AGENT WHERE NAMN ='" + agentNamn + "'");

            for (int i = 0; i < namnLista.size(); i++) {
                infoLista.append(" Namn: " + namnLista.get(i) + "\n" + " Id: " + idLista.get(i) + "\n" + " Epost: " + epostLista.get(i) + "\n" + " Anställningsdatum: " + anstallningDatumLista.get(i) + "\n" + " Telefon: " + telefonLista.get(i) + "\n" + " Plats: " + platsLista.get(i) + "\n" + " Administratör: " + adminLista.get(i) + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAvbrytMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvbrytMousePressed
        dispose();
        new MenyValAdmin().setVisible(true);
    }//GEN-LAST:event_btnAvbrytMousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        //Metod för att radera agent
        taBortAgent();
        
        
    }//GEN-LAST:event_jButton2MousePressed
    
    private void fyllIagentComboBox()
    {
        try {
            ArrayList<HashMap<String, String>> AgentIdLista = Start.idb.fetchRows("SELECT AGENT_ID, NAMN FROM AGENT");
            for (int i = 0; i < AgentIdLista.size(); i++) {
                Alternativen.addItem(AgentIdLista.get(i).get("Namn"));
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }
    //Metod för att ställa SQL-frågor och ta bort agenten
    private void taBortAgent()
    {
        //Vi börjar med att se om en agent blivit vald, detta genom i vår TextArea inte är tom
        if(!infoLista.getText().isEmpty())
        {
          //Vår infoLista är inte tom, sql frågor ställs
          try
          {
              //Vi sparar agent namn som en variabel, denna hämtar vi från vår combobox för att sedan utföra SQL frågor
              String agentNamn = Alternativen.getSelectedItem().toString();
              
               //SQL frågor där raden inte ska raderas utan endast uppdateras, vi gör detta genom underfrågor då namnet är den information vi utgår ifrån
              Start.idb.update("Update kontorschef set agent_id = null where agent_id = (select agent_ID from agent where namn = '" + agentNamn + "')");
              Start.idb.update("Update Alien set ansvarig_agent = null where ansvarig_agent = (select agent_ID from agent where namn = '" + agentNamn + "')");
              //SQL frågor där all information ska tas bort
              Start.idb.delete("Delete from innehar_utrustning where agent_id = (select agent_ID from agent where namn = '" + agentNamn + "')");
              Start.idb.delete("Delete from omradeschef where agent_id = (select agent_ID from agent where namn = '" + agentNamn + "')");
              Start.idb.delete("Delete from agent where namn = '" + agentNamn + "'");
              JOptionPane.showMessageDialog(null, "Agent Borttagen!");
              
              //Uppdaterar texten, Först ändrar vi vår textArea till tomt, sedan tömmer vi vår combobox och sedan fyller den på nytt
              infoLista.setText("");
              Alternativen.removeAllItems();
              fyllIagentComboBox();
              
          }
          
          catch(InfException e)
          {
              JOptionPane.showMessageDialog(null, "Något gick fel!");
              System.out.println(e);
          }
        }
            
        //Ingen vald egent, felmeddelande
         else
        {
           JOptionPane.showMessageDialog(null, "Välj agent som ska raderas!"); 
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
            java.util.logging.Logger.getLogger(InformationAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Alternativen;
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JTextArea infoLista;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
