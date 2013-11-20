/**
 * Created with IntelliJ IDEA.
 * User: jessecogollo
 * Date: 2/11/13
 * Time: 10:29 AM
 * To change this template use File | Settings | File Templates.
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList;

public class ArbolesB extends JFrame {

    public ArbolesB(){

        String orden = JOptionPane.showInputDialog("Definir Orden: ").trim();
        ProcesosArbolesB ParbB = new ProcesosArbolesB(Integer.parseInt(orden));
        insertar(ParbB);



        this.setTitle("ArbolB - Estructra de datos y algoritmos 1");
        Dimension Dm = new Dimension(800,600);
        this.setSize(Dm);
        this.setVisible(true);
        this.toFront();
        //this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //this.add(ContenidoArbol(),BorderLayout.CENTER);
        this.add(FormularioArbol(),BorderLayout.SOUTH);
        this.add(ContenidoArbol(ParbB),BorderLayout.CENTER);
        //;

    }

    public void insertar(ProcesosArbolesB PB){

        int respuesta = JOptionPane.showConfirmDialog(null,"Desea ingresar valores?","titulo",JOptionPane.YES_NO_OPTION);
        while (respuesta == 0){//0 para si
            String valor = JOptionPane.showInputDialog("Ingrese Elemento:");
            PB.Insertar(Integer.parseInt(valor));
            respuesta = JOptionPane.showConfirmDialog(null,"Desea seguir ingresando valores?","Continuar",JOptionPane.YES_NO_OPTION);
        }
    }

    private JLabel lblTituloArbol;
    private JLabel lblArbolito;
    private JTextArea TAreaPrueba;

    public JPanel ContenidoArbol(ProcesosArbolesB PB){
        String arB = PB.imprimirarbol(PB);
        lblTituloArbol = new JLabel("Arbol: \n");
        lblArbolito = new JLabel(arB);
        TAreaPrueba = new JTextArea(arB,20,20);
        JPanel Ca = new JPanel();
        Ca.add(lblTituloArbol);
        Ca.add(lblArbolito);
        Ca.add(TAreaPrueba);
        return Ca;
    }

    private JTextField txtBuscarEliminar;
    private JButton btnBuscar;
    private JButton btnEliminar;

    public JPanel FormularioArbol(){

        btnBuscar = new JButton("Buscar");
        txtBuscarEliminar = new JTextField(15);
        btnEliminar = new JButton("Eliminar");

        JPanel Fa = new JPanel();
        Fa.add(btnBuscar);
        Fa.add(txtBuscarEliminar);
        Fa.add(btnEliminar);
        return Fa;
    }

    public static void main(String  [] misArgumentos) {
        ArbolesB AB = new ArbolesB();
    }


}
