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
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.util.ArrayList;

public class ArbolesB extends JFrame {

    public ArbolesB() throws BadLocationException {

        String orden = JOptionPane.showInputDialog("Definir Orden: ").trim();
        ProcesosArbolesB ParbB = new ProcesosArbolesB(Integer.parseInt(orden));
        insertar(ParbB);

        JPanel pt = new JPanel();
        lblTituloArbol = new JLabel("Arbol");
        pt.add(lblTituloArbol);

        this.setTitle("ArbolB - Estructra de datos y algoritmos 1");
        Dimension Dm = new Dimension(800,600);
        this.setSize(Dm);
        this.setVisible(true);
        this.toFront();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        this.add(pt,BorderLayout.NORTH);
        this.add(ContenidoArbol(ParbB),BorderLayout.CENTER);
        this.add(FormularioArbol(),BorderLayout.SOUTH);

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

    public JPanel ContenidoArbol(ProcesosArbolesB PB) throws BadLocationException {
        String arB = PB.imprimirarbol(PB);

        JTextPane editor = new JTextPane();
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        int centrar = StyleConstants.ALIGN_CENTER;
        editor.getStyledDocument().insertString(editor.getStyledDocument().getLength(), arB, attrs);

        StyledDocument st=editor.getStyledDocument();
        SimpleAttributeSet bSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(bSet, centrar);
        st.setParagraphAttributes(0,editor.getText().length(), bSet, false);
        editor.updateUI();

        JPanel Ca = new JPanel();
        Ca.add(editor);
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

    public static void main(String  [] misArgumentos) throws BadLocationException {
        ArbolesB AB = new ArbolesB();
    }


}
