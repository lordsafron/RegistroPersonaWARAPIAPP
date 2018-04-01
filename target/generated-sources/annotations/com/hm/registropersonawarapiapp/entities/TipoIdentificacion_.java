package com.hm.registropersonawarapiapp.entities;

import com.hm.registropersonawarapiapp.entities.PersonaIdentificacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-31T20:08:24")
@StaticMetamodel(TipoIdentificacion.class)
public class TipoIdentificacion_ { 

    public static volatile SingularAttribute<TipoIdentificacion, String> descripcionIdentificacion;
    public static volatile SingularAttribute<TipoIdentificacion, String> idTipoIdentificacion;
    public static volatile ListAttribute<TipoIdentificacion, PersonaIdentificacion> personaIdentificacionList;

}