/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.registropersonawarapiapp.service;

import com.hm.registropersonawarapiapp.dao.TipoIdentificacionDAO;
import com.hm.registropersonawarapiapp.entities.TipoIdentificacion;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author HugoM
 */
@Stateless
public class TipoIdentificacionService {
    
    @EJB
    private TipoIdentificacionDAO tipoIdentificacionDAO;
    
    public List<TipoIdentificacion> getAllIdentificationType() {
        return tipoIdentificacionDAO.getAllIdentificationType();
    }
    
    public TipoIdentificacion getByIdIdentificationType(String idTipoIdentificacion){
        return tipoIdentificacionDAO.getByIdIdentificationType(idTipoIdentificacion);
    }
}
