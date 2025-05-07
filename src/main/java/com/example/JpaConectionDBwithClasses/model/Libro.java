package com.example.JpaConectionDBwithClasses.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    private String titulo;
    private String isbn;
    private Double precio;
    private Integer stock;
    private Date fechaPublicacion;
    private String editorial;
    private Integer paginas;
    private String descripcion;

    @OneToMany(mappedBy = "libro")
    private List<LibroAutor> autores;

    @OneToMany(mappedBy = "libro")
    private List<DetalleVenta> detallesVenta;

    // Getters and Setters
    public Long getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<LibroAutor> getAutores() {
        return autores;
    }
    public void setAutores(List<LibroAutor> autores) {
        this.autores = autores;
    }
    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }
    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }
    public void addAutor(LibroAutor libroAutor) {
        this.autores.add(libroAutor);
        libroAutor.setLibro(this);
    }
    public void removeAutor(LibroAutor libroAutor) {
        this.autores.remove(libroAutor);
        libroAutor.setLibro(null);
    }
    public void addDetalleVenta(DetalleVenta detalleVenta) {
        this.detallesVenta.add(detalleVenta);
        detalleVenta.setLibro(this);
    }
    public void removeDetalleVenta(DetalleVenta detalleVenta) {
        this.detallesVenta.remove(detalleVenta);
        detalleVenta.setLibro(null);
    }
    
}
