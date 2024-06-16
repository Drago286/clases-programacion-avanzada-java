package Ayudantia4;

import Ayudantia4.Model.Persona;
import Ayudantia4.Service.Sistema;
import Ayudantia4.Service.SistemaImpl;
import Ayudantia4.Util.Instalador;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class main {
    public static void main(String[] args) {
        Sistema nuevoSistema = instalarSistema();

        boolean menu = true;
        while(menu) {
            StdOut.println("Seleccione una opcion: \n1)Ingresar Persona \n2)Modificar Persona \n3)Eliminar persona");
            int opcion = StdIn.readInt();
            switch (opcion){
                case 1:
                    ingresarPersona(nuevoSistema);
                    break;
                case 2:
                    modificarPersona(nuevoSistema);
                    break;
                case 3:
                    eliminarPersona(nuevoSistema);
                    break;
            }
        }


    }
    private static Sistema instalarSistema(){
        Instalador instalador = new Instalador();
        return  instalador.InyectorSistema();
    }
    public static void ingresarPersona(Sistema nuevoSistema){
        StdOut.println("Ingrese el nombre de la persona:");
        String nombre =  StdIn.readString();
        StdOut.println("Ingrese el rut de la persona:");
        String RUT =  StdIn.readString();
        StdOut.println("Ingrese el fechaNacimiento de la persona:");
        String fechaNacimiento =  StdIn.readString();

        Persona nuevaPersona = new Persona(RUT,fechaNacimiento,nombre);

        StdOut.println(nuevoSistema.ingresarPersona(nuevaPersona));

    }
    public static void modificarPersona(Sistema nuevoSistema){
        StdOut.println("Ingrese rut:");
        String rutBuscado = StdIn.readString();

        int posicionPersona  = nuevoSistema.buscarPersona(rutBuscado);
        if (posicionPersona != -1){

            StdOut.println("Informacion actual:");
            StdOut.println( nuevoSistema.desplegarInformacion(posicionPersona));

            StdOut.println("Indique el nombre:");
            String nombre = StdIn.readString();
            nuevoSistema.modificarPersona(posicionPersona,nombre);

            StdOut.println("Informacion actualizada:");
            StdOut.println( nuevoSistema.desplegarInformacion(posicionPersona));

        }else {
            StdOut.println("RUT no encontrado!");
        }

    }
    public static void eliminarPersona(Sistema nuevoSistema){
        StdOut.println("Ingrese rut:");
        String rutBuscado = StdIn.readString();

        int posicionPersona  = nuevoSistema.buscarPersona(rutBuscado);
        if (posicionPersona != -1){

            StdOut.println("Informacion actual:");
            StdOut.println( nuevoSistema.desplegarInformacion(posicionPersona));

            StdOut.println("Seguro que quiere eliminar?:");
            String respuesta = StdIn.readString();
            switch (respuesta){
                case "si":
                    nuevoSistema.eliminarPersona(posicionPersona);
                    break;
                case "no":
                    StdOut.println("gracias!");
                    break;
                default:
                    StdOut.println("opcion no valida");
                    break;
            }
        }else {
            StdOut.println("RUT no encontrado!");
        }

    }
}
