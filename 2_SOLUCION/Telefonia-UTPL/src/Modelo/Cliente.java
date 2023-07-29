package Modelo;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String cedula;
    private String ciudad;
    private String marcaCelular;
    private String modeloCelular;
    private String numeroCelular;
    private double pagoMensual;
    private String correoElectronico; // Atributo Añadido
    private ArrayList<PlanMovil> planesMoviles; // Atributo Añadido

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, String ciudad, String marcaCelular, String modeloCelular, String numeroCelular, double pagoMensual, String correoElectronico) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.marcaCelular = marcaCelular;
        this.modeloCelular = modeloCelular;
        this.numeroCelular = numeroCelular;
        this.pagoMensual = pagoMensual;
        this.correoElectronico = correoElectronico;
        this.planesMoviles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMarcaCelular() {
        return marcaCelular;
    }

    public void setMarcaCelular(String marcaCelular) {
        this.marcaCelular = marcaCelular;
    }

    public String getModeloCelular() {
        return modeloCelular;
    }

    public void setModeloCelular(String modeloCelular) {
        this.modeloCelular = modeloCelular;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<PlanMovil> getPlanesMoviles() {
        return planesMoviles;
    }

    public void setPlanesMoviles(ArrayList<PlanMovil> planesMoviles) {
        this.planesMoviles = planesMoviles;
    }

    public void insertarPlanMovil(PlanMovil planMovil) {
        if (planesMoviles.size() < 2) {
            planesMoviles.add(planMovil);
        } else {
            System.out.println("UPPS LIMITE ALCANZADO!!!");
        }
    }

    public void eliminarPlanMovil(PlanMovil planMovil) {
        planesMoviles.remove(planMovil);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", marcaCelular='" + marcaCelular + '\'' +
                ", modeloCelular='" + modeloCelular + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", pagoMensual=" + pagoMensual +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", planesMoviles=" + planesMoviles +
                '}';
    }
}

