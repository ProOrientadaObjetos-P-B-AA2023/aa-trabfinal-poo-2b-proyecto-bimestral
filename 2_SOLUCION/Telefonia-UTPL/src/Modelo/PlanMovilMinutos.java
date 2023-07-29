package Modelo;

public abstract class PlanMovilMinutos extends PlanMovil{
    private double minutos;
    private double costoMinuto;

    public PlanMovilMinutos() {
    }

    public PlanMovilMinutos(double minutos, double costoMinuto) {
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
    }

    public PlanMovilMinutos(String nombrePlanMovil, double costoTotal, double minutos, double costoMinuto) {
        super(nombrePlanMovil, costoTotal);
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
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
}
