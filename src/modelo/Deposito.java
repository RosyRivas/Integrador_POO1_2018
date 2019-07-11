/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Rosi-PC
 */
@Entity
@Table(name="Deposito")

public class Deposito implements Serializable {
    @Id
    @SequenceGenerator(name="sec_deposito", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_deposito")
    private Long idDeposito; 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaDep;
    private String monto;
    private String tipoDeposito;
    @ManyToOne
    private Picnic pic ;
    @ManyToOne
    private Cliente cli;
   
    
    public Deposito() {
        this.fechaDep= new Date();
    }

    public Deposito(Date fechaDep,String monto,  String tipoDep, Picnic pic, Cliente cli) {
         this.fechaDep = new Date();
        this.monto = monto;   
        this.tipoDeposito = tipoDep;
        this.pic = pic;
        this.cli = cli;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    

    public Date getFechaDep() {
        return fechaDep;
    }

    public void setFechaDep(Date fechaDep) {
        this.fechaDep = fechaDep;
    }

    public String getTipoDeposito() {
        return tipoDeposito;
    }

    public void setTipoDeposito(String tipoDeposito) {
        this.tipoDeposito = tipoDeposito;
    }

   

   

   
    public Long getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(Long idDeposito) {
        this.idDeposito = idDeposito;
    }

    public Picnic getPic() {
        return pic;
    }

    public void setPic(Picnic pic) {
        this.pic = pic;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    @Override
    public String toString() {
        return "Deposito{" + "idDeposito=" + idDeposito + ", fechaDep=" + fechaDep + ", monto=" + monto + ", tipoDeposito=" + tipoDeposito + ", pic=" + pic + ", cli=" + cli + '}';
    }

    

 //public void agregarDeposito(Deposito d ){
   //0     this.pi;
    
   // }
    public void eliminarCliente(Cliente c){
   
      
       
   } 
    
    
}
