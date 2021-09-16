package com.example.arraylist_estudiantes;

public class ClsEstudiantes {

    private String carnet;
    private String nombre;
    private String carrera;
    private String semestre;


    public ClsEstudiantes(String carnet, String nombre, String carrera, String semestre) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public ClsEstudiantes() {
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "ClsEstudiantes{" +
                "carnet='" + carnet + '\'' +
                ", nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }
}
