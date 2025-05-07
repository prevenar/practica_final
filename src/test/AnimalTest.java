package test;

import modelo.Perro;
import modelo.Gato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void testSonidoPerro() {
        Perro perro = new Perro("Toby");
        assertEquals("Guau", perro.sonido());
    }

    @Test
    public void testSonidoGato() {
        Gato gato = new Gato("Misu");
        assertEquals("Miau", gato.sonido());
    }
}
