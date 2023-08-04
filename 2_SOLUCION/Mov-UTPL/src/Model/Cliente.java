/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pablo
 */
public class Cliente {
    private String cedula;
    private String nombres;
    private String ciudad;
    private String direccion;
    private String marca;
    private String modelo;
    private String numero;
    private String correo;
    private double pagoMensual;

    public Cliente() {
    }
    
    public Cliente(String cedula, String nombres, String ciudad, String direccion, String marca, String modelo,
            String numero, String correo, double pagoMensual) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.correo = correo;
        this.pagoMensual = pagoMensual;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    @Override
    public String toString() {
        return "Cliente [cedula=" + cedula + ", nombres=" + nombres + ", ciudad=" + ciudad + ", direccion=" + direccion
                + ", marca=" + marca + ", modelo=" + modelo + ", numero=" + numero + ", correo=" + correo
                + ", pagoMensual=" + pagoMensual + "]";
    }
    
}
