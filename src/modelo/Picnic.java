/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Rosi-PC
 */
@Entity
@Table(name = "Picnic")

public class Picnic {

    @Id
    @SequenceGenerator(name = "sec_picnic", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_picnic")
    private long idPicnic;
    private String lugar;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
 
    private String hora;
    private double precio;

    @ManyToOne
    private Cliente cli;//cliente
    @OneToMany(mappedBy = "pic")
    @OrderBy ("idDeposito ASC")
    private List<Deposito> dep;//deposito
    @ManyToOne
    private Menu me;//menu
   

    public Picnic() {
        this.fecha= new Date();
        this.dep= new ArrayList();
    }

    public Picnic( String lugar, Date fecha, String hora, double precio, Cliente cli, Deposito dep, Menu me) {
        
        this.lugar = lugar;
        this.fecha = new Date();
        this.hora = hora;
        this.precio = precio;
        this.cli = cli;
        this.dep= new ArrayList();
        this.me = me;
    }

    public long getIdPicnic() {
        return idPicnic;
    }

    public void setIdPicnic(long idPicnic) {
        this.idPicnic = idPicnic;
    }

    

   

    public void setIdPicnic(int idPicnic) {
        this.idPicnic = idPicnic;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public List<Deposito> getDep() {
        return dep;
    }

    public void setDep(List<Deposito> dep) {
        this.dep = dep;
    }

   

    public Menu getMe() {
        return me;
    }

    public void setMe(Menu me) {
        this.me = me;
    }

    @Override
    public String toString() {
        return "Picnic{" + "idPicnic=" + idPicnic + ", lugar=" + lugar + ", fecha=" + fecha + ", hora=" + hora + ", precio=" + precio + ", cli=" + cli + ", dep=" + dep + ", me=" + me + '}';
    }

   
public void agregarDeposito(Deposito d ){
        this.dep.add(d);
    
    }

}
