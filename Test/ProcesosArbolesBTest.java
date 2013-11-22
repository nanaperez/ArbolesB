/**
 * Created with IntelliJ IDEA.
 * User: jessecogollo
 * Date: 5/11/13
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProcesosArbolesBTest {

    //ProcesosArbolesB ParbB = new ProcesosArbolesB();
     /*
    @Before
    public void setUp() throws Exception {
        //ParbB.ordenarbol = 2;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Raiz: " + ParbB.Raiz);
        System.out.println("Hoja Izquierda: " + ParbB.HojasIzq);
        System.out.println("Hoja Derecha: " + ParbB.HojasDer);
        System.out.println("Temporal: " + ParbB.Temp);
        System.out.println("Cantidad nodos: " + ParbB.contadornodos);

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

    @Test
    public void testInsertarSeisEnArbolOrdenDosDesordenInsertarArbolIzquierdo() throws Exception {
        System.out.println("testInsertarSeisEnArbolOrdenDosDesordenInsertarArbolIzquierdo");
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        ParbB.Insertar(21);
        ParbB.Insertar(15);
        ParbB.Insertar(45);
        ParbB.Insertar(22);
        assertEquals(24,ParbB.Raiz.get(0));
        assertEquals(15,ParbB.HojasIzq.get(0));
        assertEquals(21,ParbB.HojasIzq.get(1));
        assertEquals(22,ParbB.HojasIzq.get(2));
        assertEquals(45,ParbB.HojasDer.get(0));
        assertEquals(60,ParbB.HojasDer.get(1));
    }

    @Test
     public void testInsertarSieteEnArbolOrdenDosDesordenInsertarArbolIzquierdo() throws Exception {
        System.out.println("testInsertarSieteEnArbolOrdenDosDesordenInsertarArbolIzquierdo");
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        ParbB.Insertar(21);
        ParbB.Insertar(15);
        ParbB.Insertar(45);
        ParbB.Insertar(22);
        ParbB.Insertar(17);
        assertEquals(24,ParbB.Raiz.get(0));
        assertEquals(15,ParbB.HojasIzq.get(0));
        assertEquals(17,ParbB.HojasIzq.get(1));
        assertEquals(21,ParbB.HojasIzq.get(2));
        assertEquals(22,ParbB.HojasIzq.get(3));
        assertEquals(45,ParbB.HojasDer.get(0));
        assertEquals(60,ParbB.HojasDer.get(1));
    }

    @Test
    public void testInsertarSeisEnArbolOrdenDosDesordenInsertarArbolDerecho() throws Exception {
        System.out.println("testInsertarSeisEnArbolOrdenDosDesordenInsertarArbolDerecho");
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        ParbB.Insertar(21);
        ParbB.Insertar(15);
        ParbB.Insertar(45);
        ParbB.Insertar(61);
        assertEquals(24,ParbB.Raiz.get(0));
        assertEquals(15,ParbB.HojasIzq.get(0));
        assertEquals(21,ParbB.HojasIzq.get(1));
        assertEquals(45,ParbB.HojasDer.get(0));
        assertEquals(60,ParbB.HojasDer.get(1));
        assertEquals(61,ParbB.HojasDer.get(2));
    }

    @Test
    public void testInsertarOchoEnArbolOrdenDosDesordenInsertarArbolDerechoIzquierdo() throws Exception {
        System.out.println("testInsertarSieteEnArbolOrdenDosDesordenInsertarArbolDerecho");
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        ParbB.Insertar(21);
        ParbB.Insertar(15);
        ParbB.Insertar(45);
        ParbB.Insertar(22);
        ParbB.Insertar(61);
        ParbB.Insertar(30);
        ParbB.Insertar(23);
        assertEquals(24,ParbB.Raiz.get(0));
        assertEquals(15,ParbB.HojasIzq.get(0));
        assertEquals(21,ParbB.HojasIzq.get(1));
        assertEquals(22,ParbB.HojasIzq.get(2));
        assertEquals(23,ParbB.HojasIzq.get(3));
        assertEquals(30,ParbB.HojasDer.get(0));
        assertEquals(45,ParbB.HojasDer.get(1));
        assertEquals(60,ParbB.HojasDer.get(2));
        assertEquals(61,ParbB.HojasDer.get(3));
    }

    @Test
    public void testInsertarOchoEnArbolOrdenDosOrdenAscendenteInsertarArbolDerechoIzquierdo() throws Exception {
        System.out.println("testInsertarOchoEnArbolOrdenDosOrdenAscendenteInsertarArbolDerechoIzquierdo");
        ParbB.Insertar(1);
        ParbB.Insertar(2);
        ParbB.Insertar(3);
        ParbB.Insertar(4);
        ParbB.Insertar(5);
        ParbB.Insertar(6);
        ParbB.Insertar(7);
        ParbB.Insertar(8);
        ParbB.Insertar(9);
        assertEquals(3,ParbB.Raiz.get(0));
        assertEquals(6,ParbB.Raiz.get(1));
        assertEquals(1,ParbB.HojasIzq.get(0));
        assertEquals(2,ParbB.HojasIzq.get(1));
        //assertEquals(22,ParbB.HojasIzq.get(2));
        //assertEquals(23,ParbB.HojasIzq.get(3));
        assertEquals(4,ParbB.HojasDer.get(0));
        assertEquals(5,ParbB.HojasDer.get(1));
        //assertEquals(60,ParbB.HojasDer.get(2));
        //assertEquals(61,ParbB.HojasDer.get(3));
    }
    */
}



