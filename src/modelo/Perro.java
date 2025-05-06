package modelo;

/**
 * Representa un perro, subclase de Animal.
 */
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String sonido() {
        return "Guau";
    }
}
