package Ayudantia_n2_05_09_2023;

import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Main2 {
    public static void main(String[] args) {

        Veterninaria veterinaria = new Veterninaria("Hola", "30",30);

        boolean menu = true;

        while (menu){
            StdOut.println("Seleccione una opcion: \na)Atender mascota \nb)Listar mascotas \nc)Dar de alta \nd)Salir del sistema");
            String opcion = StdIn.readString();
            switch (opcion){
                case "a":
                    veterinaria.atenderMascota();
                    break;
                case "b":
                    veterinaria.listarMascotas();
                    break;
                case "c":
                    veterinaria.darAlta();
                    break;
                case "d":
                    //veterinaria.informeDeSalida();
                    menu = false;
                    break;
                default:
                    StdOut.println("opcion no disponible");
                    break;
            }
        }
    }
}
