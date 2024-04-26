package com.softtek.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="alumnos_profesores")
@IdClass(AlumnoProfesorPK.class)
public class AlumnoProfesor {
    @Id
    private Alumno alumno;
    @Id
    private Profesor profesor;

}
