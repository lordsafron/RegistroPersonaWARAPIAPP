package com.hm.registropersonawarapiapp.entities;

import com.hm.registropersonawarapiapp.entities.Persona;
import com.hm.registropersonawarapiapp.entities.TipoIdentificacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-31T20:08:24")
@StaticMetamodel(PersonaIdentificacion.class)
public class PersonaIdentificacion_ { 

    public static volatile SingularAttribute<PersonaIdentificacion, Integer> idPersonaIdentificacion;
    public static volatile SingularAttribute<PersonaIdentificacion, TipoIdentificacion> idTipoIdentificacion;
    public static volatile SingularAttribute<PersonaIdentificacion, Persona> idPersona;

}