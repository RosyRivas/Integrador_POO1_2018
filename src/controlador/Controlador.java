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
import static modelo.Cliente_.dep;
import com.toedter.calendar.JCalendar;
import java.sql.Time;
import javax.swing.JOptionPane;
import static org.eclipse.persistence.jpa.rs.util.JPARSLogger.exception;

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

        return this.persistencia.buscarTodosOrdenadosPor(Cliente.class, Cliente_.dni);
    }
//      BUSCAR CLIENTE

    public Cliente buscarCliente(Long dni) {
        return this.persistencia.buscar(Cliente.class, dni);
    }
//      AGREGAR CLIENTE

    public void agregarCliente(String dni, String nombres, String apellidos, String nroTelefono, String calle, String numero, String localidad) {
        this.persistencia.iniciarTransaccion();
        if (dni != "") {
            if (Long.parseLong(dni) > 0) {
                Cliente c = new Cliente(Long.parseLong(dni), nombres.toUpperCase(), apellidos.toUpperCase(), nroTelefono.toUpperCase(), calle.toUpperCase(), numero.toUpperCase(), localidad.toUpperCase());
                this.persistencia.insertar(c);
            }

        } else {

            this.persistencia.descartarTransaccion();
        }

        this.persistencia.confirmarTransaccion();
    }
//      ELIMINAR CLIENTE

    public int eliminarCliente(Cliente c) {
        if (c.getPic().isEmpty() && c.getDep().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(c);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
           
            return 1;
        }

    }
//      EDITAR CLIENTE

    public void editarCliente(Cliente c, String dni, String nombre, String apellido, String nroTel, String calle, String nrCalle, String localidad) {
        if (c != null) {
            this.persistencia.iniciarTransaccion();
            c.setDni(Long.parseLong(dni));
            c.setNombres(nombre.toUpperCase());
            c.setApellido(apellido.toUpperCase());
            c.setNumeroTelefono(nroTel.toUpperCase());
            Direccion d = c.getDireccion();
            d.setCalle(calle.toUpperCase());
            d.setNumero(nrCalle.toUpperCase());
            d.setLocalidad(localidad.toUpperCase());
            c.setDireccion(d);

            this.persistencia.modificar(c);
            this.persistencia.confirmarTransaccion();
        }

    }
//      AGREGAR PICNIC A CLIENTE

    public void agregarClientePicnic(Picnic p, Cliente c) {
        this.persistencia.iniciarTransaccion();
        c.agregarPicnic(p);
        this.persistencia.modificar(p);
        this.persistencia.modificar(c);
        this.persistencia.confirmarTransaccion();

    }
//  //   *********** Alimento *************   
//      LISTAR ALIMENTO

    public List listarAlimento() {

        return this.persistencia.buscarTodosOrdenadosPor(Alimento.class, Alimento_.nombre);
    }
//LISTAR ALIMENTO

    public Alimento listarAlimento(Long idAlimento) {

        return this.persistencia.buscar(Alimento.class, idAlimento);

    }
//      AGREGAR ALIMENTO

    public void agregarAlimento(String nombre, String cantidad) {
        this.persistencia.iniciarTransaccion();
        Alimento a = new Alimento(nombre.toUpperCase(), cantidad);
        this.persistencia.insertar(a);
        this.persistencia.confirmarTransaccion();

    }
//      AGREGAR ALIMENTO AL MENU

    public void agregarAlimentoMenu(Menu m, Alimento a) {
        this.persistencia.iniciarTransaccion();
        m.agregarAlimentoMenu(a);
        this.persistencia.modificar(a);
        this.persistencia.modificar(m);
        this.persistencia.confirmarTransaccion();

    }
//      ELIMINAR ALIMENTO

    public int eliminarAlimento(Alimento a) {
        if (a.getMenu().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(a);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }
//      EDITAR ALIMENTO 

    public void editarAlimento(Alimento a, String nombre, String cantidad) {
        this.persistencia.iniciarTransaccion();
        a.setNombre(nombre);
        a.setCantidad(cantidad);
        this.persistencia.modificar(a);
        this.persistencia.confirmarTransaccion();

    }
//      QUITAR ALIMENTO DEL MENU

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
//agregar suministro

    public void agregarSuministro(String descripcion, String cantidad) {
        this.persistencia.iniciarTransaccion();
        Suministro s = new Suministro(descripcion.toUpperCase(), cantidad.toUpperCase());
        this.persistencia.insertar(s);
        this.persistencia.confirmarTransaccion();
    }
//agregar suministro a menu

    public void agregarSuministroMenu(Menu m, Suministro s) {
        this.persistencia.iniciarTransaccion();
        m.agregarSuministro(s);
        this.persistencia.modificar(s);
        this.persistencia.modificar(m);
        this.persistencia.confirmarTransaccion();

    }
//eliminar suministro

    public int eliminarSuministro(Suministro s) {
        if (s.getMenu().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(s);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
          
            return 1;
        }

    }
//quitar suministro menu

    public void quitarSuministroMenu(Menu m, Suministro sm) {
        this.persistencia.iniciarTransaccion();
        m.quitarSuministro(sm);
        this.persistencia.modificar(m);
        this.persistencia.modificar(sm);
        this.persistencia.confirmarTransaccion();

    }
    
    public void quitarPicnicMenu(Menu m, Picnic p){
     this.persistencia.iniciarTransaccion();
     m.quitarPicnicMenu(p);
     this.persistencia.modificar(p);
     this.persistencia.modificar(m);
    this.persistencia.confirmarTransaccion();
    }
//editar suministro

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
// agregar picnic

    public void agregarPicnic(String lugar, String fecha, String hora, String cantPersona, String precio, Cliente cli, Menu me) {
        this.persistencia.iniciarTransaccion();
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
            Picnic p = new Picnic(lugar.toUpperCase(), formatoFecha.parse(fecha), hora, cantPersona.toUpperCase(), precio.toUpperCase(), cli, me);
            if (!hora.isEmpty()) {
                if (cli.getPic() != null) {
                    cli.agregarPicnic(p);
                    this.persistencia.modificar(cli);

                }
                if (me.getPic() != null) {
                    me.agregarPicnicMenu(p);
                    this.persistencia.modificar(me);
                }
                this.persistencia.insertar(p);
                this.persistencia.confirmarTransaccion();

            } else {

                JOptionPane.showMessageDialog(null, "Por favor ingrese la hora.", "Error", JOptionPane.ERROR_MESSAGE);
                this.persistencia.eliminar(p);
                this.persistencia.descartarTransaccion();

            }

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese los campos faltantes.", "Error", JOptionPane.ERROR_MESSAGE);
            this.persistencia.descartarTransaccion();

        }

    }

//eliminar picnic
    public int eliminarPicnic(Picnic p) {
        if ((p.getDep().isEmpty()))  {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(p);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;

        }
    }

//editar picnic
    public void editarPicnic(Picnic p, String lugar, String fecha, String hora, String cantPersona, String precio, Cliente cli, Menu me) {
        this.persistencia.iniciarTransaccion();
        if (p != null) {

            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
                if (!hora.isEmpty()) {
                    p.setLugar(lugar.toUpperCase());
                    p.setFecha(formatoFecha.parse(fecha));
                    p.setHora(hora);
                    p.setPrecio(precio);
                    p.setCantPersona(cantPersona);
                    if (p.getCli() != null) {
                        Cliente cliViejo = p.getCli();
                        cliViejo.quitarPicnic(p);
                        this.persistencia.modificar(p);
                    }
                    if (p.getMe() != null) {
                        Menu menuViejo = p.getMe();
                        menuViejo.quitarPicnicMenu(p);
                        this.persistencia.modificar(p);
                    }

                    p.setCli(cli);
                    p.setMe(me);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese la hora.", "Error", JOptionPane.ERROR_MESSAGE);
                    this.persistencia.eliminar(p);
                    this.persistencia.descartarTransaccion();
                }

            } catch (ParseException ex) {
                this.persistencia.modificar(p);

                
            }
            this.persistencia.confirmarTransaccion();
        }
    }
    //    ********************** Menu  ***************************************

    public List listarMenu() {
        return this.persistencia.buscarTodosOrdenadosPor(Menu.class, Menu_.descripcion);
    }

    public Menu buscarMenu(Long idMenu) {

        return this.persistencia.buscar(Menu.class, idMenu);

    }
//agregar menu a picnic

    public void agregarMenuPic(Picnic p, Menu m) {
        this.persistencia.iniciarTransaccion();
        m.agregarPicnicMenu(p);
        this.persistencia.modificar(p);
        this.persistencia.modificar(m);
        this.persistencia.confirmarTransaccion();

    }
//                      ELIMINAR MENU del pic

    public int eliminarMenu(Menu m) {
        if (m.getPic().isEmpty()  && m.getSuministro().isEmpty() && m.getaMenu().isEmpty()  ) {
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(m);
            this.persistencia.confirmarTransaccion();
            return 0;
        }
        return 1;

    }
  
//          AGREGAR MENU

    public void agregarMenu(String descripcion, String precio, Picnic pic, Suministro sumi, Alimento alim) {
        this.persistencia.iniciarTransaccion();
        try {

            Menu m = new Menu(descripcion.toUpperCase(), precio.toUpperCase(), pic, sumi, alim);
            if (pic == null) {

            }
            this.persistencia.insertar(m);
            this.persistencia.confirmarTransaccion();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            this.persistencia.descartarTransaccion();

        }

    }

//          EDITAR MENU
    public void editarMenu(Menu m, String descripcion, String precio, Picnic pic, Suministro sumi, Alimento alim) {
        this.persistencia.iniciarTransaccion();
        m.setDescripcion(descripcion.toUpperCase());
        m.setPrecio(precio.toUpperCase());
        m.setPic((List<Picnic>) pic);
        m.setSuministro((Set<Suministro>) sumi);
        m.setaMenu((Set<Alimento>) alim);

        this.persistencia.modificar(m);
        this.persistencia.confirmarTransaccion();
    }

//   ///// **************** Deposito  ********************
    //          AGREGAR DEPOSITO
    public void agregarDeposito(String fecha, String monto, String tipoDeposito, Picnic pic, Cliente cli) {// agregar Deposito
        this.persistencia.iniciarTransaccion();
      
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
            Deposito d = new Deposito(formatoFecha.parse(fecha), monto.toUpperCase(), tipoDeposito.toUpperCase(), pic, cli);

            if ((pic.getDep() != null)) {
                pic.agregarDeposito(d);
                this.persistencia.modificar(pic);

            }
            if ((cli.getDep() != null)) {

                cli.agregarDeposito(d);
                this.persistencia.modificar(cli);

            }
            this.persistencia.insertar(d);
            this.persistencia.confirmarTransaccion();

        } catch (ParseException e) {

            JOptionPane.showMessageDialog(null, "Por favor complete los datos", "Error", JOptionPane.ERROR_MESSAGE);
            this.persistencia.descartarTransaccion();
        }
    }

    //      editar deposito
    public void editarDeposito(Deposito d, String fecha, String monto, String tipoDeposito, Picnic pic, Cliente cli) {

        if (d != null) {
            this.persistencia.iniciarTransaccion();
            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");

                d.setMonto(monto);
                d.setFechaDep(formatoFecha.parse(fecha));
                d.setTipoDeposito(tipoDeposito);
                if (d.getPic() != null) {
                    Picnic picViejo = d.getPic();
                    picViejo.eliminarDep(d);
                    this.persistencia.modificar(d);
                }
                if (d.getCli() != null) {
                    Cliente cliViejo = d.getCli();
                    cliViejo.quitarDeposito(d);
                    this.persistencia.modificar(d);
                }
                d.setCli(cli);
                d.setPic(pic);
                pic.agregarDeposito(d);
                cli.agregarDeposito(d);
                this.persistencia.modificar(d);
                this.persistencia.confirmarTransaccion();

            } catch (ParseException ex) {
                this.persistencia.descartarTransaccion();
                System.out.println("Error al capturar fecha");

            }

        }
    }

//                  agregar picnic al DEPOSITO
    public void agregarPicnicaDeposito(Picnic p, Deposito d) {
        this.persistencia.iniciarTransaccion();
        p.agregarDeposito(d);
        this.persistencia.modificar(d);
        this.persistencia.modificar(p);
        this.persistencia.confirmarTransaccion();
    }
//              AGREGAR DEPOSITO AL CLIENTE

    public void agregarDepositoaCliente(Cliente c, Deposito d) {
        this.persistencia.iniciarTransaccion();
        c.agregarDeposito(d);
        this.persistencia.modificar(d);
        this.persistencia.modificar(c);
        this.persistencia.confirmarTransaccion();

    }

    public List listarDeposito() {
        return this.persistencia.buscarTodosOrdenadosPor(Deposito.class, Deposito_.fechaDep);

    }
    //        QUITAR DEPOSITO AL CLIENTE  

    public void quitarDepositoCliente(Cliente c, Deposito d) {
        this.persistencia.iniciarTransaccion();
        c.quitarDeposito(d);
        this.persistencia.modificar(d);
        this.persistencia.modificar(c);
        this.persistencia.confirmarTransaccion();
    }
//          QUITAR PICNIC AL CLIEMTE

    public void quitarPicnicCliente(Picnic p, Cliente c) {
        this.persistencia.iniciarTransaccion();
        c.quitarPicnic(p);
        this.persistencia.modificar(c);
        this.persistencia.modificar(p);
        this.persistencia.confirmarTransaccion();

    }

//          QUITAR DEPOSITO AL PICNIC
    public void quitarDepositoPicnic(Picnic p, Deposito d) {
        this.persistencia.iniciarTransaccion();
        p.eliminarDep(d);
        this.persistencia.modificar(d);
        this.persistencia.modificar(p);
        this.persistencia.confirmarTransaccion();

    }

}
