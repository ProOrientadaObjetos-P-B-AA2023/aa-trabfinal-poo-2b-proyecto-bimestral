package Modelo;

public class PlanPostPagoMegas extends PlanMovilMegas{
    private double tarifaBase;

    public PlanPostPagoMegas() {
    }

    public PlanPostPagoMegas(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public PlanPostPagoMegas(double megasEnGigas, double costoGiga, double tarifaBase) {
        super(megasEnGigas, costoGiga);
        this.tarifaBase = tarifaBase;
    }

    public PlanPostPagoMegas(String nombrePlanMovil, double costoTotal, double megasEnGigas, double costoGiga, double tarifaBase) {
        super(nombrePlanMovil, costoTotal, megasEnGigas, costoGiga);
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularCostoTotal() {
        return 0;
    }
}
