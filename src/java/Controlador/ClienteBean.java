/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import dao.ClienteDao;
import Entity.Cliente;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class ClienteBean {

    /**
     * Creates a new instance of ClienteControl
     */
    private List<Cliente> listaClientes;
    private Cliente cliente;

    public ClienteBean() {
        cliente = new Cliente();
    }

    public List<Cliente> getListaClientes() {
        ClienteDao ad = new ClienteDao();
        listaClientes = ad.listarClientes();
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void limpiarCliente() {
        cliente = new Cliente();
    }

    public void agregarCliente() {
        ClienteDao ad = new ClienteDao();
        ad.agregar(cliente);
    }

    public void modificarCliente() {
        ClienteDao ad = new ClienteDao();
        ad.modificar(cliente);
        limpiarCliente();
    }

    public void eliminarCliente() {
        ClienteDao ad = new ClienteDao();
        ad.eliminar(cliente);
        limpiarCliente();
    }
}