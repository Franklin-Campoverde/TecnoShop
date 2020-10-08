
package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import dao.ProductoDao;
import Entity.Producto;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class ProductoBean {

    /**
     * Creates a new instance of ProductoControl
     */
    private List<Producto> listaProductos;
    private Producto producto;

    public ProductoBean() {
        producto = new Producto();
    }

    public List<Producto> getListaProductos() {
        ProductoDao ad = new ProductoDao();
        listaProductos = ad.listarProductos();
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void limpiarProducto() {
        producto = new Producto();
    }

    public void agregarProducto() {
        ProductoDao ad = new ProductoDao();
        ad.agregar(producto);
    }

    public void modificarProducto() {
        ProductoDao ad = new ProductoDao();
        ad.modificar(producto);
        limpiarProducto();
    }

    public void eliminarProducto() {
        ProductoDao ad = new ProductoDao();
        ad.eliminar(producto);
        limpiarProducto();
    }
}