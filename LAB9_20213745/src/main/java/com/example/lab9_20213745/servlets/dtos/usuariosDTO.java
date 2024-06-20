package com.example.lab9_20213745.servlets.dtos;

public class usuariosDTO {
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private int telefono;
    private int idlicencia;
    private String licencia_categoria;

    private String licencia_fecha_emision;
    private String licencia_fecha_caducidad;
    private int idpais;
    private String nombre_pais;


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdlicencia() {
        return idlicencia;
    }

    public void setIdlicencia(int idlicencia) {
        this.idlicencia = idlicencia;
    }

    public String getLicencia_categoria() {
        return licencia_categoria;
    }

    public void setLicencia_categoria(String licencia_categoria) {
        this.licencia_categoria = licencia_categoria;
    }

    public String getLicencia_fecha_emision() {
        return licencia_fecha_emision;
    }

    public void setLicencia_fecha_emision(String licencia_fecha_emision) {
        this.licencia_fecha_emision = licencia_fecha_emision;
    }

    public String getLicencia_fecha_caducidad() {
        return licencia_fecha_caducidad;
    }

    public void setLicencia_fecha_caducidad(String licencia_fecha_caducidad) {
        this.licencia_fecha_caducidad = licencia_fecha_caducidad;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }
}
