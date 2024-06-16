package Clases;

import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Main {

    public static void main(String[] args) {
        int cantidadDeEstudiantes = lecturaDeNumeros("Ingrese la cantidad de estudiantes");

        // vector para almacenar objetos de tipo Estudiante
        Estudiante[] listadoDeEstudiantes = new Estudiante[cantidadDeEstudiantes];

        // variables temporales
        String nombre = "";
        int edad = 0;

        // variable a reutilizar para instanciar los objetos
        Estudiante estudianteIngresado;

        // se ingresan los estudiantes
        for (int i = 0; i < listadoDeEstudiantes.length; i++) {
            StdOut.println("Ingrese el nombre del estudiante");
            nombre = StdIn.readLine();

            while (true) {
                edad = lecturaDeNumeros("Ingrese edad del estudiante");

                // se verifica si la edad ingresada es menor a 8
                if (edad < 8) {
                    break;
                }

                StdOut.println("Ha ingresado una edad mayor a ocho");
            }

            // se construye el objeto
            estudianteIngresado = new Estudiante(nombre,edad);

            // se añade al estudiante al vector de estudiantes
            listadoDeEstudiantes[i] = estudianteIngresado;
        }

        // se genera una variable auxiliar de tipo Estudiante para el algoritmo de ordenamiento
        Estudiante estudianteAux;

        // se ordenan los estudiantes por edad de forma ascendente
        for (int i = 0; i < listadoDeEstudiantes.length; i++) {
            for (int j = i + 1; j < listadoDeEstudiantes.length; j++) {
                if (listadoDeEstudiantes[i].getEdad() > listadoDeEstudiantes[j].getEdad()){
                    estudianteAux = listadoDeEstudiantes[i];
                    listadoDeEstudiantes[i] = listadoDeEstudiantes[j];
                    listadoDeEstudiantes[j] = estudianteAux;
                }
            }
        }

        // se presentan los estudiantes en orden
        for (int i = 0; i < listadoDeEstudiantes.length; i++) {
            Estudiante estudianteActual = listadoDeEstudiantes[i];
            StdOut.println("Me llamo " + estudianteActual.getNombre() + ", tengo " + estudianteActual.getEdad() + " años. Presente!");
        }
    }

    /**
     * Sub-programa dedicado a la lectura y validación de numeros entregados por teclado.
     * Pide un valor por teclado hasta que se ingrese un valor numérico
     * @param frase frase a ser impresa en consola
     * @return retorna el valor número numérico ingresado por teclado
     */
    private static int lecturaDeNumeros(String frase){

        // añada sus propios comentarios en esta funcion si es que quiere utilizar este algoritmo en ejercicios o talleres evaluados
        // de modo que se de ha entender que usted sabe como funciona
        while (true) {
            StdOut.println(frase);

            String numeroComoString = StdIn.readLine();

            if (esNumerico(numeroComoString)) {
                return Integer.parseInt(numeroComoString);
            }

            StdOut.println("Lo ingresado no es un numero!");
        }
    }

    /**
     * sub-programa que verifica si el valor ingresado por teclado se puede castear a entero
     * @param numeroComoString valor ingresado por teclado por el usuario como string
     * @return verdadero si es un número, falso en cualquier otro caso
     */
    private static boolean esNumerico(String numeroComoString){
        // añada sus propios comentarios en esta funcion si es que quiere utilizar este algoritmo en ejercicios o talleres evaluados
        // de modo que se de ha entender que usted sabe como funciona
        try{
            Integer.parseInt(numeroComoString);
            return true;
        }catch (NumberFormatException exception) {
            return false;
        }
    }
}
