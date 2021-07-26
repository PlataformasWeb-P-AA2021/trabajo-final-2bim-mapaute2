package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutor {
    private static List<PlanCelular> listaPlanes;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opc;
        System.out.println("Bienvenido al sistema de control de Planes Moviles.");

        listaPlanes = Serializador.deserializar();

        if (listaPlanes == null)
            listaPlanes = new ArrayList<>();

        do {
            System.out.println("Elija que desea hacer en este momento: ");
            System.out.println("\t1. Ingresar un plan movil.");
            System.out.println("\t2. Ver Lista de Planes Moviles");
            System.out.println("\t3. Salir del sistema");
            System.out.print("Su selección: ");
            opc = entrada.next();

            System.out.println();

            switch (opc){
                case "1" -> insertarPlanMovil();
                case "2" -> mostrarListaPlanes();
                case "3" -> System.out.println("Listado de planes registrados son: ");
                default -> System.out.println("Error: Ha ingresado una opción no valida, vuelva a ingresar la opción");
            }
        }while (!opc.equals("3"));

        Serializador.serializar(listaPlanes);
        mostrarListaPlanes();
    }

    private static void insertarPlanMovil(){
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String marca;
        String modelo;
        String numero;
        double megas;
        double costoGigas;
        double minutos;
        double costoMinutos;

        do {
            System.out.println("Elija que plan de celular quiere registrar: ");
            System.out.println("\t1. Plan PostPago Minutos");
            System.out.println("\t2. Plan PostPago Megas");
            System.out.println("\t3. Plan PostPago Minutos y Megas");
            System.out.println("\t4. Plan PostPago Minutos y Megas Economico");
            System.out.print("Su selección: ");
            String opc = entrada.next();

            switch (opc){
                case "1" -> {
                    Persona p = crearPersona();

                    entrada.nextLine();
                    System.out.println("Ingrese la cuidad: ");
                    ciudad = entrada.nextLine();
                    System.out.println("Ingrese la marca del celular: ");
                    marca= entrada.nextLine();
                    System.out.println("Ingrese el modelo del celular: ");
                    modelo = entrada.nextLine();
                    System.out.println("Ingrese el número telefonico del usuario: ");
                    numero = entrada.nextLine();

                    System.out.println("Ingrese los minutos nacionales que posee el usuario: ");
                    double minutosN = entrada.nextDouble();
                    System.out.println("Ingrese el costo de los minutos nacionales para el usuario: ");
                    double costoMinutosN = entrada.nextDouble();
                    System.out.println("Ingrese los minutos internacionales que posee el usuario: ");
                    double minutosI = entrada.nextDouble();
                    System.out.println("Ingrese el costo de los minutos internacionales para el usuario: ");
                    double costoMinutosI = entrada.nextDouble();

                    listaPlanes.add(new PlanPostPagoMinutos(p, ciudad, marca, modelo, numero, minutosN, costoMinutosN,
                            minutosI, costoMinutosI));
                    return;
                }
                case "2" -> {
                    Persona p = crearPersona();

                    entrada.nextLine();
                    System.out.println("Ingrese la cuidad: ");
                    ciudad = entrada.nextLine();
                    System.out.println("Ingrese la marca del celular: ");
                    marca= entrada.nextLine();
                    System.out.println("Ingrese el modelo del celular: ");
                    modelo = entrada.nextLine();
                    System.out.println("Ingrese el número telefonico del usuario: ");
                    numero = entrada.nextLine();

                    System.out.println("Ingrese la megas del plan: ");
                    megas = entrada.nextDouble();
                    System.out.println("Ingrese el costo por giga del plan: ");
                    costoGigas = entrada.nextDouble();
                    System.out.println("Ingrese la tarifa base del plan: ");
                    double tarifaBase = entrada.nextDouble();

                    listaPlanes.add(new PlanPostPagoMegas(p, ciudad, marca, modelo, numero, megas, costoGigas, tarifaBase));
                    return;
                }
                case "3" -> {
                    Persona p = crearPersona();

                    entrada.nextLine();
                    System.out.println("Ingrese la cuidad: ");
                    ciudad = entrada.nextLine();
                    System.out.println("Ingrese la marca del celular: ");
                    marca= entrada.nextLine();
                    System.out.println("Ingrese el modelo del celular: ");
                    modelo = entrada.nextLine();
                    System.out.println("Ingrese el número telefonico del usuario: ");
                    numero = entrada.nextLine();

                    System.out.println("Ingrese los minutos que va tener el plan: ");
                    minutos = entrada.nextDouble();
                    System.out.println("Ingrese el costo por minuto que va a tener el plan: ");
                    costoMinutos = entrada.nextDouble();
                    System.out.println("Ingrese la megas del plan: ");
                    megas = entrada.nextDouble();
                    System.out.println("Ingrese el costo por giga del plan: ");
                    costoGigas = entrada.nextDouble();

                    listaPlanes.add(new PlanPostPagoMinutosMegas(p, ciudad, marca, modelo, numero, minutos,
                            costoMinutos, megas, costoGigas));
                    return;
                }
                case "4" -> {
                    Persona p = crearPersona();

                    entrada.nextLine();
                    System.out.println("Ingrese la cuidad: ");
                    ciudad = entrada.nextLine();
                    System.out.println("Ingrese la marca del celular: ");
                    marca= entrada.nextLine();
                    System.out.println("Ingrese el modelo del celular: ");
                    modelo = entrada.nextLine();
                    System.out.println("Ingrese el número telefonico del usuario: ");
                    numero = entrada.nextLine();

                    System.out.println("Ingrese los minutos que va tener el plan: ");
                    minutos = entrada.nextDouble();
                    System.out.println("Ingrese el costo por minuto que va a tener el plan: ");
                    costoMinutos = entrada.nextDouble();
                    System.out.println("Ingrese la megas del plan: ");
                    megas = entrada.nextDouble();
                    System.out.println("Ingrese el costo por giga del plan: ");
                    costoGigas = entrada.nextDouble();
                    System.out.println("Ingrese el descuento que va a tener el plan: ");
                    double descuento = entrada.nextDouble();

                    listaPlanes.add(new PlanPostPagoMinutosMegasEconomico(p, ciudad, marca, modelo, numero, minutos,
                            costoMinutos, megas, costoGigas, descuento));
                    return;
                }
                default -> System.out.println("Error: Ha ingresado una opción no valida, vuelva a ingresar la opción");
            }
        }while (true);
    }

    private static Persona crearPersona(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        String identificacion;

        System.out.println("Ingrese el Nombre Propietario del plan: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Apellido Propietario del plan: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese la indentificación del Propietario: ");
        identificacion = entrada.nextLine();

        return new Persona(nombre, apellido, identificacion);
    }

    private static void mostrarListaPlanes(){
        int i = 1;
        System.out.println();
        for (PlanCelular plan: listaPlanes) {
            System.out.println("---------------"+i+"---------------");
            System.out.println(plan+"\n");
            i++;
        }
    }
}
