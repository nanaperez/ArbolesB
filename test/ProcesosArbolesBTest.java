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

    //@Before
    //public void setUp() throws Exception {
        //System.out.println("inicio las pruebas");
    //}

    //@After
    //public void tearDown() throws Exception {
        //int tamArb = ParbB.ArbolB.size();
        //System.out.println(tamArb);
        //System.out.println(ParbB.ArbolB);
    //}

    @Test
    public void insertarTest(){
        //ProcesosArbolesB ParbB = new ProcesosArbolesB();
        boolean Ins = ParbB.Insertar(0, "test1");
        assertTrue(Ins);
    }

}
