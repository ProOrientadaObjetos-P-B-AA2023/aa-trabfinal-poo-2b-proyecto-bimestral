/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pablo
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanMovil{
    private double minutos;
    private double costoMinuto;
    private double megasEnGigas;
    private double costoGiga;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico() {
    }

    public PlanPostPagoMinutosMegasEconomico(double minutos, double costoMinuto, double megasEnGigas, double costoGiga, double porcentajeDescuento) {
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public PlanPostPagoMinutosMegasEconomico(double minutos, double costoMinuto, double megasEnGigas, double costoGiga, double porcentajeDescuento, int idPlan, String nombre, String idCliente, double costoTotal) {
        super(idPlan, nombre, idCliente, costoTotal);
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
        this.porcentajeDescuento = porcentajeDescuento;
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

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    
    @Override
    public void calcularCostoTotal(){
        double calculo = (minutos * costoMinuto) + (megasEnGigas * costoGiga);
        super.setCostoTotal(calculo - (calculo * porcentajeDescuento / 100));
    }

    @Override
    public String toString() {
        return "PlanPostPagoMinutosMegasEconomico{" + "minutos=" + minutos + ", costoMinuto=" + costoMinuto + ", megasEnGigas=" + megasEnGigas + ", costoGiga=" + costoGiga + ", porcentajeDescuento=" + porcentajeDescuento + '}';
    }
    
}
