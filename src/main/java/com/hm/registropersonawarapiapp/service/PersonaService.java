/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.registropersonawarapiapp.service;

import com.hm.registropersonawarapiapp.dao.PersonaDAO;
import com.hm.registropersonawarapiapp.entities.Persona;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author HugoM
 */
@Stateless
public class PersonaService {
    
    @EJB
    private PersonaDAO personaDAO;
    
    public List<Persona> getAllPersons() {
        return personaDAO.getAllPersons();
    }
    
    public Persona getByPersonId(long idPersona) {
        return personaDAO.getByPersonId(idPersona);
    }
    
    public boolean insertPerson(Persona persona) {
        System.out.println("Llego a service");
        return personaDAO.insertPerson(persona);
    }
    
    public boolean updatePerson(Persona persona) {
        return personaDAO.updatePerson(persona);
    }
    
    public boolean DeletePerson(long idPersona) {
        return personaDAO.DeletePerson(idPersona);
    }
    
}
