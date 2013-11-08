/**
 * Created with IntelliJ IDEA.
 * User: jessecogollo
 * Date: 2/11/13
 * Time: 12:47 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;

public class ProcesosArbolesB {

    ArrayList ArbolB = new ArrayList();
    ArrayList Raiz = new ArrayList();
    ArrayList HojasIzq = new ArrayList();
    ArrayList HojasDer = new ArrayList();
    ArrayList Temp = new ArrayList();
    protected int ordenarbol = 2;

    protected boolean Insertar(int pos, int Valor){
        //boolean ins = ArbolB.add(Valor);
        if(Temp.size() < ordenarbol*2){
            Temp.add(pos,Valor);
        }else{
            Temp.add(pos,Valor);
            Raiz.add(Temp.get(ordenarbol));

            HojasIzq.add(Temp.get(0));
            HojasIzq.add(Temp.get(1));

            HojasDer.add(Temp.get(3));
            HojasDer.add(Temp.get(4));
            Temp.clear();
        }

    return true;
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
