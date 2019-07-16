package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Picnic;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-13T12:27:12")
@StaticMetamodel(Deposito.class)
public class Deposito_ { 

    public static volatile SingularAttribute<Deposito, Date> fechaDep;
    public static volatile SingularAttribute<Deposito, Cliente> cli;
    public static volatile SingularAttribute<Deposito, String> monto;
    public static volatile SingularAttribute<Deposito, String> tipoDeposito;
    public static volatile SingularAttribute<Deposito, Picnic> pic;
    public static volatile SingularAttribute<Deposito, Long> idDeposito;

}