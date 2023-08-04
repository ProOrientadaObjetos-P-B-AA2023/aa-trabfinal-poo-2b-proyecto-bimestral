/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pablo
 */
public class PlanPostPagoMegas extends PlanMovil{
    private double megasEnGigas;
    private double costoGiga;
    private double tarifaBase;

    public PlanPostPagoMegas() {
    }

    public PlanPostPagoMegas(double megasEnGigas, double costoGiga, double tarifaBase) {
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
        this.tarifaBase = tarifaBase;
    }

    public PlanPostPagoMegas(double megasEnGigas, double costoGiga, double tarifaBase, int idPlan, String nombre, String idCliente, double costoTotal) {
        super(idPlan, nombre, idCliente, costoTotal);
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
        this.tarifaBase = tarifaBase;
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

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    
    @Override
    public void calcularCostoTotal(){
        super.setCostoTotal((megasEnGigas * costoGiga) + tarifaBase);
    }

    @Override
    public String toString() {
        return "PlanPostPagoMegas [megasEnGigas=" + megasEnGigas + ", costoGiga=" + costoGiga + ", tarifaBase="
                + tarifaBase + "]";
    }
    
    
}
