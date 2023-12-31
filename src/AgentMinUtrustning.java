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
 * @author willi
 */
public class AgentMinUtrustning extends javax.swing.JFrame {

    /**
     * Creates new form AgentMinUtrustning
     */
    public AgentMinUtrustning() {
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

        btnSok = new javax.swing.JButton();
        cbAlternativ = new javax.swing.JComboBox<>();
        lbTitel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taUtrustning = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSok.setText("Sök");
        btnSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSokMousePressed(evt);
            }
        });

        cbAlternativ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All utrustning", "Min utrustning" }));

        lbTitel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitel.setText("Utrustning");

        taUtrustning.setEditable(false);
        taUtrustning.setColumns(20);
        taUtrustning.setRows(5);
        jScrollPane2.setViewportView(taUtrustning);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSok)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(cbAlternativ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitel)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbAlternativ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnSok)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSokMousePressed
       //Rensa textfältet innan sökning
        taUtrustning.setText("");
//För denna metod önskar vi att hämta objektet från vår Combobox, därefter konvertera det till en string och sedan utföra kod
        switch(cbAlternativ.getSelectedItem().toString()){
          //Alternativ för att visa all utrustning
            case "All utrustning":
              visaAllUtrustning();
              break;
              
            //Alternativ för att visa agentens egna utrustning
          case "Min utrustning":
              visaMinUtrustning();
              break;
      }
    }//GEN-LAST:event_btnSokMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       new MenyValAgent().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    //Metod för att visa alla utrustning som finns i databasen
    private void visaAllUtrustning()
    {
       try{
              //Här vill vi hämta alla rader från databasen, detta lagras i en ArrayList som lagrar en hashmap
              ArrayList<HashMap<String, String>> listaUtrustning = Start.idb.fetchRows("Select * from utrustning");
              //Här används en for each loop för att gå igenom hashmapen i listan som skapats
              for(HashMap <String, String> utrustning : listaUtrustning){
                 
               laggTillText(utrustning);
              }
              }
              
              catch(InfException e)
              {
                  JOptionPane.showMessageDialog(null, "Något gick fel!");
              } 
    }
    
    //Metod för att visa agentens utrustning
    private void visaMinUtrustning()
    {
        try{
                  ArrayList<HashMap<String, String>> listaMinUtrustning = Start.idb.fetchRows("SELECT * FROM utrustning " +
                          "JOIN innehar_utrustning ON utrustning.Utrustnings_ID = innehar_utrustning.Utrustnings_ID " +
                          "JOIN agent ON innehar_utrustning.Agent_ID = agent.Agent_ID " +
                          "WHERE agent.Epost = '" + Start.epost + "'");
                  for(HashMap <String, String> minUtrustning : listaMinUtrustning){
                  
                  laggTillText(minUtrustning);
                  }
                      
              }
              catch(InfException e)
              {
                  JOptionPane.showMessageDialog(null, "Något gick fel!");
              }
    }
    //Metod för att lägga till texten i Text Arean utan att behöva upprepa koden
    private void laggTillText(HashMap<String, String> utrustning)
    {
        String id = utrustning.get("Utrustnings_ID");
        String benamning = utrustning.get("Benamning");
        taUtrustning.append(id + ": " + benamning + "\n");
    }
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JComboBox<String> cbAlternativ;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTitel;
    private javax.swing.JTextArea taUtrustning;
    // End of variables declaration//GEN-END:variables
}
