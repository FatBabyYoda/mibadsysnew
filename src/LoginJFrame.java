

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
public class LoginJFrame extends javax.swing.JFrame {
    
    

    /**
     * Creates new form NewJFrame
     */
    public LoginJFrame() {
        initComponents();
         //this.idb = idb;
             //idb = new InfDB("mibdb", "3306", "mibdba","mibkey");

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        epostLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        epostTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        agentElAlienComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        epostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        epostLabel.setText("E-post");

        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password");

        epostTextField.setSize(new java.awt.Dimension(90, 20));
        epostTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                epostTextFieldKeyReleased(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.setAlignmentY(0.0F);
        loginButton.setEnabled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordField.setSize(new java.awt.Dimension(90, 20));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });

        agentElAlienComboBox.setMaximumRowCount(2);
        agentElAlienComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent", "Alien" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(epostTextField)
                                .addComponent(epostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(226, 226, 226))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(agentElAlienComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(agentElAlienComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epostLabel)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(epostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(loginButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
    loginmethod();
    }//GEN-LAST:event_loginButtonActionPerformed
    
    
    private void loginmethod()
    {
        try
        {
            
       String Losen = Start.idb.fetchSingle("select Losenord from "+ agentElAlienComboBox.getSelectedItem().toString() + " where Epost = '" + epostTextField.getText().toLowerCase() +"'");

            if(Losen == null)
            {
                JOptionPane.showMessageDialog(null, "Användaren finns ej");
            
            }
            else
            {
                if (Losen.equals(new String(passwordField.getPassword())))
            {
                JOptionPane.showMessageDialog(null, "Inloggad");
                
                switch(agentElAlienComboBox.getSelectedItem().toString())
                {
                    case "Agent":
                        // öppna ny jfram med nästa del av programmet här
                        if (Start.idb.fetchSingle("select Administrator from Agent where Epost = '" + epostTextField.getText().toLowerCase() +"'").equals("J"))
                        {
                           Start.epost =  epostTextField.getText().toLowerCase();
                        new MenyValAdmin().setVisible(true);
                        break;
                        }
                        else
                        {
                               System.out.println("not admin");
                               Start.epost =  epostTextField.getText().toLowerCase();
                               new MenyValAgent().setVisible(true);
                               
                        }

                                
                        //dispose();
                        break;
                    case "Alien":
                        Start.epost =  epostTextField.getText().toLowerCase();
                        new MenyValAlien().setVisible(true);
                        break;
                        
                }
                
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Fel lösenord");
            }
            }
            
        }
        catch(InfException undatag)
                {
                    JOptionPane.showMessageDialog(null, "Något gick fel");
                    System.out.println(undatag);
                }
    }
    private void epostTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_epostTextFieldKeyReleased
       if (epostTextField.getText().contains("@") && epostTextField.getText().contains(".") && !(passwordField.getPassword().length == 0)) 
        {
            loginButton.setEnabled(true);
        }
        if (!epostTextField.getText().contains("@") || !epostTextField.getText().contains(".") || passwordField.getPassword().length == 0) 
        {
            loginButton.setEnabled(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_epostTextFieldKeyReleased

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
        // TODO add your handling code here:
        if (epostTextField.getText().contains("@") && epostTextField.getText().contains(".") && !(passwordField.getPassword().length == 0))
        {
            loginButton.setEnabled(true);
        }
        if (!epostTextField.getText().contains("@") || !epostTextField.getText().contains(".") || passwordField.getPassword().length == 0) 
        {
            loginButton.setEnabled(false);
        }    
    }//GEN-LAST:event_passwordFieldKeyReleased

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
      loginmethod();

    }//GEN-LAST:event_passwordFieldActionPerformed

    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agentElAlienComboBox;
    private javax.swing.JLabel epostLabel;
    private javax.swing.JTextField epostTextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
