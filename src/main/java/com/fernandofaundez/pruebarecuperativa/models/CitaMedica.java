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
public class CitaMedica {
    /* Atributos */

    // Declaracion de mi PK
    @Id
    // Para que el campo sea autoincrimentable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Date hora;
    @NotNull
    private String areaMedica;
    /* Constructores */
    public CitaMedica() {
    }
    public CitaMedica(@NotNull Date hora, @NotNull String areaMedica) {
        this.hora = hora;
        this.areaMedica = areaMedica;
    }
    /* Setter & Getter */
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getHora() {
        return hora;
    }
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public String getAreaMedica() {
        return areaMedica;
    }
    public void setAreaMedica(String areaMedica) {
        this.areaMedica = areaMedica;
    }
    

}
