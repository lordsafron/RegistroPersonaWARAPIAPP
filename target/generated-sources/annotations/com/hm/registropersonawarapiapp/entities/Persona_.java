package com.hm.registropersonawarapiapp.entities;

import com.hm.registropersonawarapiapp.entities.NacionalidadPersona;
import com.hm.registropersonawarapiapp.entities.PersonaIdentificacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T14:24:27")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> primerApellido;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile SingularAttribute<Persona, Integer> idPais;
    public static volatile SingularAttribute<Persona, Date> fechaRegistro;
    public static volatile SingularAttribute<Persona, String> idTipoIdentificacion;
    public static volatile SingularAttribute<Persona, String> direccion;
    public static volatile ListAttribute<Persona, PersonaIdentificacion> personaIdentificacionList;
    public static volatile SingularAttribute<Persona, String> segundoApellido;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile ListAttribute<Persona, NacionalidadPersona> nacionalidadPersonaList;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile SingularAttribute<Persona, String> idGenero;
    public static volatile SingularAttribute<Persona, Integer> nroIdentificacion;
    public static volatile SingularAttribute<Persona, Long> idPersona;

}