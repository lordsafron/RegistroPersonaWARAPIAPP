/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.registropersonawarapiapp.service;

import com.hm.registropersonawarapiapp.dao.GeneroDAO;
import com.hm.registropersonawarapiapp.entities.Genero;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author HugoM
 */
@Stateless
public class GeneroService {
    
    @EJB
    private GeneroDAO generoDAO;
    
    public List<Genero> getAllGeners() {
        return generoDAO.getAllGeners();
    }
    
    public Genero getrByGener(String idGenero){
        return generoDAO.getrByGener(idGenero);
    }
    
}
