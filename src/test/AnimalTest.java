package test;

import modelo.Perro;
import modelo.Gato;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

	private void assertEquals(String string, String sonido) {
		// TODO Auto-generated method stub
		
	}
}

