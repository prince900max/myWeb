/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
            st.executeUpdate("create table notes(Id int NOT NULL auto_increment,user_id int,username varchar(50),email varchar(200),password varchar(20),notes varchar(16000), primary key(Id))");
           
            
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
