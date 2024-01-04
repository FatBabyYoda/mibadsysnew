
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author willi
 */
public class MenyValAlien extends javax.swing.JFrame {

    /**
     * Creates new form MenyValAlien
     */
    public MenyValAlien() {
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

        lbAgent = new javax.swing.JLabel();
        lbInstallningar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbTitel = new javax.swing.JLabel();
        lbTitel1 = new javax.swing.JLabel();
        lbTitel2 = new javax.swing.JLabel();
        lbTitel3 = new javax.swing.JLabel();
        lbTitel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbAgent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/agentLogo2.png"))); // NOI18N
        lbAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbAgentMousePressed(evt);
            }
        });

        lbInstallningar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/SettingsLogo4.png"))); // NOI18N
        lbInstallningar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbInstallningarMousePressed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbTitel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel.setText("Menyval");

        lbTitel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel1.setText("Menu");

        lbTitel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel2.setText("||");

        lbTitel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel3.setText("||");

        lbTitel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel4.setText("選單選擇 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbTitel)
                .addGap(3, 3, 3)
                .addComponent(lbTitel2)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTitel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTitel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbInstallningar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTitel2)
                            .addComponent(lbTitel)
                            .addComponent(lbTitel1)
                            .addComponent(lbTitel3)
                            .addComponent(lbTitel4))))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbInstallningar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbAgentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgentMousePressed
        dispose();
        new AlienOmradesChef().setVisible(true);
    }//GEN-LAST:event_lbAgentMousePressed

    private void lbInstallningarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInstallningarMousePressed
        // Kod för när inställningar logo trycks ned
        dispose();
        new InstallningarAlien().setVisible(true);
    }//GEN-LAST:event_lbInstallningarMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new LoginJFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbAgent;
    private javax.swing.JLabel lbInstallningar;
    private javax.swing.JLabel lbTitel;
    private javax.swing.JLabel lbTitel1;
    private javax.swing.JLabel lbTitel2;
    private javax.swing.JLabel lbTitel3;
    private javax.swing.JLabel lbTitel4;
    // End of variables declaration//GEN-END:variables
}
