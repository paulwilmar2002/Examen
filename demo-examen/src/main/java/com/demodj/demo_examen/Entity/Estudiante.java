package com.demodj.demo_examen.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;
    private String Apellido;
    private String Direccin;
    private String Edad;
    private String Correo;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String apellido, String direccin, String edad, String correo) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Direccin = direccin;
        Edad = edad;
        Correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccin() {
        return Direccin;
    }

    public void setDireccin(String direccin) {
        Direccin = direccin;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
