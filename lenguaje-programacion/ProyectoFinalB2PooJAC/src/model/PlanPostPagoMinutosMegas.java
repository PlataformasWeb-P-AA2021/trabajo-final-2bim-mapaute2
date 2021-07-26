package model;

public class PlanPostPagoMinutosMegas extends PlanCelular{
    private double minutos;
    private double costoMinutos;
    private double megas;
    private double costoGigas;

    public PlanPostPagoMinutosMegas(Persona propietario, String ciudadPropietario, String marcaCelular,
                                    String modeloCelular, String numeroCelular, double minutos, double costoMinutos,
                                    double megas, double costoGigas) {
        super(propietario, ciudadPropietario, marcaCelular, modeloCelular, numeroCelular);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        setMegas(megas);
        this.costoGigas = costoGigas;
        setPagoMensual(calcularPagoMensual());
    }

    @Override
    public double calcularPagoMensual() {
        return (minutos * costoMinutos) + (megas * costoGigas);
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double getCostoMinutos() {
        return costoMinutos;
    }

    public void setCostoMinutos(double costoMinutos) {
        this.costoMinutos = costoMinutos;
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

    @Override
    public String toString() {
        return "Plan: PostPago Minutos Megas" +
                super.toString()+
                "\n\tMinutos: " + minutos +
                "\n\tCosto Minutos: " + costoMinutos +
                "\n\tMegas: " + getMegas() +
                "\n\tCosto Gigas: " + costoGigas;
    }
}
