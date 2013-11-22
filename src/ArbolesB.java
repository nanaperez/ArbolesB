
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class ArbolesB extends JFrame implements ActionListener {

    public final static String INSERTAR = "Insertar";
    public final static String BUSCAR = "Buscar";
    public final static String ELIMINAR = "Eliminar";
    ProcesosArbolesB ParbB;

    public ArbolesB() throws BadLocationException {

        String orden = JOptionPane.showInputDialog("Defina el Orden: ").trim();
        ParbB = new ProcesosArbolesB(Integer.parseInt(orden));
        //insertar(ParbB);

        JPanel pt = new JPanel();
        lblTituloArbol = new JLabel("Arbol");
        pt.add(lblTituloArbol);

        this.setTitle("ArbolB - Estructuras de datos y algoritmos I");
        Dimension Dm = new Dimension(750,600);
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

        //int respuesta = JOptionPane.showConfirmDialog(null,"Desea ingresar valores?","Ingreso de valores",JOptionPane.YES_NO_OPTION);
        //while (respuesta == 0){//0 para si
        String strValor =  txtBuscarEliminar.getText().trim();
        int valor = Integer.parseInt(strValor);
        PB.Insertar(valor);

        txtBuscarEliminar.setText("");

        //String del = ParbB.eliminar(valor);
        txtBuscarEliminar.requestFocus();

        editor.setText("");
        String arB = ParbB.imprimirarbol(ParbB);
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        int centrar = StyleConstants.ALIGN_CENTER;
        try {
            editor.getStyledDocument().insertString(editor.getStyledDocument().getLength(), arB, attrs);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        StyledDocument st=editor.getStyledDocument();
        SimpleAttributeSet bSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(bSet, centrar);
        st.setParagraphAttributes(0,editor.getText().length(), bSet, false);
        editor.repaint();
        editor.updateUI();
    }

    private JLabel lblTituloArbol;
    JTextPane editor;

    public JPanel ContenidoArbol(ProcesosArbolesB PB) throws BadLocationException {

        String arB = PB.imprimirarbol(PB);

        editor = new JTextPane();
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        int centrar = StyleConstants.ALIGN_CENTER;
        editor.getStyledDocument().insertString(editor.getStyledDocument().getLength(), arB, attrs);

        StyledDocument st = editor.getStyledDocument();
        SimpleAttributeSet bSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(bSet, centrar);
        st.setParagraphAttributes(0,editor.getText().length(), bSet, false);
        editor.updateUI();

        JPanel Ca = new JPanel();
        Ca.add(editor);
        return Ca;
    }

    private JTextField txtBuscarEliminar;
    private JButton btnInsertar;
    private JButton btnBuscar;
    private JButton btnEliminar;

    public JPanel FormularioArbol(){

        btnInsertar = new JButton("Insertar");
        btnBuscar = new JButton("Buscar");
        txtBuscarEliminar = new JTextField(15);
        btnEliminar = new JButton("Eliminar");

        btnInsertar.setActionCommand(INSERTAR);
        btnInsertar.addActionListener(this);

        btnBuscar.setActionCommand(BUSCAR);
        btnBuscar.addActionListener(this);

        btnEliminar.setActionCommand(ELIMINAR);
        btnEliminar.addActionListener(this);

        JPanel Fa = new JPanel();
        Fa.add(btnInsertar);
        Fa.add(btnBuscar);
        Fa.add(txtBuscarEliminar);
        Fa.add(btnEliminar);
        return Fa;
    }

    public static void main(String  [] misArgumentos) throws BadLocationException {
        ArbolesB AB = new ArbolesB();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String comando = actionEvent.getActionCommand();
        if(comando.equals(BUSCAR)) {
            buscar();
        }
        else if (comando.equals(ELIMINAR)) {
            eliminar();
        }
        else {
            insertar(ParbB);
        }
    }

    public void eliminar() {
        String strValor = txtBuscarEliminar.getText().trim();
        txtBuscarEliminar.setText("");
        int valor = Integer.parseInt(strValor);
        String del = ParbB.eliminar(valor);
        txtBuscarEliminar.requestFocus();

        editor.setText("");
        String arB = ParbB.imprimirarbol(ParbB);
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        int centrar = StyleConstants.ALIGN_CENTER;
        try {
            editor.getStyledDocument().insertString(editor.getStyledDocument().getLength(), arB, attrs);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        StyledDocument st=editor.getStyledDocument();
        SimpleAttributeSet bSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(bSet, centrar);
        st.setParagraphAttributes(0,editor.getText().length(), bSet, false);
        editor.repaint();
        editor.updateUI();
    }

    public void buscar() {
        String strValor = txtBuscarEliminar.getText().trim();
        txtBuscarEliminar.setText("");
        int valor = Integer.parseInt(strValor);
        Nodo nd = ParbB.buscar(valor);
        if(nd != null){
            JOptionPane.showConfirmDialog(null,"El número "+valor+" se encuentra en el nivel: "+nd.getNivel());
        }
        else{
            JOptionPane.showConfirmDialog(null,"Valor NO encontrado");
        }
        txtBuscarEliminar.requestFocus();
    }
}