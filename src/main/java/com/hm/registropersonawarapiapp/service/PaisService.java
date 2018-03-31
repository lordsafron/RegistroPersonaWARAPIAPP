/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.registropersonawarapiapp.service;

import com.hm.registropersonawarapiapp.dao.PaisDAO;
import com.hm.registropersonawarapiapp.entities.Pais;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author HugoM
 */
@Stateless
public class PaisService {
    
    @EJB
    private PaisDAO paisDAO;
    
    public List<Pais> getAllCountries(){
        return paisDAO.getAllCountries();
    }
    
    public Pais getCountry(int idPais) {
        return paisDAO.getCountry(idPais);
    }
    
}
