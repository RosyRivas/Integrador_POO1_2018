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
@Table(name="Alimento")
public class Alimento implements Serializable  {
   @Id
    @SequenceGenerator(name="sec_alimento", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_alimento")
    private Long idAlimento;
    private String nombre; 
    private String cantidad;
   
    @ManyToMany
  
    private Set <Menu> menu;

    /**
     * 
     */
    public Alimento(){
             this.menu= new HashSet();
       
       }
 
    public Alimento( String nombre, String cantidad, Set<Menu> menu) {
    
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.menu= new HashSet();
    }

    public Set<Menu> getMenu() {
        return menu;
    }

    public void setMenu(Set<Menu> menu) {
        this.menu = menu;
    }

    

    public Long getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Long idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

  public void quitarMenu (Menu m){
      this.menu.remove(m);
  }
   
    

   
    

}

   
    

