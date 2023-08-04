/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pablo
 */
public abstract class PlanMovil {
    private int idPlan;
    private String nombre;
    private String idCliente;
    private double costoTotal;

    public PlanMovil() {
    }

    public PlanMovil(int idPlan, String nombre, String idCliente, double costoTotal) {
        this.idPlan = idPlan;
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.costoTotal = costoTotal;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    public abstract void calcularCostoTotal();

    @Override
    public String toString() {
        return "PlanMovil{" + "idPlan=" + idPlan + ", nombre=" + nombre + ", idCliente=" + idCliente + ", costoTotal=" + costoTotal + '}';
    }
    
}
