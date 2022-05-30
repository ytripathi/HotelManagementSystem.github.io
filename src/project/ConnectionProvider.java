package project;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionProvider 
{
    public static void main(String args[])
    {
        
    }//main
    public static Connection getCon()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hotel","hotel");
            return con;
        }//try1
        
        catch(Exception e)
        {
             return null;
            //JOptionPane.showMessageDialog(null, e);
        }//catch1
        //return null;
        
    }//ConnectionWithDatabase
    
}//class ConnectionProvider

/*public static void main(String args[])
{
 ConnectionProvider() obj = new ConnectionProvider();
obj.getCon();
}}//main*/
