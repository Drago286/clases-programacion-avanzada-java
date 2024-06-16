public class Cancion {
    private String nombre;
    private String artista;
    private String durancion;

    public Cancion(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDurancion() {
        return durancion;
    }

    public void setDurancion(String durancion) {
        this.durancion = durancion;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
