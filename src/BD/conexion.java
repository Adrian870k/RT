package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class conexion {

    private static Connection con;

    
    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String user = "usuarioejemplo";
            String pass = "pablo";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", user, pass);
            
        } catch (Exception e) {
            System.out.println(e);
            con = null;
        }
        return con;
    }
     public static void main(String[] args) throws SQLException {
        Connection pruebaCon = conexion.getConnection();
        
        if (pruebaCon != null) {
            PreparedStatement ps;
            //Emnpezamos Listando los Datos de la Tabla Usuario
            Statement stm = getConnection().createStatement();
            
        //    stm.executeQuery("delete from usuarios WHERE ID = '2'");
//            stm.executeQuery("INSERT INTO usuarios VALUES ('1','ANDRES_VETULIO','ABC123','ADMIN')");
//            stm.executeQuery("INSERT INTO usuarios VALUES ('2','CARLOS_MAURICIO','ABC123','ADMIN')");
            ResultSet rst = stm.executeQuery("select * from usuarios");
             //rst = stm.executeQuery("select *from usuarios");
            
            
            while (rst.next()) {     
                int a = rst.getInt(1);
                String b = rst.getString(2);
                String c = rst.getString(3);
                String d = rst.getString(4);
                System.out.println("ID: "+a+" NOMBRE: "+b+" CLAVE: "+c+" Rol: "+d);
                
            
            }
           
//            ResultSet rs;
//            smt = con.createStatement();
//            rs = smt.executeQuery("select * from usuarios");
//            System.out.println(smt.executeQuery("select * from usuarios"));
//            System.out.println("Conectado");
//            System.out.println("" + pruebaCon);
            
        } else {
            System.out.println("Desconectado");
        }
        
    }
     static void insertarUsuario(int id,String nombre, String clave, String rol) throws SQLException{
         Statement stm = conexion.getConnection().createStatement();
         
         //stm.executeQuery("INSERT INTO usuarios VALUES ('"+id+"','"+nombre+"','"+clave+"','"+rol+"')");
                
            }
}

