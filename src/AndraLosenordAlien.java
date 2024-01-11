
import java.util.Arrays;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author willi
 */
public class AndraLosenordAlien extends javax.swing.JFrame {

    /**
     * Creates new form AndraLosenordAlien
     */
    public AndraLosenordAlien() {
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

        lbNyttTitel = new javax.swing.JLabel();
        lbUpprepaTitel = new javax.swing.JLabel();
        pfUpprepa = new javax.swing.JPasswordField();
        pfNytt = new javax.swing.JPasswordField();
        btnSpara = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        lbTitel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNyttTitel.setText("Nytt lösenord");

        lbUpprepaTitel.setText("Upprepa lösenordet");

        btnSpara.setText("Spara");
        btnSpara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSparaMousePressed(evt);
            }
        });

        btnAvbryt.setText("Avbryt");
        btnAvbryt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAvbrytMousePressed(evt);
            }
        });

        lbTitel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel1.setText("Ändra lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNyttTitel)
                            .addComponent(btnSpara, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pfNytt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAvbryt)
                            .addComponent(lbUpprepaTitel)
                            .addComponent(pfUpprepa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lbTitel1)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitel1)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNyttTitel)
                    .addComponent(lbUpprepaTitel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfNytt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfUpprepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpara)
                    .addComponent(btnAvbryt))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSparaMousePressed
    if(Validring.finnsText(pfNytt))
        {
            andraLosenord();
        }
    }//GEN-LAST:event_btnSparaMousePressed

    private void btnAvbrytMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvbrytMousePressed
        dispose();
        new InstallningarAlien().setVisible(true);
    }//GEN-LAST:event_btnAvbrytMousePressed
    
    private void andraLosenord()
    {   
        //Sparar lösenordet i en Sträng
         String losenordStr = new String(pfNytt.getPassword());


        //Härnäst jämför vi vad som skrivits in i lösenordfältet, samt säkerställer att det är inom den tillåtna längden
        if (Arrays.equals(pfNytt.getPassword(), pfUpprepa.getPassword()) && Validring.rattLangd(pfNytt, 6)){

            //Uppdatera lösenordet utifrån vad som skrevs in i pfNytt
            try{
                Start.idb.update("Update alien set Losenord= '" + losenordStr + "' where Epost ='" + Start.epost + "'");

            }
            catch(InfException e){
                System.out.println(e);
            }
            JOptionPane.showMessageDialog(null, "Ditt lösenord är nu uppdaterat!");
            dispose();
            new InstallningarAlien().setVisible(true);
        }

        //Felmeddelande om lösnorden inte är korrekta
        else if(!Arrays.equals(pfNytt.getPassword() ,pfUpprepa.getPassword()))
            {
            JOptionPane.showMessageDialog(null, "Lösenorden stämmer inte överens!");
            }
    }
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnSpara;
    private javax.swing.JLabel lbNyttTitel;
    private javax.swing.JLabel lbTitel1;
    private javax.swing.JLabel lbUpprepaTitel;
    private javax.swing.JPasswordField pfNytt;
    private javax.swing.JPasswordField pfUpprepa;
    // End of variables declaration//GEN-END:variables
}
