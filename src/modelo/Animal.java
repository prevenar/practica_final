package modelo;

/**
 * Clase base para representar un animal.
 * @author TuNombre
 * @version 1.0
 */
public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String sonido() {
        return "???";
    }

    @Override
    public String toString() {
        return "Animal: " + nombre;
    }
}
