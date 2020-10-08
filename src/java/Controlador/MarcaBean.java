/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import dao.MarcaDao;
import Entity.Marca;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class MarcaBean {

    /**
     * Creates a new instance of MarcaControl
     */
    private List<Marca> listaMarcas;
    private Marca marca;

    public MarcaBean() {
        marca = new Marca();
    }

    public List<Marca> getListaMarcas() {
        MarcaDao ad = new MarcaDao();
        listaMarcas = ad.listarMarcas();
        return listaMarcas;
    }

    public void setListaMarcas(List<Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void limpiarMarca() {
        marca = new Marca();
    }

    public void agregarMarca() {
        MarcaDao ad = new MarcaDao();
        ad.agregar(marca);
    }

    public void modificarMarca() {
        MarcaDao ad = new MarcaDao();
        ad.modificar(marca);
        limpiarMarca();
    }

    public void eliminarMarca() {
        MarcaDao ad = new MarcaDao();
        ad.eliminar(marca);
        limpiarMarca();
    }
}