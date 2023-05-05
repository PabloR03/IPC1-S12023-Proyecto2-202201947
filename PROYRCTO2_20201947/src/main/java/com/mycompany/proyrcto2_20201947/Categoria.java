package com.mycompany.proyrcto2_20201947;

import Estructura.ListaDoble;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Pablo Rodriguez
 */
public class Categoria {

    private String NombreCategoria;
    private ListaDoble listaImagen= new ListaDoble();
    //Funciones
    public void ImprimirImagenes() {
      listaImagen.Imprimir();
    }
    public void SiguienteImagen(JLabel NombreImagen, JLabel ImagenLBL){
        listaImagen.Siguiente(NombreImagen, ImagenLBL);
    }
    public void AnteriorImagen(JLabel NombreImagen, JLabel ImagenLBL){
        listaImagen.Anterior(NombreImagen, ImagenLBL);
    }
    public void agregarImagen(Imagen imagen) {
      listaImagen.add(imagen);
    }
    public void eliminarImagen(Imagen imagen) {
      listaImagen.delete(imagen);
    }
    
    public void retornarNombre(JList listaImagenes){
      listaImagen.retornarNombre(listaImagenes);
    }
    
    public void ArrayListRuta(ArrayList<String> listaRutaImagenes){
      listaImagen.ArrayListRuta(listaRutaImagenes);
    } 
     
    //Get and Set
    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }

    public ListaDoble getListaImagen() {
        return listaImagen;
    }

    public void setListaImagen(ListaDoble listaImagen) {
        this.listaImagen = listaImagen;
    } 
    
}
