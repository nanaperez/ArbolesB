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
    protected int ordenarbol;

    protected boolean Insertar(int pos, String Valor){
        try{
            ArbolB.add(pos,Valor);
        }catch (ArrayStoreException e){

        }
        return true;
    }

    private boolean Borrar(int pos){
        try{

        }catch (ArrayStoreException e){

        }
        return true;
    }

    private boolean Buscar(int pos){
        try{

        }catch (ArrayStoreException e){

        }
        return true;
    }
}
