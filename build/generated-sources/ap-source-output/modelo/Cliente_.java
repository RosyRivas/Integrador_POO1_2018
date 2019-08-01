package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Deposito;
import modelo.Direccion;
import modelo.Picnic;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-01T08:35:50")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, Direccion> direccion;
    public static volatile ListAttribute<Cliente, Picnic> pic;
    public static volatile SingularAttribute<Cliente, Long> dni;
    public static volatile ListAttribute<Cliente, Deposito> dep;
    public static volatile SingularAttribute<Cliente, String> nombres;
    public static volatile SingularAttribute<Cliente, String> numeroTelefono;

}