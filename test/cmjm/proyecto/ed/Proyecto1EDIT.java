package cmjm.proyecto.ed;

import static org.junit.Assert.assertEquals;
import java.util.NoSuchElementException;
import org.junit.Test;

public class Proyecto1EDIT {

    @Test
    public void testMediaNotasParciales() {
        // Test caso 1
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 6.5;
        double media = 7.0;

        try {
            media = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
            assertEquals(7.75, media, 0.01);
        } catch (NoSuchElementException e) {
            System.out.println("Error: Entrada no válida.");
        }

        // Test caso 2
        nota1 = 5.0;
        nota2 = 6.0;
        nota3 = 5.5;
        media = 0.0;

        try {
            media = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
            assertEquals(5.75, media, 0.01);
        } catch (NoSuchElementException e) {
            System.out.println("Error: Entrada no válida.");
        }

        // Test caso 3
        nota1 = 10.0;
        nota2 = 9.0;
        nota3 = 8.0;
        media = 0.0;

        try {
            media = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
            assertEquals(9.0, media, 0.01);
        } catch (NoSuchElementException e) {
            System.out.println("Error: Entrada no válida.");
        }
    }
}