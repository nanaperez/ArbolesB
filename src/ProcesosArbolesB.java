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
    protected int contadornodos = 1;

    protected void Insertar(int Valor){
        int Pos = ObtenerPosicion(Valor,contadornodos);
        if(Temp.size() < ordenarbol*2 && contadornodos == 1){
            Temp.add(Pos,Valor);
        }else{
            if(contadornodos == 3){
                if(Valor < Integer.parseInt(Raiz.get(0).toString())){
                    HojasIzq.add(Pos,Valor);
                }else{
                    HojasDer.add(Pos,Valor);
                }
            }else{
                Temp.add(Pos,Valor);
                Raiz.add(Temp.get(ordenarbol));

                for(int hizq = 0; hizq < ordenarbol;hizq++){
                    HojasIzq.add(Temp.get(hizq));
                }
                for(int hder = ordenarbol+1; hder <= 2*ordenarbol;hder++){
                    HojasDer.add(Temp.get(hder));
                }
                Temp.clear();
                contadornodos = 3;
            }
        }
    }

    protected int ObtenerPosicion(int valor, int contnod) {
        int tam;
        boolean der = true;
        if(contnod == 1){
        tam = Temp.size();
        }else{
            if(valor < Integer.parseInt(Raiz.get(0).toString())){
                tam = HojasIzq.size();
                der = false;
            }else{
                tam = HojasDer.size();
            }

        }
        int i = 0;
        if(tam != 0){
            while(i < tam){
                int valarray;
                if(contnod == 1){
                    valarray = Integer.parseInt(Temp.get(i).toString());
                }else{
                    if(der){
                        valarray = Integer.parseInt(HojasDer.get(i).toString());
                    }else{
                        valarray = Integer.parseInt(HojasIzq.get(i).toString());
                    }

                }
                if(valor < valarray){
                    return i;
                }
                i++;
            }
            return i;
        }
        return 0;
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
