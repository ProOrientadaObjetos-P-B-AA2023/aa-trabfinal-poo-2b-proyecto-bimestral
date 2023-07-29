package Modelo;

public abstract class PlanMovilMinutosMegas extends PlanMovil{
    private double megasEnGigas;
    private double costoGiga;
    private double minutos;
    private double costoMinuto;

    public PlanMovilMinutosMegas() {
    }

    public PlanMovilMinutosMegas(double megasEnGigas, double costoGiga, double minutos, double costoMinuto) {
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
    }

    public PlanMovilMinutosMegas(String nombrePlanMovil, double costoTotal, double megasEnGigas, double costoGiga, double minutos, double costoMinuto) {
        super(nombrePlanMovil, costoTotal);
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
        this.minutos = minutos;
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
