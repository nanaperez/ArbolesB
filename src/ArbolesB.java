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
        ParbB.Insertar(0,10);
        //ParbB.Insertar(5,65);
        ParbB.Insertar(1,21);
        ParbB.Insertar(2,24);
        ParbB.Insertar(3,45);
        ParbB.Insertar(4,60);
        System.out.println(ParbB.ArbolB);
    }
}
