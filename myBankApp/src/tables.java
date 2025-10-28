
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class tables {
     public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
        try
        {
            //code to automatically create tables in mysql workbench database
            con =(Connection) ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table tavrince_table(Id int NOT NULL auto_increment, firstName varchar(50), lastName varchar(50), gender varchar(20), phone decimal(12),address varchar(100), password varchar(200),balance int(100), primary key(Id))");
         
            
            JOptionPane.showMessageDialog(null, "Table created succesfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(Exception e)
            {}
        }
        
        
    }
    
}
