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
    private double monto;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaDep;
    private boolean nro;
    @ManyToOne
    private Picnic pic ;
    @ManyToOne
    private Cliente cli;
   
    
    public Deposito() {
    }

    public Deposito(double monto, Date fechaDep, boolean nro, Picnic pic, Cliente cli) {
        this.monto = monto;
        this.fechaDep = fechaDep;
        this.nro = nro;
        this.pic = pic;
        this.cli = cli;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaDep() {
        return fechaDep;
    }

    public void setFechaDep(Date fechaDep) {
        this.fechaDep = fechaDep;
    }

    public boolean isNro() {
        return nro;
    }

    public void setNro(boolean nro) {
        this.nro = nro;
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
        return "Deposito{" + "idDeposito=" + idDeposito + ", monto=" + monto + ", nro=" + nro + ", pic=" + pic + ", cli=" + cli + '}';
    }

    

    
    
}
