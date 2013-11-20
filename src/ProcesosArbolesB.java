/**
 * Created with IntelliJ IDEA.
 * User: jessecogollo
 * Date: 2/11/13
 * Time: 12:47 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ProcesosArbolesB {

    private int ordenarbol;
    private ArrayList<Integer> ArbolB;//Guarda los valores que se van ingresando.
    private Nodo nodo;//Almacena la información necesaria para crear el arbolB
    protected int contadornodos = 1;//Me indica la cantidad de nodos en el ArbolB

    public ProcesosArbolesB(int orden){
        setOrdenarbol(orden);//Me indica en que orden es el arbolB.
        setNodo(new Nodo(orden,true));//Instancia el primer nodo como raiz.
        ArbolB = new ArrayList<Integer>();//Se crea lista para almacenar los valores que se ingresan al arbolB
    }

    protected void Insertar(int Valor){
        ArbolB.add(Valor);//Se ingresa el valor a la lista con los valores del ArbolB
        SubNodo sn = nodo.insertar(Valor);//Se ejecuta el metodo insertar del objeto NODO para retornar un subnodo.
        if(sn != null){
            Nodo nuevonodo = new Nodo(ordenarbol,sn);
            this.nodo = nuevonodo;
        }
    }

    public int getOrdenarbol() {
        return ordenarbol;
    }

    public void setOrdenarbol(int ordenarbol) {
        this.ordenarbol = ordenarbol;
    }
              //niv.getNivel();
    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public String imprimirarbol(ProcesosArbolesB arbol){
        String arbolstring = "";
        ArrayList<Nodo> niv = arbol.recorrer();
        int saltolinea = 0;
        for(Nodo nod : niv){

            if(nod.getNivel() != saltolinea){
                arbolstring += "\n ";
                saltolinea =  nod.getNivel();
            }
            arbolstring += nod.getValoresNodos().toString();
            System.out.println(nod.getOrden()+" orden");
            System.out.println(nod.getNivel()+" nivel");
            System.out.print(nod.getValoresNodos()+"\n ");
        }
        return arbolstring;
    }

    public ArrayList<Nodo> recorrer(){
        Queue<Nodo> cola = new LinkedList<Nodo>();
        ArrayList <Nodo> sale = new ArrayList<Nodo>();
        sale.add(nodo);
        cola.add(nodo);
        while (!cola.isEmpty()){
            Nodo nod = cola.poll();
            for (Nodo hijo: nod.getSubNodos()){
                hijo.setNivel(nod.getNivel() + 1);
                sale.add(hijo);
                cola.add(hijo);
            }
        }
        return sale;
    }

    //protected boolean Borrar(int pos){
        //try{
            //ArbolB.remove(pos);
            //}catch (ArrayStoreException e){

            //}
        //return true;
    //}

    //protected ArrayList Buscar(int pos){
        //ArrayList pp = (ArrayList) ArbolB.get(pos);
        //return pp;
    //}
}
