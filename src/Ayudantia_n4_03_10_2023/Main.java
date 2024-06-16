package Ayudantia_n4_03_10_2023;

import Ayudantia_n4_03_10_2023.Model.Ciudadano;
import Ayudantia_n4_03_10_2023.Service.Sistema;
import Ayudantia_n4_03_10_2023.Util.Instalador;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Main {
    public static void main(String[] args) {
        Sistema nuevoSistema = instalarSistema();

        boolean menu = true;

        while(menu){
            StdOut.println("Ingrese una opcion: \n1)Registrar ciudadano \n2)Modificar ciudadano \n3) Eliminar ciudadano");
            int opcion  = StdIn.readInt();
            switch (opcion){
                case 1:
                    registrarCiudadano(nuevoSistema);
                    break;
                case 2:
                    modificarCiudadano(nuevoSistema);
                    break;
                case 3:
                    eliminarCiudadano(nuevoSistema);
                    break;

            }
        }
    }



    private static Sistema instalarSistema(){
        Instalador instalador = new Instalador();
        return instalador.InyectorSistema();
    }

    public static void registrarCiudadano(Sistema sistema){
        StdOut.println("Ingrese el nombre del ciudadano:");
        String nombre = StdIn.readString();

        StdOut.println("Ingrese el RUT del ciudadano:");
        String RUT = StdIn.readString();

        StdOut.println("Ingrese la fecha de nacimiento del ciudadano:");
        String fechaNacimiento = StdIn.readString();

        Ciudadano nuevoCiudadano = new Ciudadano(nombre,RUT,fechaNacimiento);

        StdOut.println(sistema.ingresarCiudadano(nuevoCiudadano));

    }
    public static void modificarCiudadano(Sistema nuevoSistema) {
        StdOut.println("indique el rut:");
        String rutBuscar = StdIn.readString();
        int posicion = nuevoSistema.buscarCiudadano(rutBuscar);
        if (posicion != -1){
            StdOut.println("Informacion actual:");
           StdOut.println(nuevoSistema.desplegarInformacion(posicion));

           StdOut.println("Indique el nombre:");
           String nombreModificado = StdIn.readString();

           StdOut.println(nuevoSistema.modificarCiudadano(posicion,nombreModificado));
        }else {
            StdOut.println("Rut no encontrado!");
        }

    }
    public static void eliminarCiudadano(Sistema nuevoSistema){
        StdOut.println("indique el rut:");
        String rutBuscar = StdIn.readString();
        int posicion = nuevoSistema.buscarCiudadano(rutBuscar);
        if (posicion != -1){
            StdOut.println("Informacion actual:");
            StdOut.println(nuevoSistema.desplegarInformacion(posicion));
            StdOut.println("Esta seguro que desea eliminar al ciudadano?");
            String respuesta = StdIn.readString();
            switch (respuesta){
                case "si":
                    StdOut.println(nuevoSistema.eliminarCiudadano(posicion));
                    break;
                case "no":
                    break;
                default:
                    StdOut.println("Respuesta incorrecta!");
                    break;
            }


        }else {
            StdOut.println("Rut no encontrado!");
        }
    }

}

