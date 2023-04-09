/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cmjm.proyecto.ed;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

/**
 *
 * @author desst
 */
/**
 * Clase que contiene tests unitarios para la clase ProyectoED que implementa 
 métodos relacionados con cálculos de notas parciales.
 */
public class ProyectoEDIT {
    
    static Scanner sc = new Scanner(System.in);
    
    public ProyectoEDIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test de la función mediaNotasParciales, de la clase ProyectoED.
     
     * 
     * Se prueba la función para el caso en el que todas las notas son 5.
     * 
     * @see ProyectoEDmediaNotasParciales()
     */
    
     
    
    
     /**
     * Test de la función mediaNotasParcialesMaximas, de la clase ProyectoED.
     * 
     * Se prueba la función para el caso en el que todas las notas son 10.
     * 
     * @see ProyectoED#mediaNotasParciales(double, double, double) 
     */
    @Test
    public void testMediaNotasParcialesMaximas() {
        System.out.println("La media de la Notas Parciales con valor 10");
        double nota1 = 10;
        double nota2 = 10;
        double nota3 = 10;
        double expResult = 10.0;
        double result = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       }
    /**
     * Test de la función mediaNotasParcialesMinimas, de la clase ProyectoED.
     * 
     * Se prueba la función para el caso en el que todas las notas son 0.
     * 
     * @see ProyectoED#mediaNotasParciales(double, double, double)
     */
    @Test
    public void testMediaNotasParcialesMinimas() {
        System.out.println("La media de la Notas Parciales con valor 0");
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double expResult = 0.0;
        double result = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       }
/**
 * Test de la función mediaNotasParcialesMinimasMedias, de la clase ProyectoED.
 * 
 * Se prueba la función para el caso en el que la nota 3 es 5 y las notas 1 y 2 son 0.
 * 
 * @see ProyectoED#mediaNotasParciales()
 */
    @Test
    public void testMediaNotasParcialesMinimasMedias() {
        System.out.println("La media de la Notas Parciales con valor 5 en la nota3");
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 5.0;
        double expResult = 2.5;
        double result = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       }
/**
 * Test de la función mediaNotasParcialesMaximasMedias, de la clase ProyectoED.
 * 
 * Se prueba la función para el caso en el que la nota 1 y la nota 2 son 10 y la nota 3 es 5.
 * 
 * @see ProyectoEDmediaNotasParciales
 */
    @Test
    public void testMediaNotasParcialesMaximasMedias() {
        System.out.println("La media de la Notas Parciales con valor 10 en las dos primeras notas");
        double nota1 = 10.0;
        double nota2 = 10.0;
        double nota3 = 5.0;
        double expResult = 10.0;
        double result = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       }
/**
 * Test de la función mediaNotasParcialesMaximasBajo, de la clase ProyectoED.
 * 
 * Se prueba la función para el caso en el que la media de la Notas Parciales con valor 9.99
 * 
 * @see ProyectoEDMediaNotasParcialesMaximasBajo
 */
    @Test
    public void testMediaNotasParcialesLimiteMaximo() {
        System.out.println("testMediaNotasParcialesLimiteMaximo");
        double nota1 = 10.01;
        double nota2 = 5;
        double nota3 = 7;
        double expResult = -1;
        double result = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       }
/**
 * Test de la función mediaNotasParcialesMinimoAlto, de la clase ProyectoED.
 * 
 * Se prueba la función para el caso en el que La media de la Notas Parciales con valor 0.0199
 * 
 * @see ProyectoEDMediaNotasParcialesMinimoAlto
 */
    @Test
    public void testMediaNotasParcialesLimiteMinimo() {
        System.out.println("La media de la Notas Parciales con valor 0.01");
        double nota1 = -0.01;
        double nota2 = 5;
        double nota3 = 8;
        double expResult = -1;
        double result = ProyectoED.mediaNotasParciales(nota1, nota2, nota3);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       }    
}
