import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: jessecogollo
 * Date: 5/11/13
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProcesosArbolesBTest {

    ProcesosArbolesB ParbB = new ProcesosArbolesB();

    @Before
    public void setUp() throws Exception {
        ParbB.ordenarbol = 2;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Raiz: " + ParbB.Raiz);
        System.out.println("Hoja Izquierda: " + ParbB.HojasIzq);
        System.out.println("Hoja Derecha: " + ParbB.HojasDer);
        System.out.println("Temporal: " + ParbB.Temp);

        ParbB.Raiz.clear();
        ParbB.HojasIzq.clear();
        ParbB.HojasDer.clear();
        ParbB.Temp.clear();
        System.out.println();
    }

    @Test
     public void testInsertarUnoEnArbolOrdenDos() throws Exception {
        System.out.println("testInsertarUnoEnArbolOrdenDos");
        ParbB.Insertar(15);
        assertEquals(15,ParbB.Temp.get(0));

    }

    @Test
    public void testInsertarDosEnArbolOrdenDos() throws Exception {
        System.out.println("testInsertarDosEnArbolOrdenDos");
        ParbB.Insertar(15);
        ParbB.Insertar(21);
        assertEquals(21,ParbB.Temp.get(1));
    }

    @Test
     public void testInsertarTresEnArbolOrdenDos() throws Exception {
        System.out.println("testInsertarTresEnArbolOrdenDos");
        ParbB.Insertar(15);
        ParbB.Insertar(21);
        ParbB.Insertar(45);
        assertEquals(45,ParbB.Temp.get(2));
    }

    @Test
    public void testInsertarCuatroEnArbolOrdenDos() throws Exception {
        System.out.println("testInsertarCuatroEnArbolOrdenDos");
        ParbB.Insertar(15);
        ParbB.Insertar(21);
        ParbB.Insertar(45);
        ParbB.Insertar(60);
        assertEquals(60,ParbB.Temp.get(3));
    }

    @Test
    public void testInsertarCincoEnArbolOrdenDos() throws Exception {
        System.out.println("testInsertarCincoEnArbolOrdenDos");
        ParbB.Insertar(15);
        ParbB.Insertar(21);
        ParbB.Insertar(24);
        ParbB.Insertar(45);
        ParbB.Insertar(60);
        assertEquals(24,ParbB.Raiz.get(0));
        assertEquals(15,ParbB.HojasIzq.get(0));
        assertEquals(21,ParbB.HojasIzq.get(1));
        assertEquals(45,ParbB.HojasDer.get(0));
        assertEquals(60,ParbB.HojasDer.get(1));
    }

    @Test
     public void testInsertarUnoEnArbolOrdenDosDesorden() throws Exception {
        System.out.println("testInsertarUnoEnArbolOrdenDosDesorden");
        ParbB.Insertar(24);
        assertEquals(24,ParbB.Temp.get(0));
    }

    @Test
    public void testInsertarDosEnArbolOrdenDosDesorden() throws Exception {
        System.out.println("testInsertarDosEnArbolOrdenDosDesorden");
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        assertEquals(60,ParbB.Temp.get(1));
    }

    @Test
    public void testInsertarTresEnArbolOrdenDosDesorden() throws Exception {
        System.out.println("testInsertarTresEnArbolOrdenDosDesorden");
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        ParbB.Insertar(21);
        assertEquals(60,ParbB.Temp.get(2));
    }

    @Test
    public void testInsertarCuatroEnArbolOrdenDosDesorden() throws Exception {
        System.out.println("testInsertarCuatroEnArbolOrdenDosDesorden");
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        ParbB.Insertar(21);
        ParbB.Insertar(15);
        assertEquals(60,ParbB.Temp.get(3));
    }

    @Test
    public void testInsertarCincoEnArbolOrdenDosDesorden() throws Exception {
        System.out.println("testInsertarCincoEnArbolOrdenDosDesorden");
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        ParbB.Insertar(21);
        ParbB.Insertar(15);
        ParbB.Insertar(45);
        assertEquals(24,ParbB.Raiz.get(0));
        assertEquals(15,ParbB.HojasIzq.get(0));
        assertEquals(21,ParbB.HojasIzq.get(1));
        assertEquals(45,ParbB.HojasDer.get(0));
        assertEquals(60,ParbB.HojasDer.get(1));
    }

}



