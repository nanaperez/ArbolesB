/**
 * Created with IntelliJ IDEA.
 * User: alejandraperez
 * Date: 6/11/13
 * Time: 09:59 AM
 * To change this template use File | Settings | File Templates.
 */

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelArbolesB extends JPanel {

        private JLabel LblOrden;
        protected static JLabel LblOrden2;
        protected static JTextField TxtOrden;

        private JLabel IngresoNumeros;
        protected static JTextField TxtNumeros;


        public PanelArbolesB() {

            LblOrden = new JLabel("Orden Arbol: ");
            LblOrden2 = new JLabel("0");
            setTxtOrden(new JTextField(15));

            IngresoNumeros = new JLabel("Ingrese Numeros: ");
            setTxtNumeros(new JTextField("0"));


            TitledBorder border = BorderFactory.createTitledBorder("Datos del Arbol ");
            this.setBorder(border);
            setLayout(new BorderLayout());

            JPanel p0 = new JPanel();
            p0.setLayout(new GridLayout(4,1));

            JPanel p1 = new JPanel();
            p1.setLayout(new FlowLayout(FlowLayout.LEFT,1, 1));
            p1.add(LblOrden);
            p1.add(LblOrden2);

            JPanel p2 = new JPanel();
            p2.setLayout(new FlowLayout(FlowLayout.LEFT,1, 1));
            p2.add(getIngresoNumeros());
            p2.add(getLblOrden());

 /*           JPanel p3 = new JPanel();
            p3.setLayout(new FlowLayout(FlowLayout.CENTER,1, 1));
            p3.add(getLblHorEnt());
            p3.add(lblSepEnt);
            p3.add(getLblMinEnt());*/

            p0.add(p1);
            p0.add(p2);

            add(p0, BorderLayout.CENTER);
        }

        public JTextField getLblOrden() {
            return TxtOrden;
        }

        public void setTxtOrden(JTextField txtOrden) {
            TxtOrden = txtOrden;
        }

        public JTextField getIngresoNumeros() {
            return TxtNumeros;
        }

        public void setTxtNumeros(JTextField txtNumeros) {
            TxtNumeros = txtNumeros;
        }
}
