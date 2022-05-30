package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class Select
{
    public static ResultSet getData(String Query)
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            rs = st.executeQuery(Query);
            return rs;
        }//try1
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }//catch1
        
        
    }//
}//code for selecting data from LOGIN page
