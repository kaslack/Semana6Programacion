package com.mycompany.semana6;

public class CentroServicio extends Pacientes{
    
    private String nombreCentroServicio;

    public CentroServicio() {
    }

    public CentroServicio(String nombreCentroServicio) {
        this.nombreCentroServicio = nombreCentroServicio;
    }
    
    public String getNombreCentroServicio() {
        return nombreCentroServicio;
    }

    public void setNombreCentroServicio(String nombreCentroServicio) {
        this.nombreCentroServicio = nombreCentroServicio;
    }
      
}