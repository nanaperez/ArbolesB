/**
 * Created with IntelliJ IDEA.
 * User: alejandraperez
 * Date: 6/11/13
 * Time: 09:46 AM
 * To change this template use File | Settings | File Templates.
 */

import javax.swing.*;
import java.awt.*;

public class InterfazArbolesB extends JFrame {

    private PanelOrden panelOrden;
    private PanelNumeros panelNumeros;
    private PanelArbolCreado panelArbolCreado;

    public InterfazArbolesB() {

        this.setTitle("ArbolesB");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setVisible(true);
        this.toFront();
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        panelOrden = new PanelOrden();
        //this.add(panelOrden, BorderLayout.NORTH);

        panelNumeros = new PanelNumeros();
        //this.add(panelNumeros, BorderLayout.WEST);

        panelArbolCreado = new PanelArbolCreado();
        //this.add(panelArbolCreado, BorderLayout.CENTER);
    }

    public static void main(String  [] misArgumentos) {

        InterfazArbolesB interfazArbolesB = new InterfazArbolesB();
        interfazArbolesB.setVisible(true);
    }
}
