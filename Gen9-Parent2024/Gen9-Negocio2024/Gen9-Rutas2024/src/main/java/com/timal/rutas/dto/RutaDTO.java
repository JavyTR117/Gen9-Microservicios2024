package com.timal.rutas.dto;

import java.time.LocalDate;

public class RutaDTO {
    private Long id;
    private Long choferId;
    private String nombreCompleto;
    private String licenciaChofer;
    
    private Long camionId;
    private String matricula;
    private Integer modelo;
    private String marca;

    private Float distancia;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegadaEstimada;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getChoferId() {
        return choferId;
    }
    public void setChoferId(Long choferId) {
        this.choferId = choferId;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getLicenciaChofer() {
        return licenciaChofer;
    }
    public void setLicenciaChofer(String licenciaChofer) {
        this.licenciaChofer = licenciaChofer;
    }
    public Long getCamionId() {
        return camionId;
    }
    public void setCamionId(Long camionId) {
        this.camionId = camionId;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Integer getModelo() {
        return modelo;
    }
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Float getDistancia() {
        return distancia;
    }
    public void setDistancia(Float distancia) {
        this.distancia = distancia;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public LocalDate getFechaLlegadaEstimada() {
        return fechaLlegadaEstimada;
    }
    public void setFechaLlegadaEstimada(LocalDate fechaLlegadaEstimada) {
        this.fechaLlegadaEstimada = fechaLlegadaEstimada;
    }

    
}
