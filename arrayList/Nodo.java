package arrayList;

public class Nodo {
    Nodo puntero;
    int elemento;

    public Nodo(int n) {
        setPuntero(null);
        setElemento(n);
    }

    public Nodo(int n, Nodo c) {
        setPuntero(c);
        setElemento(n);
    }

    public void setPuntero(Nodo puntero) {
        this.puntero = puntero;
    }

    public Nodo getPuntero() {
        return puntero;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public int getElemento() {
        return elemento;
    }

    
}
