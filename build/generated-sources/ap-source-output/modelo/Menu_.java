package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alimento;
import modelo.Picnic;
import modelo.Suministro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-13T12:27:12")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> descripcion;
    public static volatile SingularAttribute<Menu, String> precio;
    public static volatile SetAttribute<Menu, Suministro> suministro;
    public static volatile SingularAttribute<Menu, Long> idMenu;
    public static volatile SetAttribute<Menu, Alimento> aMenu;
    public static volatile ListAttribute<Menu, Picnic> pic;

}