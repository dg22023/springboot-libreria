package com.example.JpaConectionDBwithClasses.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fechaNacimiento;

    @OneToMany(mappedBy = "autor")
    private List<LibroAutor> libros;

    // Getters and Setters
    public Long getIdAutor() {
        return idAutor;
    }
    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public List<LibroAutor> getLibros() {
        return libros;
    }
    public void setLibros(List<LibroAutor> libros) {
        this.libros = libros;
    }
    public void addLibro(LibroAutor libroAutor) {
        this.libros.add(libroAutor);
        libroAutor.setAutor(this);
    }
    public void removeLibro(LibroAutor libroAutor) {
        this.libros.remove(libroAutor);
        libroAutor.setAutor(null);
    }



    
}
