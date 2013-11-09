/**
 * Created with IntelliJ IDEA.
 * User: jessecogollo
 * Date: 2/11/13
 * Time: 10:29 AM
 * To change this template use File | Settings | File Templates.
 */
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.ArrayList;

public class ArbolesB {

    public static void main(String  [] misArgumentos) {
        System.out.println("ArbolesB - Estructura de datos y Algoritmos I");
        ProcesosArbolesB ParbB = new ProcesosArbolesB();
        ParbB.Insertar(24);
        ParbB.Insertar(60);
        ParbB.Insertar(21);
        ParbB.Insertar(15);
        ParbB.Insertar(45);
        ParbB.Insertar(22);
        System.out.println("Raiz: " + ParbB.Raiz);
        System.out.println("Hoja Izquierda: " + ParbB.HojasIzq);
        System.out.println("Hoja Derecha: " + ParbB.HojasDer);
        System.out.println("Temporal: " + ParbB.Temp);
    }
}
