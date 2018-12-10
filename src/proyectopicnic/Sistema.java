/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopicnic;

/**
 *
 * @author Rosi-PC
 */
import Vista.*;
import controlador.Controlador;
import dao.Persistencia;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;


/**
 *
 * @author Rosi-PC
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoPicnicPU");
        // creo objeto de Persistencia (DAO)
        Persistencia persistencia = new Persistencia(emf);
        // creo controlador y asocio (inyecto) al controlador el objeto de Persistencia (DAO)
        Controlador c = new Controlador(persistencia);
        
         VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(c);
         ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);

    }
    
    
}
