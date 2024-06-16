package Ayudantia_n3_26_09_2023;
import Ayudantia_n3_26_09_2023.Objetos.Casa;
import Ayudantia_n3_26_09_2023.Objetos.Condominio;
import Ayudantia_n3_26_09_2023.Objetos.CompaniaSeguridad;
import Ayudantia_n3_26_09_2023.Objetos.Huesped;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Main {
    public static void main(String[] args) {

        boolean menu = true;
        CompaniaSeguridad companiaSeguridad = new CompaniaSeguridad(90000,"Angamos 0610",30);

        while(menu){
            StdOut.println("Ingrese una opcion: \n1)Registrar un condominio \n2)Administar condominio \n3)Estadisiticas");
            int opcion = StdIn.readInt();

            switch (opcion){
                case 1:
                    registrarCondominio(companiaSeguridad);
                    break;
                case 2:
                    administrarCondominio(companiaSeguridad);
                    break;
                case 3:
                    estadisticas(companiaSeguridad);
            }
        }

    }

    public static void registrarCondominio(CompaniaSeguridad companiaSeguridad){
        StdOut.println("Ingrese el nombre del condominio:");
        String nombre = StdIn.readString();
        StdOut.println("Ingrese la direccion del condominio:");
        String direccion = StdIn.readString();
        StdOut.println("Ingrese la cantidad de casas que posee el condominio:");
        int cantidadCasas = StdIn.readInt();

        Condominio nuevoCondominio = new Condominio(direccion,nombre,cantidadCasas);
        companiaSeguridad.getListaCondominio().ingresarCondominio(nuevoCondominio);

    }
    public static void administrarCondominio(CompaniaSeguridad companiaSeguridad) {
        StdOut.println("Ingrese el nombre del condominio:");
        String condominioBuscado = StdIn.readString();

        int encontrado = companiaSeguridad.getListaCondominio().buscarCondominio(condominioBuscado);
        if (encontrado != -1){
            StdOut.println("Indique una opcion:\n1)Registar casa \n2)Administar casa \n3)Eliminar casa");
            int opcion = StdIn.readInt();
            switch (opcion){
                case 1:
                    StdOut.println("Indique el numero de la casa:");
                    int numeroCasa = StdIn.readInt();
                    StdOut.println("Indique el numero de huespedes:");
                    int numeroHuespedes = StdIn.readInt();

                    Casa nuevaCasa = new Casa(numeroCasa,numeroHuespedes);
                    companiaSeguridad.getListaCondominio().getListaCondominio()[encontrado].getListaCasas().ingresarCasa(nuevaCasa);
                    break;
                case 2:
                    StdOut.println("Indique el numero de la casa:");
                    int numeroCasaAdministrar = StdIn.readInt();
                    if (companiaSeguridad.getListaCondominio().getListaCondominio()[encontrado].getListaCasas().buscarCasa(numeroCasaAdministrar)!=-1){
                        int numeroHuespedesAdministrar = companiaSeguridad.getListaCondominio().getListaCondominio()[encontrado].getListaCasas().getListaCasas()[companiaSeguridad.getListaCondominio().getListaCondominio()[encontrado].getListaCasas().buscarCasa(numeroCasaAdministrar)].getListaHuespedes().getCantidadMax();
                        StdOut.println("El numero de huespedes de la casa es de: " + numeroHuespedesAdministrar);
                        for (int i = 0; i < numeroHuespedesAdministrar; i++) {
                            StdOut.println("Indique el nombre del huesped " + (i+1));
                            String nombreHuesped = StdIn.readString();
                            StdOut.println("Indique la edad del huesped " + (i+1));
                            int edad = StdIn.readInt();

                            Huesped nuevoHuesped = new Huesped(nombreHuesped,edad);
                            companiaSeguridad.getListaCondominio().getListaCondominio()[encontrado].getListaCasas().getListaCasas()[companiaSeguridad.getListaCondominio().getListaCondominio()[encontrado].getListaCasas().buscarCasa(numeroCasaAdministrar)].getListaHuespedes().ingresarHuesped(nuevoHuesped);

                        }
                    }

                    break;

                case 3:
                    StdOut.println("Indique el numero de la casa:");
                     int numeroCasaEliminar = StdIn.readInt();
                     companiaSeguridad.getListaCondominio().getListaCondominio()[encontrado].getListaCasas().eliminarCasa(numeroCasaEliminar);
                    break;
            }
        }
    }

    public static void estadisticas(CompaniaSeguridad companiaSeguridad){
        if (companiaSeguridad.getListaCondominio().getCantidadActual() > 0 ) {
            for (int i = 0; i < companiaSeguridad.getListaCondominio().getCantidadMax(); i++) {
                if (companiaSeguridad.getListaCondominio().getListaCondominio()[i] != null) {
                    StdOut.println("----Condominio: " + companiaSeguridad.getListaCondominio().getListaCondominio()[i].getNombre() + "----");
                    StdOut.println("----Direccion: " + companiaSeguridad.getListaCondominio().getListaCondominio()[i].getDireccion() + "----");
                    StdOut.println("----Numero de casas: " + companiaSeguridad.getListaCondominio().getListaCondominio()[i].getListaCasas().getCantidadActual() + "----");
                    StdOut.println("||Casas registradas||");
                    for (int j = 0; j < companiaSeguridad.getListaCondominio().getListaCondominio()[i].getListaCasas().getCantidadMax(); j++) {
                        if (companiaSeguridad.getListaCondominio().getListaCondominio()[i].getListaCasas().getListaCasas()[j] != null) {
                            StdOut.println("~~Casa numero: " + companiaSeguridad.getListaCondominio().getListaCondominio()[i].getListaCasas().getListaCasas()[j].getNumero() + "~~");
                            StdOut.println("Listado de huesped: ");
                            for (int k = 0; k < companiaSeguridad.getListaCondominio().getListaCondominio()[i].getListaCasas().getListaCasas()[j].getListaHuespedes().getCantidadMax(); k++) {
                                if (companiaSeguridad.getListaCondominio().getListaCondominio()[i].getListaCasas().getListaCasas()[j].getListaHuespedes().getListaHuespedes()[k] != null) {
                                    StdOut.println("->Nombre: " + companiaSeguridad.getListaCondominio().getListaCondominio()[i].getListaCasas().getListaCasas()[j].getListaHuespedes().getListaHuespedes()[k].getNombre());
                                    StdOut.println("->Edad: " + companiaSeguridad.getListaCondominio().getListaCondominio()[i].getListaCasas().getListaCasas()[j].getListaHuespedes().getListaHuespedes()[k].getEdad());
                                }
                            }
                        }
                    }

                }
            }
        }else {
            StdOut.println("No hay condominios registrados!");
        }
    }
}
