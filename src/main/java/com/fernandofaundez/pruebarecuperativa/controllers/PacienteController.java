package com.fernandofaundez.pruebarecuperativa.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fernandofaundez.pruebarecuperativa.models.Paciente;
import com.fernandofaundez.pruebarecuperativa.services.PacienteService;

@Controller
/* Permite ejecutar código cada vez que se realice una solicitud HTTP */
@RequestMapping("/registro")
public class PacienteControllers {

    /* Inyeccion de la dependencia del service */
    @Autowired
    PacienteService pacienteService;
    
    /* Despliegue resgistro paciente */
    @RequestMapping("")
    public String registroPaciente(@ModelAttribute("paciente") Paciente Paciente) {
        return "registroPaciente.jsp";
    }

    @PostMapping("/paciente") // url por donde vienen los datos enviados desde el form
    public String capturaPaciente(@Valid @ModelAttribute("paciente") Paciente paciente, BindingResult resultado, Model model) {
        /* Se valida si es que existe un error en el ingreso de datos */
        if (resultado.hasErrors()) {
            model.addAttribute("msgError", "Uno o más datos estan incorrectos");
            return "registroPaciente.jsp";
        }else{
            /* Si no hay errores se envia la informacion a la DB */
            pacienteService.guardarPaciente(paciente);// guarda la informacion
            /* obtener una lista de pacientes 
            List<Paciente> listaPacientes=pacienteService.finAll();*/
            /* Pasamos los valores de la listaAutos al jsp 
            model.addAttribute("pacientesCapturados", listaPacientes);*/
            return "registroCitaMedica.jsp";
        }
        
    }
}
