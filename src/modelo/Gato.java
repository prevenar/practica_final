package modelo;

/**
 * Representa un gato, subclase de Animal.
 */
public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String sonido() {
        return "Miau";
    }
}
