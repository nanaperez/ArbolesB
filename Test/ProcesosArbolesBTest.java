import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
        System.out.println();
    }

    @Test
     public void testInsertarUnoEnArbolOrdenDos() throws Exception {
        boolean Ins = ParbB.Insertar(0, 15);
        assertTrue(Ins);
    }

    @Test
    public void testInsertarDosEnArbolOrdenDos() throws Exception {
        boolean Ins = ParbB.Insertar(0, 15);
        boolean Ins2 = ParbB.Insertar(1, 21);
        assertTrue(Ins2);
    }

    @Test
     public void testInsertarTresEnArbolOrdenDos() throws Exception {
        boolean Ins = ParbB.Insertar(0, 15);
        boolean Ins2 = ParbB.Insertar(1, 21);
        boolean Ins3 = ParbB.Insertar(2, 45);
        assertTrue(Ins3);
    }

    @Test
    public void testInsertarCuatroEnArbolOrdenDos() throws Exception {
        boolean Ins = ParbB.Insertar(0, 15);
        boolean Ins2 = ParbB.Insertar(1, 21);
        boolean Ins3 = ParbB.Insertar(2, 45);
        boolean Ins4 = ParbB.Insertar(3, 60);
        assertTrue(Ins4);
    }

    @Test
    public void testInsertarCincoEnArbolOrdenDos() throws Exception {
        boolean Ins = ParbB.Insertar(0, 15);
        boolean Ins2 = ParbB.Insertar(1, 21);
        boolean Ins3 = ParbB.Insertar(2, 45);
        boolean Ins4 = ParbB.Insertar(3, 60);
        boolean Ins5 = ParbB.Insertar(4, 24);
        assertTrue(Ins5);
    }

    @Test
    public void testInsertarSubdividiendoArbol() throws Exception {
        boolean Ins = ParbB.Insertar(0, 15);
        boolean Ins2 = ParbB.Insertar(1, 21);
        boolean Ins3 = ParbB.Insertar(2, 24);
        boolean Ins4 = ParbB.Insertar(3, 45);
        boolean Ins5 = ParbB.Insertar(4, 60);
        assertTrue(Ins5);
    }

}



