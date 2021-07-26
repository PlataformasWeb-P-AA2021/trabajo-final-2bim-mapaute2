package model;

public class PlanPostPagoMinutos extends PlanCelular{
    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(Persona propietario, String ciudadPropietario, String marcaCelular, String modeloCelular,
                               String numeroCelular, double minutosNacionales, double costoMinutoNacional,
                               double minutosInternacionales, double costoMinutoInternacional) {
        super(propietario, ciudadPropietario, marcaCelular, modeloCelular, numeroCelular);
        this.minutosNacionales = minutosNacionales;
        this.costoMinutoNacional = costoMinutoNacional;
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutoInternacional = costoMinutoInternacional;
        setPagoMensual(calcularPagoMensual());
    }

    @Override
    public double calcularPagoMensual() {
        return (minutosInternacionales * costoMinutoInternacional) + (minutosNacionales * costoMinutoNacional);
    }

    @Override
    public String toString() {
        return "Plan: PostPago Minutos" +
                super.toString()+
                "\n\tMinutos Nacionales: " + minutosNacionales +
                "\n\tCosto Minutos Nacionales: " + costoMinutoNacional +
                "\n\tMinutos Internacionales: " + minutosInternacionales +
                "\n\tCosto Minutos Internacionales: " + costoMinutoInternacional;
    }
}
