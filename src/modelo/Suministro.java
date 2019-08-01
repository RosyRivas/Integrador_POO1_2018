/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name="Suministro")
public class Suministro implements Serializable  {
     @Id
     @SequenceGenerator(name="sec_sumimistro", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_suministro")
    private Long idSuministro;
    private String descripcion ;
    private String cSuministro;
    
    
    @ManyToMany
    private Set <Menu> menu;

    public Suministro() {
       this.menu= new HashSet();
    }

    public Suministro(String descripcion, String cSuministro) {
       
        this.descripcion = descripcion;
        this.cSuministro = cSuministro;
        this.menu = new HashSet();
    }

   


    public Long getIdSuministro() {
        return idSuministro;
    }

    public void setIdSuministro(Long idSuministro) {
        this.idSuministro = idSuministro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getcSuministro() {
        return cSuministro;
    }

    public void setcSuministro(String cSuministro) {
        this.cSuministro = cSuministro;
    }

  
    
    
    public void agregarMenu(Menu m){
        this.menu.add(m);
    }


    public Set<Menu> getMenu() {
        return menu;
    }

    public void setMenu(Set<Menu> menu) {
        this.menu = menu;
    }


 public void quitarMenu(Menu m){
     this.menu.remove(m);
     
 
 }

    @Override
    public String toString() {
        return "Suministro{" + "idSuministro=" + idSuministro + ", descripcion=" + descripcion + ", cSuministro=" + cSuministro + '}';
    }

   
   

   


  
    
}
