/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    
  Connection con=null;
  
    public Connection conexion(){
    try{
        
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/linea","root","");
        
    
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"ERROR DE CONEXION"+e);
        con=null;
    }
    return con;
    }
}
