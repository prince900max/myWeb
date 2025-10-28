
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ConnectionProvider {
        public static Connection getCon(){
  Connection con = null;
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    //use this line of code foe mysql in xamp "jdbc:mysql://127.0.0.1:3306/login_table
    
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tavrince_db","root","123456");
    
}catch (ClassNotFoundException | SQLException e) {
System.out.println(e);


} 
return con;
    }
    
}
