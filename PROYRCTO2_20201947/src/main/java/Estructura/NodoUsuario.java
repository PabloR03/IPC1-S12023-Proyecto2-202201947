package Estructura;
import com.mycompany.proyrcto2_20201947.Usuario;
/**
 *
 * @author Pablo Rodriguez
 */
public class NodoUsuario {
    private Usuario UsuarioNuevo;
    private NodoUsuario UsuarioSiguiente;

    public Usuario getUsuarioNuevo() {
        return UsuarioNuevo;
    }

    public void setUsuarioNuevo(Usuario UsuarioNuevo) {
        this.UsuarioNuevo = UsuarioNuevo;
    }

    public NodoUsuario getUsuarioSiguiente() {
        return UsuarioSiguiente;
    }

    public void setUsuarioSiguiente(NodoUsuario UsuarioSiguiente) {
        this.UsuarioSiguiente = UsuarioSiguiente;
    }
    //Contructor Usuario
    public NodoUsuario(Usuario UsuarioNuevo) {
        this.UsuarioNuevo = UsuarioNuevo;
    }
}