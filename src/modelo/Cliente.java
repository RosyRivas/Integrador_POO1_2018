/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Rosi-PC
 */
@Entity
@Table(name="Cliente")

public class Cliente implements Serializable {
    @Id
    @SequenceGenerator(name="sec_Cliente", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_cliente")
    private String dni;
    private String nombres;
    private String apellido;
    private String numeroTelefono;
     @Embedded
    private Direccion direccion;
    @OneToMany(mappedBy ="cli")
    @OrderBy( "idPicnic ASC")
    private List<Picnic> pic;
    @OneToMany(mappedBy ="cli")
    @OrderBy("idDeposito ASC")
    private List<Deposito> dep;

    

    public Cliente() {
        this.dep=new ArrayList();
        this.pic=new ArrayList();
    }

    public Cliente( String dni ,String nombres, String apellido, String numeroTelefono, String calle ,String  numero,String localidad) {
        this.dni= dni;
        this.nombres = nombres;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        Direccion d= new Direccion (calle, numero,localidad);
        this.direccion = d;
        this.dep= new ArrayList();
        this.pic= new ArrayList();
           }

  

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Picnic> getPic() {
        return pic;
    }

    public void setPic(List<Picnic> pic) {
        this.pic = pic;
    }

    public List<Deposito> getDep() {
        return dep;
    }

    public void setDep(List<Deposito> dep) {
        this.dep = dep;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    
  

   

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

   

   

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombres=" + nombres + ", apellido=" + apellido + ", numeroTelefono=" + numeroTelefono + ", direccion=" + direccion + ", pic=" + pic + ", dep=" + dep + '}';
    }
    
   public void agregarPicnic(Picnic pic){
        this.pic.add(pic);
   
   }
    
 
}
