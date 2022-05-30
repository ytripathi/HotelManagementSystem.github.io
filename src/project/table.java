package project;

import java.sql.*;
import javax.swing.JOptionPane;

public class table
{
    public static void main(String args[])
    {
        Connection con = null;
        Statement st = null;
        
        try
        {
            con = ConnectionProvider.getCon();//call the ConnectionProvider class created earlier
            st = con.createStatement();//create statement 0bject
            st.executeQuery("select * from users ");
            st.executeQuery("select * from room ");     
            st.executeQuery("select * from CUSTOMER ");
            JOptionPane.showMessageDialog(null,"Table created successfully");
        }//try1 Codes to create the table
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }//catch2
        
        finally
        {
            try
             {
                 con.close();
                 st.close();
             }//try2 Close the Connection
            catch(Exception e)
             {}//catch2
        }//finally
    }//main
}//class table for database
