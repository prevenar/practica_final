package modelo;

import modelo.Perro;
import modelo.Gato;

/**
 * Clase principal para probar los animales.
 */
public class App {
    public static void main(String[] args) {
        Perro perro = new Perro("Toby");
        Gato gato = new Gato("Misu");

        System.out.println(perro.getNombre() + " dice: " + perro.sonido());
        System.out.println(gato.getNombre() + " dice: " + gato.sonido());
    }
}
