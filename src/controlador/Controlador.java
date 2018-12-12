/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.Persistencia;
import modelo.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Rosi-PC
 */
public class Controlador {

    private final Persistencia persistencia;

    public Controlador(Persistencia p) {
        this.persistencia = p;
    }
//    ////////   ********** Cliente**********

    public List listarCliente() {

        return this.persistencia.buscarTodosOrdenadosPor(Cliente.class, Cliente_.apellido);
    }

    public Cliente buscarCliente(Long dni) {
        return this.persistencia.buscar(Cliente.class, dni);
    }

    public void agregarCliente( String dni,String nombres, String apellidos, String nroTelefono, String calle ,String  numero,String localidad) {
        this.persistencia.iniciarTransaccion();      
       Cliente c= new Cliente(dni.toUpperCase(), nombres.toUpperCase(),apellidos.toUpperCase(),nroTelefono.toUpperCase(),calle.toUpperCase(),numero.toUpperCase(),localidad.toUpperCase());
       this.persistencia.insertar(c);
       this.persistencia.confirmarTransaccion();
    }

    public int eliminarCliente(Cliente c) {
        if (c.getPic().isEmpty() && c.getDep().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(c);
            this.persistencia.confirmarTransaccion();
            return 0;
        }else{
            return 1;
        }
        

    }

    public void editarCliente(Cliente c,String dni, String nombre, String apellido, String nroTel, String calle, String nrCalle, String localidad) {

        this.persistencia.iniciarTransaccion();
        c.setDni(dni.toUpperCase());
        c.setNombres(nombre.toUpperCase());
        c.setApellido(apellido.toUpperCase());
        c.setNumeroTelefono(nroTel.toUpperCase());
        Direccion d = c.getDireccion();
        d.setCalle(calle.toUpperCase());
        d.setNumero(nrCalle.toUpperCase());
        d.setLocalidad(localidad.toUpperCase());
        c.setDireccion(d);  
        this.persistencia.modificar(d);
        this.persistencia.confirmarTransaccion();

    }

    public void agregarClientePicnic(Picnic p, Cliente c) {
        this.persistencia.iniciarTransaccion();
        c.agregarPicnic(p);
        this.persistencia.modificar(p);
        this.persistencia.modificar(c);
        this.persistencia.confirmarTransaccion();

    }
//  //   *********** Alimento *************   

    public List listarAlimento() {

        return this.persistencia.buscarTodosOrdenadosPor(Alimento.class, Alimento_.nombre);
    }

    public Alimento listarAlimento(Long idAlimento) {

        return this.persistencia.buscar(Alimento.class, idAlimento);

    }

    public void agregarAlimento(String nombre, String cantidad) {
        this.persistencia.iniciarTransaccion();
        Alimento a = new Alimento(nombre.toUpperCase(), cantidad);
        this.persistencia.insertar(a);
        this.persistencia.confirmarTransaccion();

    }

    public void agregarAlimentoMenu(Menu m, Alimento a) {
        this.persistencia.iniciarTransaccion();
        m.agregarAlimentoMenu(a);
        this.persistencia.modificar(a);
        this.persistencia.modificar(m);
        this.persistencia.confirmarTransaccion();

    }

    public int eliminarAlimento(Alimento a) {
        if (a.getMenu().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(a);
            this.persistencia.confirmarTransaccion();
            return 0;
        }else{
            return 1;
        }
    }

    public void editarAlimento(Alimento a, String nombre, String cantidad) {
        this.persistencia.iniciarTransaccion();
        a.setNombre(nombre);
        a.setCantidad(cantidad);
        this.persistencia.modificar(a);
        this.persistencia.confirmarTransaccion();

    }

    public void quitarAlimentoMenu(Alimento a, Menu m) {

        this.persistencia.iniciarTransaccion();
        m.quitarAlimento(a);
        this.persistencia.modificar(m);
        this.persistencia.modificar(a);
        this.persistencia.confirmarTransaccion();

    }

//  ///   *************Suministro *******************       
    public List listarSuministro() {
        return this.persistencia.buscarTodosOrdenadosPor(Suministro.class, Suministro_.descripcion);
    }

    public Suministro listarSuministro(Long idSuministro) {

        return this.persistencia.buscar(Suministro.class, idSuministro);

    }

    public void agregarSuministro(String descripcion, String cantidad) {
        this.persistencia.iniciarTransaccion();
        Suministro s = new Suministro(descripcion.toUpperCase(), cantidad.toUpperCase());
        this.persistencia.insertar(s);
        this.persistencia.confirmarTransaccion();
    }

    public void agregarSuministroMenu(Menu m, Suministro s) {
        this.persistencia.iniciarTransaccion();
        m.agregarSuministro(s);
        this.persistencia.modificar(s);
        this.persistencia.modificar(m);
        this.persistencia.confirmarTransaccion();

    }

    public int eliminarSuministro(Suministro s) {
        if (s.getcSuministro().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(s);
            this.persistencia.confirmarTransaccion();
            return 0;
        }else {
            return 1;
        }

    }

    public void quitarSuministroMenu(Menu m, Suministro sm) {
        this.persistencia.iniciarTransaccion();
        m.quitarSuministro(sm);
        this.persistencia.modificar(m);
        this.persistencia.modificar(sm);
        this.persistencia.confirmarTransaccion();

    }

    public void editarSuministro(Suministro s, String descripcion, String cantidad) {
             this.persistencia.iniciarTransaccion();
             s.setDescripcion(descripcion);
             s.setcSuministro(cantidad);
        this.persistencia.modificar(s);
        this.persistencia.confirmarTransaccion();
    }
///////   ****************  Picnic  **************************************

    public List listarPicnic() {
        return this.persistencia.buscarTodosOrdenadosPor(Picnic.class, Picnic_.fecha);

    }

    public Picnic listarPicnic(Long idPicnic) {

        return this.persistencia.buscar(Picnic.class, idPicnic);

    }

    public void agregarPicnic(String lugar, String fecha, String hora, double precio, Cliente cli, Menu me) {
        this.persistencia.iniciarTransaccion();
        try {

            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            Picnic p = new Picnic(lugar.toUpperCase(), formatoFecha.parse(fecha), hora, precio, cli, me);
            if ((cli != null) ) {
                cli.agregarPicnic(p);
                this.persistencia.modificar(cli);

            }
            this.persistencia.insertar(p);
            this.persistencia.confirmarTransaccion();
        } catch (ParseException ex) {
            this.persistencia.descartarTransaccion();
            System.out.println("Error al capturar fecha");
        }

    }

    public int eliminarPicnic(Picnic p) {
        if (p.getDep().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(p);
            this.persistencia.confirmarTransaccion();
            return 0;
        }else{
            return 1;
        
        }
    }

    public void editarPicnic(Picnic p, String lugar, String fecha, String hora, double precio, Cliente cli, Deposito de, Menu me) {
        this.persistencia.iniciarTransaccion();

    }

//    ********************** Menu  ***************************************
    public List listarMenu() {
        return this.persistencia.buscarTodosOrdenadosPor(Menu.class, Menu_.descripcion);
    }

    public Menu listarMenu(Long idMenu) {

        return this.persistencia.buscar(Menu.class, idMenu);

    }

    public void agregarMenuPic(Picnic p, Menu m) {
        this.persistencia.iniciarTransaccion();
        m.agregarMenuPicnic(p);
        this.persistencia.modificar(p);
        this.persistencia.modificar(m);
        this.persistencia.confirmarTransaccion();

    }

    public void eliminarMenu(Menu m) {
        if (m.getPic().isEmpty()) {
            this.persistencia.iniciarTransaccion();

        }

    }

    public void quitarMenuPicnic() {
    }

    public void editarMenu() {

    }

//   ///// **************** Deposito  ********************
    public void agregarDeposito(double monto, String fecha, boolean nro, Picnic pic, Cliente cli) {
        this.persistencia.iniciarTransaccion();
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat();
            Deposito d = new Deposito(monto, formatoFecha.parse(fecha), nro, pic, cli);

            this.persistencia.insertar(d);
            this.persistencia.confirmarTransaccion();

        } catch (ParseException ex) {
            this.persistencia.descartarTransaccion();
            System.out.println("Error al capturar fecha");

        }
    }

    public void modificarDeposito() {

    }

    public int eliminarDeposito() {
        return 0;
    }

    public void quitardepoosito() {
    }

}
