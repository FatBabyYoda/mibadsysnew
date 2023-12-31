
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
//Små ändringar i klassen och konstruktorn. Nytt fält som är vald agent, denna parameter ska tas emot från förgående Jframe
public class uppdateraAgentAdmin extends javax.swing.JFrame {
    //Vi använder oss av samma variabel som i vår förgående JFrame (InformationAgent)
    
    /**
     * Creates new form uppdateraAgentAdmin
     */
    public uppdateraAgentAdmin() {
        // fyller i alla comboboxar i fönstret med dem alternativen man vill komma åt
        initComponents();
        fyllOAgentCombobox();
        fyllOmradeComboBox();
        fyllAagentcombobox();
        fyllKAgentCombobox();
        fylltaBortAdminCombobox();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OagentBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        OmradeBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        KagentBox = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        btnAvbryt = new javax.swing.JButton();
        omradechefUpdBtn = new javax.swing.JButton();
        kontorUppdateraBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AagentBox = new javax.swing.JComboBox<>();
        adminUpdatteraBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        taBortAdminComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Uppdatera");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Agent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Områdes chef:");

        OagentBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OagentBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Agent:");

        jLabel6.setText("Område:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Kontors chef:");

        jLabel9.setText("Agent:");

        jLabel10.setText("Kontor:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Örebrokontoret", " " }));

        btnAvbryt.setForeground(new java.awt.Color(255, 0, 0));
        btnAvbryt.setText("Tillbaka");
        btnAvbryt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAvbrytMousePressed(evt);
            }
        });

        omradechefUpdBtn.setText("Uppdatera");
        omradechefUpdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradechefUpdBtnActionPerformed(evt);
            }
        });

        kontorUppdateraBtn.setText("Uppdatera");
        kontorUppdateraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontorUppdateraBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Admin:");

        jLabel12.setText("Agent:");

        adminUpdatteraBtn.setText("Uppdatera");
        adminUpdatteraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUpdatteraBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Ta bort Admin");

        jLabel14.setText("Agent:");

        jButton2.setText("Uppdatera");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAvbryt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OagentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OmradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addComponent(omradechefUpdBtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KagentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kontorUppdateraBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AagentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(adminUpdatteraBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taBortAdminComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAvbryt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OagentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(KagentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(AagentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(taBortAdminComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(OmradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(omradechefUpdBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kontorUppdateraBtn)
                        .addComponent(adminUpdatteraBtn)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvbrytMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvbrytMousePressed
        //Metod för att stänga fönstret och öppna förgående
        dispose();
        new AdminAgentVal().setVisible(true);
    }//GEN-LAST:event_btnAvbrytMousePressed

    private void fyllOAgentCombobox() {
        try {
            ArrayList<HashMap<String, String>> oAgentLista = Start.idb.fetchRows("SELECT NAMN FROM AGENT");
            for (int i = 0; i < oAgentLista.size(); i++) {
                OagentBox.addItem(oAgentLista.get(i).get("Namn"));
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
     }
    
    private void fylltaBortAdminCombobox() {
        try {
            String sqlFraga = "SELECT NAMN FROM AGENT WHERE EPOST <>'" + Start.epost + "'" + "AND ADMINISTRATOR ='" + "J" + "'";
            ArrayList<HashMap<String, String>> inteAdmintLista = Start.idb.fetchRows(sqlFraga);
            for (int i = 0; i < inteAdmintLista.size(); i++) {
                taBortAdminComboBox.addItem(inteAdmintLista.get(i).get("Namn"));
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
     }
    
    
    private void fyllOmradeComboBox() {
        try {
            ArrayList<HashMap<String, String>> omradeLista = Start.idb.fetchRows("SELECT BENAMNING FROM OMRADE");
            for (int i = 0; i < omradeLista.size(); i++) {
                OmradeBox.addItem(omradeLista.get(i).get("Benamning"));
            }
            }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }
    private void fyllAagentcombobox() {
        try {
            ArrayList<HashMap<String, String>> aAgentLista = Start.idb.fetchRows("SELECT NAMN FROM AGENT WHERE AGENT.ADMINISTRATOR ='" + "N" + "'");
            for (int i = 0; i < aAgentLista.size(); i++) {
                AagentBox.addItem(aAgentLista.get(i).get("Namn"));
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
     }
    
    private void fyllKAgentCombobox() {
        try {
            ArrayList<HashMap<String, String>> kAgentLista = Start.idb.fetchRows("SELECT NAMN FROM AGENT");
            for (int i = 0; i < kAgentLista.size(); i++) {
                KagentBox.addItem(kAgentLista.get(i).get("Namn"));
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
     }
    
    private void OagentBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OagentBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OagentBoxActionPerformed

    private void adminUpdatteraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUpdatteraBtnActionPerformed
        try{
            //kommande fyra methods uppdaterar databasen till dem nya värderba administratören vill ändra
        String valdAdmin = AagentBox.getSelectedItem().toString();
        String sqlFraga = "UPDATE AGENT SET ADMINISTRATOR = 'J' WHERE NAMN ='" + valdAdmin + "'";
        Start.idb.update(sqlFraga);
        JOptionPane.showMessageDialog(null, "Agenten är nu en Administratör!");
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_adminUpdatteraBtnActionPerformed

    private void kontorUppdateraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontorUppdateraBtnActionPerformed
        try{
            String valdKontorChef = KagentBox.getSelectedItem().toString();
            String valdKontor = jComboBox4.getSelectedItem().toString();
            String agIdQuery = "SELECT AGENT.AGENT_ID FROM AGENT WHERE NAMN ='" + valdKontorChef + "'";
            String agId = Start.idb.fetchSingle(agIdQuery);
            String sqlFraga = "UPDATE KONTORSCHEF SET KONTORSCHEF.AGENT_ID = '" + agId + "' WHERE KONTORSBETECKNING = '" + valdKontor + "'";
            Start.idb.update(sqlFraga);
            JOptionPane.showMessageDialog(null, "Kontors chef uppdaterad!");
            System.out.println(agId);
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        
    }//GEN-LAST:event_kontorUppdateraBtnActionPerformed

    private void omradechefUpdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradechefUpdBtnActionPerformed
        try{
            String valdOmradeChef = OagentBox.getSelectedItem().toString();
            String valdOmrade = OmradeBox.getSelectedItem().toString();
            String agentidquery = "SELECT AGENT.AGENT_ID FROM AGENT WHERE NAMN ='" + valdOmradeChef + "'";
            String agentid = Start.idb.fetchSingle(agentidquery);
            String omradeidquery = "SELECT OMRADE.OMRADES_ID FROM OMRADE WHERE BENAMNING ='" + valdOmrade +"'";
            String omradeid = Start.idb.fetchSingle(omradeidquery);
            String sqlFraga = "UPDATE OMRADESCHEF SET OMRADESCHEF.AGENT_ID ='" + agentid + "' WHERE OMRADE ='" + omradeid + "'" ;
            Start.idb.update(sqlFraga);
            JOptionPane.showMessageDialog(null, "Område chef uppdaterad!");
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_omradechefUpdBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        String valdAdmin = taBortAdminComboBox.getSelectedItem().toString();
        String sqlFraga = "UPDATE AGENT SET ADMINISTRATOR = 'N' WHERE NAMN ='" + valdAdmin + "'";
        Start.idb.update(sqlFraga);
        JOptionPane.showMessageDialog(null, "Agenten är inte längre en Administratör!");
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AagentBox;
    private javax.swing.JComboBox<String> KagentBox;
    private javax.swing.JComboBox<String> OagentBox;
    private javax.swing.JComboBox<String> OmradeBox;
    private javax.swing.JButton adminUpdatteraBtn;
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kontorUppdateraBtn;
    private javax.swing.JButton omradechefUpdBtn;
    private javax.swing.JComboBox<String> taBortAdminComboBox;
    // End of variables declaration//GEN-END:variables
}
