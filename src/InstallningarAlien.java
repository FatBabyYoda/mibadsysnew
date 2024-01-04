
import oru.inf.InfException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author willi
 */
public class InstallningarAlien extends javax.swing.JFrame {

    /**
     * Creates new form InstallningarAlien
     */
    public InstallningarAlien() {
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

        lbTitel = new javax.swing.JLabel();
        lbNamnTitel = new javax.swing.JLabel();
        lbNamn = new javax.swing.JLabel();
        lbTelefonTitel = new javax.swing.JLabel();
        lbTelefon = new javax.swing.JLabel();
        lbEpostTitel = new javax.swing.JLabel();
        lbEpost = new javax.swing.JLabel();
        lbLosenTitel = new javax.swing.JLabel();
        lbLösenord = new javax.swing.JLabel();
        btnAndraLosen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTitel.setText("Inställningar");

        lbNamnTitel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNamnTitel.setText("Namn:");

        lbNamn.setText("jLabel1");
        //hämtar agent namnet
        try{
            String getNamn = Start.idb.fetchSingle("SELECT NAMN from alien where Epost ='" + Start.epost + "'");
            lbNamn.setText(getNamn);
        }
        catch(InfException e)
        {
            System.out.println (e);
        }

        lbTelefonTitel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTelefonTitel.setText("Telefonnummer:");

        lbTelefon.setText("jLabel2");
        //Hämta telefonnummer från databasen
        try{
            String getTelefon = Start.idb.fetchSingle("SELECT Telefon from alien where Epost ='" + Start.epost + "'");
            lbTelefon.setText(getTelefon);
        }
        catch(InfException e)
        {
            System.out.println (e);
        }

        lbEpostTitel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEpostTitel.setText("E-post:");

        lbEpost.setText("jLabel3");
        //Hämta epost
        try{
            String getEpost = Start.idb.fetchSingle("SELECT Epost from alien where Epost ='" + Start.epost + "'");
            lbEpost.setText(getEpost);
        }
        catch(InfException e)
        {
            System.out.println (e);
        }

        lbLosenTitel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbLosenTitel.setText("Lösenord:");

        lbLösenord.setText("jLabel4");
        //Hämta lösenord
        try{
            String getLosenord = Start.idb.fetchSingle("SELECT Losenord from alien where Epost ='" + Start.epost + "'");
            lbLösenord.setText(getLosenord);
        }
        catch(InfException e)
        {
            System.out.println (e);
        }

        btnAndraLosen.setText("Ändra lösenord");
        btnAndraLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAndraLosenMousePressed(evt);
            }
        });

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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbTelefonTitel)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbLosenTitel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(lbNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTelefon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbEpost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbLösenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(btnAndraLosen))
                        .addComponent(lbNamnTitel)
                        .addComponent(lbEpostTitel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbTitel))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNamnTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNamn)
                .addGap(30, 30, 30)
                .addComponent(lbTelefonTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTelefon)
                .addGap(30, 30, 30)
                .addComponent(lbEpostTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEpost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lbLosenTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLösenord)
                    .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraLosenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAndraLosenMousePressed
        new AndraLosenordAlien().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAndraLosenMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new MenyValAlien().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbEpost;
    private javax.swing.JLabel lbEpostTitel;
    private javax.swing.JLabel lbLosenTitel;
    private javax.swing.JLabel lbLösenord;
    private javax.swing.JLabel lbNamn;
    private javax.swing.JLabel lbNamnTitel;
    private javax.swing.JLabel lbTelefon;
    private javax.swing.JLabel lbTelefonTitel;
    private javax.swing.JLabel lbTitel;
    // End of variables declaration//GEN-END:variables
}
