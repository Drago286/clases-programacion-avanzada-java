package Ayudantia_n2_05_09_2023.Solucion;

import edu.princeton.cs.stdlib.StdOut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Veterninaria veterninaria = new Veterninaria("SuperDog","Angamos 0610",30);

        boolean menu = true;

        while (menu){
            StdOut.println("Seleccione una opcion: \na)Atender mascota \nb)Listar mascotas \nc)Dar de alta \nd)Salir del sistema");
            String opcion = scanner.nextLine();

            switch (opcion){
                case "a":
                    veterninaria.atenderMascota();
                    break;
                case "b":
                    veterninaria.listarMascotas();
                    break;
                case "c":
                    veterninaria.darAlta();
                    break;
                case "d":
                    veterninaria.generarInforme();
                    menu =false;
                    break;

            }
        }
    }
}
