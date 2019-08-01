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
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Rosi-PC
 */
@Entity
@Table(name = "Menu")

public class Menu implements Serializable {

    @Id
    @SequenceGenerator(name = "sec_menu", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_menu")
    private Long idMenu;
    private String descripcion;
    private String precio;

    

    @ManyToMany(mappedBy = "menu")
    private Set<Suministro> suministro;
    
    @ManyToMany(mappedBy = "menu")
    private Set<Alimento>aMenu;

    @OneToMany(mappedBy = "me") 
    @OrderBy( "idPicnic ASC")
    private List<Picnic> pic;

   
    public Menu() {
        this.suministro = new HashSet();
        this.aMenu = new HashSet();
        this.pic = new ArrayList();
    }

    public Menu(String descripcion, String precio,Picnic pic,Suministro suministro, Alimento aMenu) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.suministro  = new HashSet();
        this.pic = new ArrayList();
        this.aMenu = new HashSet();
    }

    
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

   

    public List<Picnic> getPic() {
        return pic;
    }

    public void setPic(List<Picnic> pic) {
        this.pic = pic;
    }


   
    public Set<Suministro> getSuministro() {
        return suministro;
    }

    @Override
    public String toString() {
        return "Menu{" + "idMenu=" + idMenu + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    
    
   

 
    public void setSuministro(Set<Suministro> suministro) {
        this.suministro = suministro;
    }

    public Set<Alimento> getaMenu() {
        return aMenu;
    }

    public void setaMenu(Set<Alimento> aMenu) {
        this.aMenu = aMenu;
    }
    
     public void agregarAlimentoMenu(Alimento a) {

        this.aMenu.add(a);
        a.agregarMenu(this);
    }

    public void agregarSuministro(Suministro s) {
        this.suministro.add(s);
        s.agregarMenu(this);
    }
    
 public void agregarPicnicMenu(Picnic p){
    this.pic.add(p);
 }
 public void quitarPicnicMenu(Picnic p){
    this.pic.remove(p);
 }
 
 
 public void quitarSuministro (Suministro s){
     this.suministro.remove(s);
     s.quitarMenu(this);
 }
  public void quitarAlimento (Alimento a){
     this.aMenu.remove(a);
     a.quitarMenu(this);
 }
  
  
  
}
