
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
 * @author lucasandersson
 */
public class OmradeInf extends javax.swing.JFrame {

    /**
     * Creates new form OmradeInf
     */
    public OmradeInf() {
        initComponents();
        fyllHittaPlatsCombobox();
        fyllChefTop();
    }
    
private void fyllHittaPlatsCombobox() {
        try
        {
           ArrayList<String> AgentLista = Start.idb.fetchColumn("SELECT Benamning FROM OMRADE");
            for(String i: AgentLista){
            cbPlats.addItem(i);    
        }
            }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
                }  
            }
private void fyllChefTop() {
      taTopList.setText("");
    try
        {
              String valtOmrade = cbPlats.getSelectedItem().toString();
              String chef = Start.idb.fetchSingle("select Namn from agent join Omradeschef on Agent.Agent_ID = Omradeschef.Agent_ID join Omrade on Omrades_id = omradeschef.Omrade where Benamning = '"+valtOmrade+"'");
              ArrayList<HashMap<String,String>>	AgentLista =  Start.idb.fetchRows("SELECT Agent.namn, COUNT(Alien.Ansvarig_Agent) AS Antal FROM Agent JOIN Alien ON Agent.Agent_ID = Alien.Ansvarig_Agent where Agent.Omrade = (select Omrades_ID from Omrade where benamning = '"+valtOmrade+"') GROUP BY Agent.namn ORDER BY Antal DESC LIMIT 3;");
              for (HashMap x:AgentLista) {
                  
                  taTopList.append(x.get("Namn")+" Antal:"+x.get("Antal")+"\n");
            
                
            }
              
              labelValChef.setText(chef);
        
            }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println(e);
                }  
            }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbPlats = new javax.swing.JComboBox<>();
        labelChef = new javax.swing.JLabel();
        labelValChef = new javax.swing.JLabel();
        labelTop = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTopList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbPlats.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPlatsItemStateChanged(evt);
            }
        });

        labelChef.setText("Områdes chef");

        labelValChef.setText("Ingen");

        labelTop.setText("Top Lista");

        taTopList.setEditable(false);
        taTopList.setColumns(20);
        taTopList.setRows(5);
        jScrollPane1.setViewportView(taTopList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelChef)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelValChef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTop)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(labelChef)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelValChef)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labelTop)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPlatsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPlatsItemStateChanged
       fyllChefTop();
    }//GEN-LAST:event_cbPlatsItemStateChanged

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
            java.util.logging.Logger.getLogger(OmradeInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OmradeInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OmradeInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OmradeInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OmradeInf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelChef;
    private javax.swing.JLabel labelTop;
    private javax.swing.JLabel labelValChef;
    private javax.swing.JTextArea taTopList;
    // End of variables declaration//GEN-END:variables
}
