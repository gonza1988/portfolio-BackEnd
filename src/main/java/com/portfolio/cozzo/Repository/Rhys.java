
package com.portfolio.cozzo.Repository;

import com.portfolio.cozzo.Entity.HyS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Rhys extends JpaRepository<HyS, Integer>{
    
    Optional<HyS> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
