
package CONFIG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config {
    
    Connection con;
    
    public config(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/usuario","root","");   
            System.out.println("Conectado");
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("No conectado");
        }
}
    
    public Connection getConnection(){
        return con;
    }
    
}
