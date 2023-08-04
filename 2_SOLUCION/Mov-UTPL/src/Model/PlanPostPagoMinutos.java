/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pablo
 */
public class PlanPostPagoMinutos extends PlanMovil{
    private double minutos;
    private double costoMinuto;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos() {
    }

    public PlanPostPagoMinutos(double minutos, double costoMinuto, double minutosInternacionales, double costoMinutoInternacional) {
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

    public PlanPostPagoMinutos(double minutos, double costoMinuto, double minutosInternacionales, double costoMinutoInternacional, int idPlan, String nombre, String idCliente, double costoTotal) {
        super(idPlan, nombre, idCliente, costoTotal);
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }

    public void setCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    public double getMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void setMinutosInternacionales(double minutosInternacionales) {
        this.minutosInternacionales = minutosInternacionales;
    }

    public double getCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    public void setCostoMinutoInternacional(double costoMinutoInternacional) {
        this.costoMinutoInternacional = costoMinutoInternacional;
    }
    
    @Override
    public void calcularCostoTotal(){
    }

    @Override
    public String toString() {
        return "PlanPostPagoMinutos{" + "minutos=" + minutos + ", costoMinuto=" + costoMinuto + ", minutosInternacionales=" + minutosInternacionales + ", costoMinutoInternacional=" + costoMinutoInternacional + '}';
    }
    
}
