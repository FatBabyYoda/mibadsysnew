
import oru.inf.InfException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author willi
 */
public class AlienOmradesChef extends javax.swing.JFrame {

    /**
     * Creates new form AlienOmradesChef
     */
    public AlienOmradesChef() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAgentNamn = new javax.swing.JLabel();
        lbInfoTitel = new javax.swing.JLabel();
        lbTelTitel = new javax.swing.JLabel();
        lbAgentTel = new javax.swing.JLabel();
        lbMailTitel = new javax.swing.JLabel();
        lbAgentMail = new javax.swing.JLabel();
        lbTitel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbAgentNamn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAgentNamn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/agentLogo2.png"))); // NOI18N
        lbAgentNamn.setText("Agent 1");
        //Följande kod upprepas längre ned fast att vi hämtar olika information, detta görs genom en join

        try{
            String getNamn = Start.idb.fetchSingle("SELECT agent.namn from agent join Alien on Agent_ID = Ansvarig_agent where Alien.Epost ='" + Start.epost + "'");
            lbAgentNamn.setText(getNamn);
        }
        catch(InfException e)
        {
            System.out.println (e);
        }

        lbInfoTitel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbInfoTitel.setText("Information:");

        lbTelTitel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTelTitel.setText("Telefonnummer:");

        lbAgentTel.setText("00000000000");
        try{
            String getTelefon = Start.idb.fetchSingle("SELECT agent.telefon from agent join Alien on Agent_ID = Ansvarig_agent where Alien.Epost ='" + Start.epost + "'");
            lbAgentTel.setText(getTelefon);
        }
        catch(InfException e)
        {
            System.out.println (e);
        }

        lbMailTitel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMailTitel.setText("Mailadress:");

        lbAgentMail.setText("xxx@epost.se");
        try{
            String getMail = Start.idb.fetchSingle("SELECT agent.epost from agent join Alien on Agent_ID = Ansvarig_agent where Alien.Epost ='" + Start.epost + "'");
            lbAgentMail.setText(getMail);
        }
        catch(InfException e)
        {
            System.out.println (e);
        }

        lbTitel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel.setText("Områdeschef");

        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbInfoTitel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbMailTitel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTelTitel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAgentTel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAgentMail, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(179, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitel)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbInfoTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelTitel)
                    .addComponent(lbAgentTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMailTitel)
                    .addComponent(lbAgentMail))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new MenyValAlien().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbAgentMail;
    private javax.swing.JLabel lbAgentNamn;
    private javax.swing.JLabel lbAgentTel;
    private javax.swing.JLabel lbInfoTitel;
    private javax.swing.JLabel lbMailTitel;
    private javax.swing.JLabel lbTelTitel;
    private javax.swing.JLabel lbTitel;
    // End of variables declaration//GEN-END:variables
}
