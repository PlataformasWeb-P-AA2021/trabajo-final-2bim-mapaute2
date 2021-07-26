package model;

public class PlanPostPagoMegas extends PlanCelular{
    private double megas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(Persona propietario, String ciudadPropietario, String marcaCelular, String modeloCelular,
                             String numeroCelular, double megas, double costoGigas, double tarifaBase) {
        super(propietario, ciudadPropietario, marcaCelular, modeloCelular, numeroCelular);
        setMegas(megas);
        this.costoGigas = costoGigas;
        this.tarifaBase = tarifaBase;
        setPagoMensual(calcularPagoMensual());
    }

    @Override
    public double calcularPagoMensual() {
        return (megas * costoGigas) + tarifaBase;
    }

    public double getMegas() {
        return megas * 1000;
    }

    public void setMegas(double megas) {
        this.megas = megas / 1000;
    }

    public double getCostoGigas() {
        return costoGigas;
    }

    public void setCostoGigas(double costoGigas) {
        this.costoGigas = costoGigas;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public String toString() {
        return "Plan: PostPago Megas" +
                super.toString()+
                "\n\tMegas: " + megas +
                "\n\tCosto Gigas: " + costoGigas +
                "\n\tTarifa Base: " + tarifaBase;
    }
}
