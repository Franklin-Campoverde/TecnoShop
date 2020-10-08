/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import dao.DetalleProductoDao;
import Entity.DetalleProducto;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class DetalleProiductoBean {

    /**
     * Creates a new instance of DetalleProductoControl
     */
    private List<DetalleProducto> listaDetalleProductos;
    private DetalleProducto detalleProducto;

    public DetalleProiductoBean() {
        detalleProducto = new DetalleProducto();
    }

    public List<DetalleProducto> getListaDetalleProductos() {
        DetalleProductoDao ad = new DetalleProductoDao();
        listaDetalleProductos = ad.listarDetalle();
        return listaDetalleProductos;
    }

    public void setListaDetalleProductos(List<DetalleProducto> listaDetalleProductos) {
        this.listaDetalleProductos = listaDetalleProductos;
    }

    public DetalleProducto getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(DetalleProducto detalleProducto) {
        this.detalleProducto = detalleProducto;
    }

    public void limpiarDetalleProducto() {
        detalleProducto = new DetalleProducto();
    }

    public void agregarDetalleProducto() {
        DetalleProductoDao ad = new DetalleProductoDao();
        ad.agregar(detalleProducto);
    }

    public void modificarDetalleProducto() {
        DetalleProductoDao ad = new DetalleProductoDao();
        ad.modificar(detalleProducto);
        limpiarDetalleProducto();
    }

    public void eliminarDetalleProducto() {
        DetalleProductoDao ad = new DetalleProductoDao();
        ad.eliminar(detalleProducto);
        limpiarDetalleProducto();
    }
}
