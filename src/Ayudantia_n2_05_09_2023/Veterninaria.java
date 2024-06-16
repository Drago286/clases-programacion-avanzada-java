package Ayudantia_n2_05_09_2023;

import Ayudantia_n2_05_09_2023.Solucion.Duenio;
import Ayudantia_n2_05_09_2023.Solucion.Mascota;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Veterninaria {
    private String nombre;
    private String direccion;
    private Ayudantia_n2_05_09_2023.Solucion.Mascota[] listaMascotas;
    private int cantidadMaxMascotas;
    private int cantidadActual;

    public Veterninaria(String nombre, String direccion, int cantidadMaxMascotas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadMaxMascotas = cantidadMaxMascotas;
        this.cantidadActual = 0;
        this.listaMascotas = new Ayudantia_n2_05_09_2023.Solucion.Mascota[this.cantidadMaxMascotas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        direccion = direccion;
    }

    public Ayudantia_n2_05_09_2023.Solucion.Mascota[] getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(Ayudantia_n2_05_09_2023.Solucion.Mascota[] listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public int getCantidadMaxMascotas() {
        return cantidadMaxMascotas;
    }

    public void setCantidadMaxMascotas(int cantidadMaxMascotas) {
        this.cantidadMaxMascotas = cantidadMaxMascotas;
    }

    public void atenderMascota(){
        String nombreMascota = "";
        String especieMascota = "";
        int edadMascota = 0;
        String nombreDuenio = "";
        int edadDuenio = 0;

        StdOut.println("¿Nombre del duenio de la mascota?");
        nombreDuenio = StdIn.readString();
        StdOut.println("¿Edad del duenio de la mascota?");
        edadDuenio = StdIn.readInt();

        Ayudantia_n2_05_09_2023.Solucion.Duenio nuevoDuenio = new Duenio(nombreDuenio,edadDuenio);

        StdOut.println("¿Nombre de la mascota?");
        nombreMascota = StdIn.readString();
        StdOut.println("¿Especie?");
        especieMascota = StdIn.readString();
        StdOut.println("¿Edad de la mascota?");
        edadMascota = StdIn.readInt();

        Ayudantia_n2_05_09_2023.Solucion.Mascota nuevaMascota = new Mascota(nombreMascota,especieMascota,edadMascota,nuevoDuenio);

        listaMascotas[cantidadActual] = nuevaMascota;
        this.cantidadActual++;

    }
    public void listarMascotas(){
        if (cantidadActual >0) {
            StdOut.println("----Lista de mascotas ingresadas----");
            for (int i = 0; i < cantidadMaxMascotas; i++) {
                if (listaMascotas[i] != null) {
                    StdOut.println("->Nombre Mascota: " + listaMascotas[i].getNombre());
                    StdOut.println("->Especie Mascota: " + listaMascotas[i].getEspecie());
                    StdOut.println("->Edad Mascota: " + listaMascotas[i].getEdad());
                    if (listaMascotas[i].isAlta()) {
                        StdOut.println("Mascota dada de alta!");
                    } else {
                        StdOut.println("Mascota no dada de alta!");
                    }
                }
            }
        }
        else {
            StdOut.println("No hay mascotas ingresadas.");
        }
    }
    public void darAlta() {
        if (cantidadActual > 0) {

            StdOut.println("Ingrese el nombre de la mascota:");
            String nombreMascota = StdIn.readString();

            int buscar = 0;
            for (int i = 0; i < cantidadMaxMascotas; i++) {
                if (listaMascotas[i] != null){
                    if (listaMascotas[i].getNombre().equals(nombreMascota)){
                        if (!listaMascotas[i].isAlta()) {
                            listaMascotas[i].setAlta(true);
                            StdOut.println("Mascota dada de alta!");
                        }
                        buscar++;

                    }
                }

            }
            if (buscar == 0) {
                StdOut.println("Mascota no enontrada!");
            }
        }else {
            StdOut.println("No hay mascotas ingresadas.");
        }

    }

    public void generarInforme() {
        if (cantidadActual > 0) {
            StdOut.println("----Hay " + cantidadActual + " mascota(s) registrada(s) en el sistema----");
            int cantAlta = 0;
            int cantNoAlta = 0;

            for (int i = 0; i < cantidadMaxMascotas; i++) {
                if (listaMascotas[i] != null) {
                    if (listaMascotas[i].isAlta()) {
                        cantAlta++;
                    } else {
                        cantNoAlta++;
                    }
                }
            }

            StdOut.println(cantAlta + " mascotas fueron dadas de alta durante el dia de hoy.");
            StdOut.println(cantNoAlta + " mascotas no han sido dadas de alta.");
            StdOut.println("----Listado de mascota(s) antendida(s) el dia de hoy----");
            for (int i = 0; i < cantidadMaxMascotas; i++) {
                if (listaMascotas[i] != null) {
                   StdOut.println("Nombre: "+listaMascotas[i].getNombre());
                    StdOut.println("Especie: "+listaMascotas[i].getEspecie());
                   StdOut.println("Edad: "+listaMascotas[i].getEdad());
                   StdOut.println("Dueño: "+listaMascotas[i].getDuenio().getNombre() +", "+listaMascotas[i].getDuenio().getEdad()+" años" );
                    StdOut.println("~~~~~~~~~~~~~~~~~~~~~");

                }
            }
        } else {
            StdOut.println("No se atendieron mascotas el dia de hoy :c");
        }
    }
}
