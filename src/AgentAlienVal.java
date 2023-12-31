/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author willi
 */
public class AgentAlienVal extends javax.swing.JFrame {

    /**
     * Creates new form AgentAlienVal
     */
    public AgentAlienVal() {
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

        lbTitel1 = new javax.swing.JLabel();
        cbAlternativ2 = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel1.setText("Alien val");

        cbAlternativ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nyregistrera", "Uppdatera", "Sök", "Filtrera" }));
        cbAlternativ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlternativ2ActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnAvbryt.setForeground(new java.awt.Color(255, 0, 0));
        btnAvbryt.setText("Tillbaka");
        btnAvbryt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAvbrytMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvbryt))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(cbAlternativ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOK)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbTitel1))
                    .addComponent(btnAvbryt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlternativ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlternativ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlternativ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlternativ2ActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        switch(cbAlternativ2.getSelectedItem().toString())
        { 
            case "Nyregistrera":
            dispose();
            new NyregistreraAlien().setVisible(true);
            break;

            case "Uppdatera":
            dispose();
            new AndraAlienInfoAgent().setVisible(true);
            break;
            
            case "Sök":
            dispose();
            new InformationAlien().setVisible(true);
            break;
            
            case "Filtrera":
            dispose();
            new AgentAlienListor().setVisible(true);
            break;
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnAvbrytMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvbrytMousePressed
        dispose();
        new MenyValAgent().setVisible(true);
    }//GEN-LAST:event_btnAvbrytMousePressed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cbAlternativ2;
    private javax.swing.JLabel lbTitel1;
    // End of variables declaration//GEN-END:variables
}
