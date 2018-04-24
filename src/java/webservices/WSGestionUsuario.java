package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Modelo.*;

/**
 *
 * @author CAMILO
 */
@WebService(serviceName = "WSGestionUsuario")
public class WSGestionUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Validar")
    public Usuario Validar
        (@WebParam(name = "nickname") String nickname,
        @WebParam(name = "pass") String pass) {
        UsuarioDAO usua = new UsuarioDAO();
        Usuario usuario = usua.verificaUsuario(nickname, pass);
        return usuario;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Registrar")
    public String Registrar
        (@WebParam(name = "nombres") String nombres,
        @WebParam(name = "correo") String correo,
        @WebParam(name = "nickaname") String nickname,
        @WebParam(name = "pass") String pass) {
        UsuarioDAO usua = new UsuarioDAO();
        String respuesta = usua.registraUsuario(nombres, correo, nickname, pass);
        return respuesta;
    }
}
