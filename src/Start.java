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
    //deklarerar variabler som kommer hänga med i hela användningen av programmet
    public static InfDB idb;
    public static String epost;
    public static boolean admincheck;
    public static void main(String args[])
  {
    //skapar uppkopplingen till databasen i variablen idb
    try 
        {
              idb = new InfDB("mibdb", "3306", "mibdba","mibkey");
        }
        catch(InfException undatag)
                {
                    JOptionPane.showMessageDialog(null, "nåt gick fel");
                    System.out.println(undatag);
                }
      
                
                //öppnar start fönstrer för programmet
                new LoginJFrame().setVisible(true);

  }
}
