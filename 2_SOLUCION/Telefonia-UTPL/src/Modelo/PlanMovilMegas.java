package Modelo;

public abstract class PlanMovilMegas extends PlanMovil{
    private double megasEnGigas;
    private double costoGiga;

    public PlanMovilMegas() {
    }

    public PlanMovilMegas(double megasEnGigas, double costoGiga) {
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
    }

    public PlanMovilMegas(String nombrePlanMovil, double costoTotal, double megasEnGigas, double costoGiga) {
        super(nombrePlanMovil, costoTotal);
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
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

}
