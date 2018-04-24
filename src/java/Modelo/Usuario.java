package Modelo;

/**
 *
 * @author CAMILO   
 */
//
public class Usuario {
    String nombres;
    String correo;
    String nickname;
    String contraseña;
    
    
    public Usuario(){
        nombres="";
        correo="";
        nickname="";
        contraseña="";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
