/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CertGen;
import java.sql.*;

/**
 *
 * @author Madhavi
 */
public class Main {
    public static Connection getConnection() throws SQLException
    {
        Connection con = null;
        try{
        
             Class.forName("com.mysql.cj.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Certificate","root","");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
        return con;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
             @Override
             public void run() {
             }
        });
          
    }
}
