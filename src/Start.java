/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author lucasandersson
 */


public class Start {
    public static InfDB idb;
    public static String epost;
    public static void main(String args[])
  {
    try
        {
              idb = new InfDB("mibdb", "3306", "mibdba","mibkey");
        }
        catch(InfException undatag)
                {
                    JOptionPane.showMessageDialog(null, "nåt gick fel");
                    System.out.println(undatag);
                }
      
   
//<<<<<<< Updated upstream
  // new NyregistreraAlien().setVisible(true);       
//=======

    //new LoginJFrame().setVisible(true);
    //new LaggTillAgent().setVisible(true);
    //////////////////new LoginJFrame().setVisible(true);
   //new uppdateraAgentAdmin().setVisible(true);
   //new LoginJFrame().setVisible(true);
   new InformationAgent().setVisible(true);
  
    //=======
  //  new LoginJFrame().setVisible(true);
    //<<<<<<< HEAD
    //=======
  //new LoginJFrame().setVisible(true);
//>>>>>>> c8b79251592eb481380b29977e8cd4a471596599
  
 
   // >>>>>>> e2e026212148600ccbdb62ee694a29ed8a85de09
//>>>>>>> Stashed changes
    
  }
}
