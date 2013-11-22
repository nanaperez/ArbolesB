
public class SubNodo {
    private int valor;
    private Nodo hi;
    private Nodo hd;

    public SubNodo(int val, Nodo hi, Nodo hd){
        setValor(val);
        this.setHi(hi);
        this.setHd(hd);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getHi() {
        return hi;
    }

    public void setHi(Nodo hi) {
        this.hi = hi;
    }

    public Nodo getHd() {
        return hd;
    }

    public void setHd(Nodo hd) {
        this.hd = hd;
    }

    public Nodo toRaiz(){
        Nodo nodo = new Nodo(getHd().getOrden(), this);
        return nodo;
    }
}
