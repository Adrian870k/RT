package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class conexion {

    static Connection con = null;
    static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    static String url = "jdbc:ucanaccess://C:\\Users\\hp\\Desktop\\RT.accdb";
    
    
    public static Connection obtenConnection() {
        try {
            
            if(con == null){
            Class.forName(driver);          
            con = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "conectado");
                
            }
        } catch (Exception e) {
            System.out.println(e);
            con = null;
        }
        return con;
    }
     public static void main(String[] args) throws SQLException {
        Connection pruebaCon = conexion.obtenConnection();
        
        
        
}
}

