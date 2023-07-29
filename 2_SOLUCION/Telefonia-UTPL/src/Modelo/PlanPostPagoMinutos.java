package Modelo;

public class PlanPostPagoMinutos extends PlanMovilMinutos{
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos() {
    }

    public PlanPostPagoMinutos(double minutosInternacionales, double costoMinutoInternacional) {
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

    public PlanPostPagoMinutos(double minutos, double costoMinuto, double minutosInternacionales, double costoMinutoInternacional) {
        super(minutos, costoMinuto);
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

    public PlanPostPagoMinutos(String nombrePlanMovil, double costoTotal, double minutos, double costoMinuto, double minutosInternacionales, double costoMinutoInternacional) {
        super(nombrePlanMovil, costoTotal, minutos, costoMinuto);
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacional = costoMinutoInternacional;
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
    public double calcularCostoTotal() {
        return 0;
    }
}
