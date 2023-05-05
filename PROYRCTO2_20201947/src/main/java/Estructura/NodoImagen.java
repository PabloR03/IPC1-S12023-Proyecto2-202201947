package Estructura;
import com.mycompany.proyrcto2_20201947.Imagen;

/**
 *
 * @author Pablo Rodriguez
 */
public class NodoImagen {
    private Imagen Foto;
    private NodoImagen Siguiente;
    private NodoImagen Anterior;
    
public NodoImagen(Imagen Foto, NodoImagen Siguiente, NodoImagen Anterior) {
        this.Foto = Foto;
        this.Siguiente = Siguiente;
        this.Anterior = Anterior;
    }
public NodoImagen(Imagen Foto){
        this.Foto=Foto; 
    }

    public Imagen getFoto() {
        return Foto;
    }

    public void setFoto(Imagen Foto) {
        this.Foto = Foto;
    }

    public NodoImagen getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoImagen Siguiente) {
        this.Siguiente = Siguiente;
    }

    public NodoImagen getAnterior() {
        return Anterior;
    }

    public void setAnterior(NodoImagen Anterior) {
        this.Anterior = Anterior;
    }

    
}
