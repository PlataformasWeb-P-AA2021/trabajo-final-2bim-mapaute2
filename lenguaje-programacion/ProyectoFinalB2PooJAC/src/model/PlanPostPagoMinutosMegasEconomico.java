package model;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular{
    private double minutos;
    private double costoMinutos;
    private double megas;
    private double costoGigas;
    private double descuento;

    public PlanPostPagoMinutosMegasEconomico(Persona propietario, String ciudadPropietario, String marcaCelular,
                                             String modeloCelular, String numeroCelular, double minutos,
                                             double costoMinutos, double megas, double costoGigas, double descuento) {
        super(propietario, ciudadPropietario, marcaCelular, modeloCelular, numeroCelular);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megas = megas;
        this.costoGigas = costoGigas;
        setDescuento(descuento);
        setPagoMensual(calcularPagoMensual());
    }

    @Override
    public double calcularPagoMensual() {
        return ((minutos * costoMinutos) + (megas * costoGigas)) * (1 - descuento);
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

    public double getDescuento() {
        return descuento * 100;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento / 100;
    }

    @Override
    public String toString() {
        return "Plan: PostPago Minutos Megas Economico" +
                super.toString()+
                "\n\tMinutos: " + minutos +
                "\n\tCosto Minutos: " + costoMinutos +
                "\n\tMegas: " + getMegas() +
                "\n\tCosto Gigas: " + costoGigas +
                "\n\tDescuento: " + descuento;
    }
}
