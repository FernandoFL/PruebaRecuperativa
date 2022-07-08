package com.fernandofaundez.pruebarecuperativa.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/* Declaración de entidad */
@Entity
/* Agrega el nombre de la tabla que se creara */
@Table(name = "pacientes")
public class Paciente {
    /* Atributos */

    // Declaracion de mi PK
    @Id
    // Para que el campo sea autoincrimentable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String rut;
    @NotNull
    private String nombre;
    @NotNull
    private Date fechaNacimiento;
    /* Constructores */

    public Paciente() {
    }

    public Paciente(@NotNull String rut, @NotNull String nombre, @NotNull Date fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    /* Setter & Getter */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    


}
