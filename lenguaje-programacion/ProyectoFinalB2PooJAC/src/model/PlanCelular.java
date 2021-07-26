package model;

import java.io.Serializable;

public abstract class PlanCelular implements Serializable {
    private Persona propietario;
    private String ciudadPropietario;
    private String marcaCelular;
    private String modeloCelular;
    private String numeroCelular;
    private double pagoMensual;

    public PlanCelular(Persona propietario, String ciudadPropietario, String marcaCelular, String modeloCelular, String numeroCelular) {
        this.propietario = propietario;
        this.ciudadPropietario = ciudadPropietario;
        this.marcaCelular = marcaCelular;
        this.modeloCelular = modeloCelular;
        this.numeroCelular = numeroCelular;
    }

    public abstract double calcularPagoMensual();

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public String getCiudadPropietario() {
        return ciudadPropietario;
    }

    public void setCiudadPropietario(String ciudadPropietario) {
        this.ciudadPropietario = ciudadPropietario;
    }

    public String getMarcaCelular() {
        return marcaCelular;
    }

    public void setMarcaCelular(String marcaCelular) {
        this.marcaCelular = marcaCelular;
    }

    public String getModeloCelular() {
        return modeloCelular;
    }

    public void setModeloCelular(String modeloCelular) {
        this.modeloCelular = modeloCelular;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    @Override
    public String toString() {
        return "\n\tPropietario: " + propietario +
                "\n\tCiudad del Propietario: " + ciudadPropietario +
                "\n\tMarca del Celular: " + marcaCelular +
                "\n\tModelo del Celular: " + modeloCelular +
                "\n\tNumero del Celular: " + numeroCelular +
                "\n\tPago Mensual: " + pagoMensual;
    }
}
