package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Deposito;
import modelo.Menu;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-13T12:27:12")
@StaticMetamodel(Picnic.class)
public class Picnic_ { 

    public static volatile SingularAttribute<Picnic, Date> fecha;
    public static volatile SingularAttribute<Picnic, Cliente> cli;
    public static volatile SingularAttribute<Picnic, String> precio;
    public static volatile SingularAttribute<Picnic, String> cantPersona;
    public static volatile SingularAttribute<Picnic, String> hora;
    public static volatile SingularAttribute<Picnic, String> lugar;
    public static volatile SingularAttribute<Picnic, Menu> me;
    public static volatile SingularAttribute<Picnic, Long> idPicnic;
    public static volatile ListAttribute<Picnic, Deposito> dep;

}