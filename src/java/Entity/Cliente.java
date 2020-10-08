package Entity;
// Generated 07-oct-2020 0:02:50 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private BigDecimal idCliente;
     private Usuarios usuarios;
     private String nombre;
     private String apellido;
     private BigDecimal telefono;
     private String ciudad;
     private String direccion;

    public Cliente() {
    }

	
    public Cliente(BigDecimal idCliente) {
        this.idCliente = idCliente;
    }
    public Cliente(BigDecimal idCliente, Usuarios usuarios, String nombre, String apellido, BigDecimal telefono, String ciudad, String direccion) {
       this.idCliente = idCliente;
       this.usuarios = usuarios;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.ciudad = ciudad;
       this.direccion = direccion;
    }
   
    public BigDecimal getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(BigDecimal idCliente) {
        this.idCliente = idCliente;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public BigDecimal getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}


