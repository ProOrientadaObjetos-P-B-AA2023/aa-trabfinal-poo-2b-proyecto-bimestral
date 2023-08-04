/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pablo
 */
public class PlanPostPagoMinutosMegas extends PlanMovil{
    private double minutos;
    private double costoMinuto;
    private double megasEnGigas;
    private double costoGiga;

    public PlanPostPagoMinutosMegas() {
    }

    public PlanPostPagoMinutosMegas(double minutos, double costoMinuto, double megasEnGigas, double costoGiga) {
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
    }

    public PlanPostPagoMinutosMegas(double minutos, double costoMinuto, double megasEnGigas, double costoGiga, int idPlan, String nombre, String idCliente, double costoTotal) {
        super(idPlan, nombre, idCliente, costoTotal);
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
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

    public double getMegasEnGigas() {
        return megasEnGigas;
    }

    public void setMegasEnGigas(double megasEnGigas) {
        this.megasEnGigas = megasEnGigas;
    }

    public double getCostoGiga() {
        return costoGiga;
    }

    public void setCostoGiga(double costoGiga) {
        this.costoGiga = costoGiga;
    }

    @Override
    public void calcularCostoTotal() {
        
    }

    @Override
    public String toString() {
        return "PlanPostPagoMinutosMegas{" + "minutos=" + minutos + ", costoMinuto=" + costoMinuto + ", megasEnGigas=" + megasEnGigas + ", costoGiga=" + costoGiga + '}';
    }
    
}
