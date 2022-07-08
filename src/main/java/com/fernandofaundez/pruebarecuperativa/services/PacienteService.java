package com.fernandofaundez.pruebarecuperativa.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandofaundez.pruebarecuperativa.models.Paciente;
import com.fernandofaundez.pruebarecuperativa.respositories.PacienteRepository;

@Service
public class PacienteService {
    /* Se llama al Repository (Insyeccion de dependencias) */
    @Autowired //Realiza la inyeccion de dependencia
    PacienteRepository pacienteRepository;

    /* Metodo que guarda los datos capturados en DB, este metodo es utilisado por el service */
    public void guardarPaciente(@Valid Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    /* Este metodo me muestra o me devuelvo una lista de los objetos(todo sus valores) */
    public List<Paciente> finAll() {
        return pacienteRepository.findAll();
    }
}
