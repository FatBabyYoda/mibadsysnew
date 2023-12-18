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
    private static InfDB idb;
    public static void main(String args[])
  {
    try
        {
              idb = new InfDB("mibdb", "3306", "mibdba","mibkey");
        }
        catch(Exception undatag)
                {
                    JOptionPane.showMessageDialog(null, "nåt gick fel");
                    System.out.println(undatag);
                }
      
   
    new LoginJFrame(idb).setVisible(true);       
  }
}
