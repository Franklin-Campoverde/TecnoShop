/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import dao.ImagenDao;
import Entity.Imagen;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class ImagenBean {

    /**
     * Creates a new instance of ImagenControl
     */
    private List<Imagen> listaImagens;
    private Imagen imagen;

    public ImagenBean() {
        imagen = new Imagen();
    }

    public List<Imagen> getListaImagens() {
        ImagenDao ad = new ImagenDao();
        listaImagens = ad.listarImagens();
        return listaImagens;
    }

    public void setListaImagens(List<Imagen> listaImagens) {
        this.listaImagens = listaImagens;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public void limpiarImagen() {
        imagen = new Imagen();
    }

    public void agregarImagen() {
        ImagenDao ad = new ImagenDao();
        ad.agregar(imagen);
    }

    public void modificarImagen() {
        ImagenDao ad = new ImagenDao();
        ad.modificar(imagen);
        limpiarImagen();
    }

    public void eliminarImagen() {
        ImagenDao ad = new ImagenDao();
        ad.eliminar(imagen);
        limpiarImagen();
    }
}