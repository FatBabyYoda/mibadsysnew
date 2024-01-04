
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class RegistreraNyUtrustning extends javax.swing.JFrame {

    /**
     * Creates new form RegistreraNyUtrustning
     */
    public RegistreraNyUtrustning() {
        initComponents();
        
        try {
            String benamning = txtFieldBenamning.getText();
            String id = Start.idb.getAutoIncrement("utrustning", "Utrustnings_id");
            
            if (id == null) {
                id = "1";
            }
            txtFieldId.setText(id);
        } catch (InfException e){
            JOptionPane.showMessageDialog(this, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        lblBenamning = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldBenamning = new javax.swing.JTextField();
        txtFieldId = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        regBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Registrera ny utrustning");

        lblBenamning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBenamning.setText("Benämning:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Utrustnings-ID:");

        txtFieldId.setEditable(false);

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backBtn.setText("Tillbaka");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backBtnMousePressed(evt);
            }
        });

        regBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regBtn.setText("Registrera");
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblBenamning)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        // TODO add your handling code here:
        
        try {
        String benamning = txtFieldBenamning.getText();


        String fraga = "INSERT INTO utrustning (Utrustnings_ID, Benamning) VALUES (" + txtFieldId.getText() + ", '" + benamning + "')";

        Start.idb.insert(fraga);

        txtFieldBenamning.setText("");
        txtFieldId.setText("");
        
        String maxIdFraga = "SELECT MAX(Utrustnings_ID) AS MaxID FROM utrustning";
        String maxId = Start.idb.fetchSingle(maxIdFraga);

        if (maxId == null) {
            maxId = "1";
        }
        
        txtFieldId.setText(maxId);
        
        JOptionPane.showMessageDialog(this, "Utrustningen har registrerats!");

    } catch(InfException e) {
        JOptionPane.showMessageDialog(null, "Nåt gick fel!");
        System.out.println("Internt felmeddelande:" + e.getMessage());
    }
         
    }//GEN-LAST:event_regBtnActionPerformed

    private void backBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMousePressed
        dispose();
        new AgentUtrustningVal().setVisible(true);
    }//GEN-LAST:event_backBtnMousePressed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBenamning;
    private javax.swing.JButton regBtn;
    private javax.swing.JTextField txtFieldBenamning;
    private javax.swing.JTextField txtFieldId;
    // End of variables declaration//GEN-END:variables
}
