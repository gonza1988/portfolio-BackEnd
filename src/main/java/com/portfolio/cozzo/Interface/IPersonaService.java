
package com.portfolio.cozzo.Interface;

import com.portfolio.cozzo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto persona por Id
    public Persona deletePersona(Long id);
    
    //Buscar un objeto persona por Id
    public Persona findPersona(Long id);
    
    
}
