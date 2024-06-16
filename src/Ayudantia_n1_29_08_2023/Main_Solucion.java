package Ayudantia_n1_29_08_2023;
import edu.princeton.cs.stdlib.StdOut;
import java.util.Random;
import java.util.Scanner;

public class Main_Solucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []alumnos = new int[30];
        boolean menu = true;
        StdOut.println("Seleccione una opcion: ");
        StdOut.println("a) Generar fila \nb) Ordenar fila \nc) Estadisticas \nd) Salir");
        char opcion = scanner.next().charAt(0);
        while (menu){

            if (opcion == 'a') {
                alumnos = generarFila(alumnos.length);
            }
            if (opcion == 'b'){
                alumnos = ordenarArreglo(alumnos);
            }
            if (opcion == 'c'){
                mostrarEstadisticas(alumnos);
            }
            if (opcion == 'd'){
                break;
            }
            StdOut.println("Seleccione una opcion: ");
            StdOut.println("a) Generar fila \nb) Ordenar fila \nc) Estadisticas \nd) Salir");
            opcion = scanner.next().charAt(0);
        }
    }
    public static int[] generarFila(int largo){
        Random random = new Random();
        int [] alumnos = new int[largo];

        //Ingreso de alumnos al arreglo - declaracion de la fila
        for (int i = 0; i<alumnos.length;i++) {
            alumnos[i] = random.nextInt(15,19);
        }
        StdOut.println("La lista de edades es:");
        for (int i = 0; i < alumnos.length ; i++) {
            StdOut.print("|"+alumnos[i]);
        }
        StdOut.println("|");
        return alumnos;
    }
    public static int[] ordenarArreglo(int [] arreglo){

        //Ordenamiento burbuja
        boolean ordenado = false;
        int n = arreglo.length;
        while(!ordenado) {
            ordenado = true;
            for (int i = 1 ; i <= n -1 ; i++) {
                if (arreglo [i - 1] > arreglo[i]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[i-1];
                    arreglo[i-1] = aux;
                    ordenado = false;
                }
            }
            n--;
        }
        StdOut.println("La lista de edades ordenadas es:");
        for (int i = 0; i < arreglo.length ; i++) {
            StdOut.print("|"+arreglo[i]);
        }
        StdOut.println("|");
       return arreglo;
    }
    public static void mostrarEstadisticas(int[] arreglo) {

        int[] frecuencia = new int[30];

        // Calcular la frecuencia de cada edad
        for (int i = 0; i < arreglo.length; i++) {
            frecuencia[arreglo[i]]++;
        }
        int totalNumeros = arreglo.length;

        StdOut.println("Estadísticas:");
        for (int i = 0; i < frecuencia.length - 1; i++) {
            if (frecuencia[i] > 0) {
                double porcentaje = (1.0 * frecuencia[i] / totalNumeros) * 100;
                StdOut.println(i + " anios: " + porcentaje + "%");
            }
        }
    }
}

