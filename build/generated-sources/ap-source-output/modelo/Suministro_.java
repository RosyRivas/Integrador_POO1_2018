package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Menu;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-13T12:27:12")
@StaticMetamodel(Suministro.class)
public class Suministro_ { 

    public static volatile SingularAttribute<Suministro, String> descripcion;
    public static volatile SingularAttribute<Suministro, String> cSuministro;
    public static volatile SingularAttribute<Suministro, Long> idSuministro;
    public static volatile SetAttribute<Suministro, Menu> menu;

}