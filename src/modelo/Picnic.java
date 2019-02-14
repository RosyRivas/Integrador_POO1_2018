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
    private String cantPersona;
  //  private Date hora;
    private String precio;

    @ManyToOne
    private Cliente cli;//cliente
    
    @OneToMany(mappedBy = "pic")
    @OrderBy ("idDeposito ASC")
    private List<Deposito> dep;//deposito
    
    @ManyToOne
    private Menu me;//menu
   

    public Picnic() {
        this.fecha= new Date();
      //  this.hora= new Date();
        this.dep= new ArrayList();
    }

    public Picnic( String lugar,Date fecha/*Date hora*/,String cantPer, String precio, Cliente cli, Menu me) {
        
        this.lugar = lugar;
        this.fecha = new Date();
      //  this.hora= new Date();
        this.cantPersona= cantPer;
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

    public String getCantPersona() {
        return cantPersona;
    }

    public void setCantPersona(String cantPersona) {
        this.cantPersona = cantPersona;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
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
        return "Picnic{" + "idPicnic=" + idPicnic + ", lugar=" + lugar + ", fecha=" + fecha + ", precio=" + precio + ", cli=" + cli + ", dep=" + dep + ", me=" + me + '}';
    }

   
public void agregarDeposito(Deposito d ){
        this.dep.add(d);
    
    }

  

   public void eliminarMenu(Deposito d){
       this.dep.remove(d);
   }
   
   public void eliminarDep(Deposito d){
       this.dep.remove(d);
   
   }

}
