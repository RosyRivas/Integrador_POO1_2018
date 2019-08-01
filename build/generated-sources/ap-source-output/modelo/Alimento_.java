package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Menu;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-01T08:35:50")
@StaticMetamodel(Alimento.class)
public class Alimento_ { 

    public static volatile SingularAttribute<Alimento, Long> idAlimento;
    public static volatile SingularAttribute<Alimento, String> cantidad;
    public static volatile SetAttribute<Alimento, Menu> menu;
    public static volatile SingularAttribute<Alimento, String> nombre;

}