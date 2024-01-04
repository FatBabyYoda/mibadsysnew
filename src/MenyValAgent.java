
import java.awt.event.KeyEvent;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author willi
 */
public class MenyValAgent extends javax.swing.JFrame {
   
 

    /**
     * Creates new form MenyValAgent
  
     */
    public MenyValAgent() {

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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        scrpAlternativ = new javax.swing.JScrollPane();
        lstAlternativ = new javax.swing.JList<>();
        lbTillfallig = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbTitel = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstAlternativ.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. Utrustning", "2. Alien", "3. Agent", "4. Inställningar" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAlternativ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lstAlternativKeyPressed(evt);
            }
        });
        scrpAlternativ.setViewportView(lstAlternativ);

        lbTillfallig.setText("Välj alternativ genom att trycka på enter");

        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbTitel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel.setText("Menyval");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(scrpAlternativ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 97, Short.MAX_VALUE)
                .addComponent(lbTillfallig)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lbTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lbTitel))
                .addGap(33, 33, 33)
                .addComponent(scrpAlternativ, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTillfallig)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //metod för att navigera sig i menyvalen, enter används för att välja alternativ. 
    private void lstAlternativKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstAlternativKeyPressed
        //Använder sig av enter för att välja vilket alternativ i listan, VK ENTER. Kommer vara detsamma för alla andra menyer
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            
        //Härnäst önskar vi att se över vilket alternativ som valts av användaren.
        {
        String valtAlternativ = lstAlternativ.getSelectedValue();
       
        if(valtAlternativ != null){
            switch(valtAlternativ){
                case "1. Utrustning":
                    dispose();
                    new AgentUtrustningVal().setVisible(true);
                    break;
                    
                case "2. Alien":
                    dispose();
                    new AgentAlienVal().setVisible(true);
                    break;
                    
                case "3. Agent":
                    dispose();
                    new OmradeInf().setVisible(true);
                    break;
                    
                    //Nytt fönster för kontoiställningar
                case "4. Inställningar":
                    dispose();
                    new Installningar().setVisible(true);
                    break;
            //Ingen else sats behövs på grund av att användaren inte kan välja alternativ utanför listan.
            }
        }
 
    }
    }//GEN-LAST:event_lstAlternativKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new LoginJFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
  
    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbTillfallig;
    private javax.swing.JLabel lbTitel;
    private javax.swing.JList<String> lstAlternativ;
    private javax.swing.JScrollPane scrpAlternativ;
    // End of variables declaration//GEN-END:variables
}
