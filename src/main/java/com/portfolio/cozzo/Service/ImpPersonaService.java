
package com.portfolio.cozzo.Service;

import com.portfolio.cozzo.Entity.Persona;
import com.portfolio.cozzo.Interface.IPersonaService;
import com.portfolio.cozzo.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> personas = iPersonaRepository.findAll();
        return personas;
    }

    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);
    }

    @Override
    public Persona deletePersona(Long id) {
        iPersonaRepository.deleteById(id);
        return null;
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = iPersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
