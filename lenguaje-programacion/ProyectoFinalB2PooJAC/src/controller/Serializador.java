package controller;

import model.PlanCelular;

import java.io.*;
import java.util.List;

public class Serializador {
    public static void serializar(List<PlanCelular> obj){
        try(FileOutputStream file = new FileOutputStream("planes.data/");
            ObjectOutputStream outputStream = new ObjectOutputStream(file)){

            outputStream.writeObject(obj);
        }catch (IOException e){
            e.printStackTrace(System.out);
        }
    }

    public static List<PlanCelular> deserializar(){
        try(FileInputStream file = new FileInputStream("planes.data");
            ObjectInputStream inputStream = new ObjectInputStream(file)){

            return (List<PlanCelular>) inputStream.readObject();
        }catch (IOException e){
            System.out.println("Error: No se han encontrado registros anteriores.");
        }catch (ClassCastException | ClassNotFoundException e){
            System.out.println("Error: Hubo un problema con el archivo donde se almacenaba la informacion.");
        }
        return null;
    }
}
