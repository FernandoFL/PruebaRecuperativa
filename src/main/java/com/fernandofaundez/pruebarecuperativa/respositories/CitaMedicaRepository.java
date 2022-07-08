package com.fernandofaundez.pruebarecuperativa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernandofaundez.pruebarecuperativa.models.CitaMedica;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Long>{
    
}
