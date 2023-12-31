
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
public class NyregistreraAlien extends javax.swing.JFrame {

    /**
     * Creates new form NyregistreraAlien
     */
    public NyregistreraAlien() {
        initComponents();
        fyllHittaAgentCombobox();
        fyllHittaPlatsCombobox();
    }
    //hämtar och fyller comboboxen med alla agenter
    private void fyllHittaAgentCombobox() {
        try
        {
            ArrayList<String> AgentLista = Start.idb.fetchColumn("SELECT NAMN FROM AGENT");
            for(String i: AgentLista){
            cbAnsvAgnt.addItem(i);    
        }
            }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
                }  
            }
    //hämtar och fyller comboboxen med alla platser
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReg = new javax.swing.JButton();
        cbPlats = new javax.swing.JComboBox<>();
        cbAnsvAgnt = new javax.swing.JComboBox<>();
        tfTelefon = new javax.swing.JTextField();
        tfNamn = new javax.swing.JTextField();
        tfEpost = new javax.swing.JTextField();
        pfLosen = new javax.swing.JPasswordField();
        pfLosenUpp = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();
        lbTitel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReg.setText("Registrera");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        jLabel1.setText("Namn");

        jLabel2.setText("Plats");

        jLabel3.setText("Upprepa Lösenord");

        jLabel4.setText("Epost");

        jLabel5.setText("Telefon");

        jLabel6.setText("Ansvarig agent");

        jLabel7.setText("Lösenord");

        btnAvbryt.setForeground(new java.awt.Color(255, 0, 0));
        btnAvbryt.setText("Tillbaka");
        btnAvbryt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAvbrytMousePressed(evt);
            }
        });

        lbTitel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel1.setText("Registrera ny alien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbAnsvAgnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfLosenUpp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfLosen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(94, 94, 94))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReg)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvbryt))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAvbryt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(pfLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(pfLosenUpp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnReg)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAnsvAgnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        if (!Validring.finnsEpostenRedan(tfEpost.getText())&& Validring.finnsText(tfEpost)) {
          
        
        try {
            // TODO add your handling code here:
            //skapar ett nytt id för den nya alien
            String nyttId = Start.idb.getAutoIncrement("alien","Alien_id");
        // tar fram dagens datum
        Date dagensDatum = new Date();
         //skapar fromat för datumet
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //fromaterar datumet
        String datum = format.format(dagensDatum);
        //System.out.println(datum);
       
        //kollar satt alla rutor har fyllts i
        if (!Validring.tomTextPassFields(pfLosen, tfEpost,tfNamn,tfTelefon) && Arrays.equals(pfLosen.getPassword() ,pfLosenUpp.getPassword()) && Validring.rattLangd(pfLosen, 6))
        {
            
            //sätter variabler till vädren som ska in i databasen och insertar dom till databasen
            String plats = Start.idb.fetchSingle("select Omrades_ID from omrade where Benamning = "+"'"+cbPlats.getSelectedItem().toString()+"'");
            String ansAgent = Start.idb.fetchSingle("select Agent_ID from Agent where Namn = "+"'"+cbAnsvAgnt.getSelectedItem().toString()+"'");
            String Epost = tfEpost.getText();
            String Losen = new String(pfLosen.getPassword());
            String namn = tfNamn.getText();
            String Telefon = tfTelefon.getText();
            Start.idb.insert("insert into alien values ("+nyttId + ",'"+
                    datum +
                    "','"+Epost+"',"+
                    "'"+Losen+"',"+
                    "'"+namn+"',"+
                    "'"+Telefon+"',"+
                    plats+","+
                    ansAgent+")");
                        JOptionPane.showMessageDialog(null, "Alien tillagd");

        }
        else if(!Arrays.equals(pfLosen.getPassword() ,pfLosenUpp.getPassword()))
        {
        JOptionPane.showMessageDialog(null, "Lösenorden matchar ej");

        }
        }
        catch (InfException e)
                    {
                        System.out.println(e);
                    }
        }
        
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnAvbrytMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvbrytMousePressed
        //Kör metoden checkAdmin() för att se vilken meny som ska öppnas härnäst
        String adminStatus = checkAdmin();
        if(adminStatus.equals("J"))
        {
            dispose();
            new AdminAlienVal().setVisible(true);
        }
        
        
        else{
            dispose();
            new AgentAlienVal().setVisible(true);
        }
        
    }//GEN-LAST:event_btnAvbrytMousePressed
    //KOD FÖR ATT SE OM ANVÄNDAREN ÄR EN ADMIN ELLER EJ
    private String checkAdmin()
    {
        try
        {
           String hamtaStatus = Start.idb.fetchSingle("SELECT administrator from agent where Epost ='" + Start.epost + "'");
           return hamtaStatus;
        }
        
        catch(InfException e)
        {
            System.out.println(e);
            return null;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox<String> cbAnsvAgnt;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbTitel1;
    private javax.swing.JPasswordField pfLosen;
    private javax.swing.JPasswordField pfLosenUpp;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfNamn;
    private javax.swing.JTextField tfTelefon;
    // End of variables declaration//GEN-END:variables
}
