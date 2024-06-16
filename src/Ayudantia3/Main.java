package Ayudantia3;

import Ayudantia3.Objetos.Casa;
import Ayudantia3.Objetos.CompaniaSeguridad;
import Ayudantia3.Objetos.Condominio;
import Ayudantia3.Objetos.Huesped;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Main {
    public static void main(String[] args) {

        CompaniaSeguridad companiaSeguridad = new CompaniaSeguridad(2000,"Angamos 0610",30);

        boolean menu =  true;

        while (menu){
            StdOut.println("Seleccione una opcion: \n1)Ingresar nuevo condominio:");
            int opcion = StdIn.readInt();

            switch (opcion){
                case 1:
                    IngresarCondominio(companiaSeguridad);
                    break;
                case 2:
                    AdministrarCondominio(companiaSeguridad);
                    break;
            }
        }

    }
    public static void IngresarCondominio(CompaniaSeguridad companiaSeguridad){
        StdOut.println("Indique la direccion del condominio:");
        String direccion = StdIn.readString();

        StdOut.println("Indique la cantidad de casas:");
        int casas = StdIn.readInt();

        Condominio nuevoCondominio = new Condominio(direccion,casas);
        companiaSeguridad.getListaCondominio().insertarCondominio(nuevoCondominio);

    }
    public static void AdministrarCondominio(CompaniaSeguridad companiaSeguridad){
        StdOut.println("Indique el nombre del condominio");
        String condominioBuscado = StdIn.readString();

        int posicionCondominio = companiaSeguridad.getListaCondominio().buscarCondominio(condominioBuscado);

        if (posicionCondominio != -1){
            StdOut.println("indique numero de casa:");
            int numeroCasa = StdIn.readInt();
            StdOut.println("indique numero de huespedes:");
            int huespedes = StdIn.readInt();

            Casa nuevaCasas = new Casa(numeroCasa, huespedes );


            for (int i = 0; i < companiaSeguridad.getListaCondominio().getListaCondominio()[posicionCondominio].getListaCasa().getCantidadMax(); i++) {
                StdOut.println("Ingrese el nombre del huesped "+(i+1));
                String nombre = StdIn.readString();

                StdOut.println("Ingrese la edad del huesped "+(i+1));
                int edad = StdIn.readInt();

                Huesped nuevoHuesped = new Huesped(nombre,edad);


            }
        }
    }
}
