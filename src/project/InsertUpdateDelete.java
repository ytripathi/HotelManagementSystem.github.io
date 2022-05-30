package project;

import java.sql.*;
import javax.swing.JOptionPane;

public class InsertUpdateDelete 
{
    public static void setData(String Query,String msg)
    {
        Connection con = null;
        Statement st  = null;

        //create the connection
       try
       {
           con = ConnectionProvider.getCon();
           st = con.createStatement();
           st.executeUpdate(Query);
           if(!msg.equals(""))
               JOptionPane.showMessageDialog(null,msg);
       }//try1
       
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }//catch1
       
       finally
       {
           try
       {}//try2
       
       catch(Exception e)
       {}//catch2
       }//finally1
    }//when ever we will call this method we need to pass the query(sign up page)
}//class for INsertUpdateDelete
