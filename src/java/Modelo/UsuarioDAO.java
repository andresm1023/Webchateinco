package Modelo;
import java.sql.*;
/**
 *
 * @author CAMILO
 */
public class UsuarioDAO {
    Conexion conexion;
    private Usuario usuario;
    
    public UsuarioDAO(){
        conexion = new Conexion();
    }


    public Usuario verificaUsuario(String nickname, String contraseña){
        Usuario usuario=null;
        Connection accesoDB = conexion.getConexion();
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from usuario where nickname=? and pass=?");
            ps.setString(1, nickname);
            ps.setString(2, contraseña);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               usuario = new Usuario();
               usuario.setNombres(rs.getString(1));
               usuario.setCorreo(rs.getString(2));
               usuario.setNickname(rs.getString(3));
               usuario.setContraseña(rs.getString(4));
               return usuario;
            }
        } catch (Exception e) {
        }
        return usuario;
    }
    
    public String registraUsuario(String nombres, String correo, String nickname, String pass){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("insert into usuario(nombres,correo,nickname,pass) values (?,?,?,?)");
            ps.setString(1, nombres);
            ps.setString(2, correo);
            ps.setString(3, nickname);
            ps.setString(4, pass);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        } catch (Exception e) {
        }
        return respuesta;
    }
}
