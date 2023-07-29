package Modelo;

public class PlanPostPagoMinutosMegasEconomico extends PlanMovilMinutosMegas{
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico() {
    }

    public PlanPostPagoMinutosMegasEconomico(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public PlanPostPagoMinutosMegasEconomico(double megasEnGigas, double costoGiga, double minutos, double costoMinuto, double porcentajeDescuento) {
        super(megasEnGigas, costoGiga, minutos, costoMinuto);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public PlanPostPagoMinutosMegasEconomico(String nombrePlanMovil, double costoTotal, double megasEnGigas, double costoGiga, double minutos, double costoMinuto, double porcentajeDescuento) {
        super(nombrePlanMovil, costoTotal, megasEnGigas, costoGiga, minutos, costoMinuto);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularCostoTotal() {
        return 0;
    }
}
