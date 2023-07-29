package Modelo;

public class PlanPostPagoMinutosMegas extends PlanMovilMinutosMegas{
    public PlanPostPagoMinutosMegas() {
    }

    public PlanPostPagoMinutosMegas(double megasEnGigas, double costoGiga, double minutos, double costoMinuto) {
        super(megasEnGigas, costoGiga, minutos, costoMinuto);
    }

    public PlanPostPagoMinutosMegas(String nombrePlanMovil, double costoTotal, double megasEnGigas, double costoGiga, double minutos, double costoMinuto) {
        super(nombrePlanMovil, costoTotal, megasEnGigas, costoGiga, minutos, costoMinuto);
    }

    @Override
    public double calcularCostoTotal() {
        return 0;
    }
}
