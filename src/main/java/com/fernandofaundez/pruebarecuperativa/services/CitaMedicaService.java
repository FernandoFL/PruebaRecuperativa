package com.fernandofaundez.pruebarecuperativa.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandofaundez.pruebarecuperativa.models.CitaMedica;
import com.fernandofaundez.pruebarecuperativa.respositories.CitaMedicaRepository;

@Service
public class CitaMedicaService {
    /* Se llama al Repository (Insyeccion de dependencias) */
    @Autowired //Realiza la inyeccion de dependencia
    CitaMedicaRepository citaMedicaRepository;

    /* Metodo que guarda los datos capturados en DB, este metodo es utilisado por el service */
    public void guardarPaciente(@Valid CitaMedica citaMedica) {
        citaMedicaRepository.save(citaMedica);
    }

    /* Este metodo me muestra o me devuelvo una lista de los objetos(todo sus valores) */
    public List<CitaMedica> finAll() {
        return citaMedicaRepository.findAll();
    }
}
