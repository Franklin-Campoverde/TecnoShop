package Entity;
// Generated 07-oct-2020 0:02:50 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Imagen generated by hbm2java
 */
public class Imagen  implements java.io.Serializable {


     private BigDecimal idImagen;
     private String url;
     private Set<Producto> productos = new HashSet<Producto>(0);

    public Imagen() {
    }

	
    public Imagen(BigDecimal idImagen) {
        this.idImagen = idImagen;
    }
    public Imagen(BigDecimal idImagen, String url, Set<Producto> productos) {
       this.idImagen = idImagen;
       this.url = url;
       this.productos = productos;
    }
   
    public BigDecimal getIdImagen() {
        return this.idImagen;
    }
    
    public void setIdImagen(BigDecimal idImagen) {
        this.idImagen = idImagen;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public Set<Producto> getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }




}


