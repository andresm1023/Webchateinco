package Modelo;
import java.sql.*;

public class Conexion {
    public Conexion() {
    }

    public Connection getConexion(){
        Connection con=null;
        try{
            /* Carga|Registra el driver JDBC */
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            /* Obtener la conexion */
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba","root","");
        }catch(SQLException ex){
        }catch(Exception e){   
        }
        return con;
    } 
}

