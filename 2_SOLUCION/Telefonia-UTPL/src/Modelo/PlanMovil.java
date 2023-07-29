package Modelo;

public abstract class PlanMovil {
    private String nombrePlanMovil;
    private double costoTotal;

    public PlanMovil() {
    }

    public PlanMovil(String nombrePlanMovil, double costoTotal) {
        this.nombrePlanMovil = nombrePlanMovil;
        this.costoTotal = costoTotal;
    }

    public String getNombrePlanMovil() {
        return nombrePlanMovil;
    }

    public void setNombrePlanMovil(String nombrePlanMovil) {
        this.nombrePlanMovil = nombrePlanMovil;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public abstract double calcularCostoTotal();

    @Override
    public String toString() {
        return "PlanMovil{" +
                "nombrePlanMovil='" + nombrePlanMovil + '\'' +
                ", costoTotal=" + costoTotal +
                '}';
    } 
}
