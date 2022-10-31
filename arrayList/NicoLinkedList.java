package arrayList;

public class NicoLinkedList {

    Nodo root = null;
    Nodo fin = null;
    int size = 0;

    public NicoLinkedList(){
        super();
    }

    public void add(int n) {
        size++;
        if(root == null){
            root = new Nodo(n);
            fin = root;
        }
        else {
            fin.puntero = new Nodo(n);
            fin = fin.puntero;
        }
        
    }

    public int Size(){
        return size;
    }

    public int Get(int index){
        int contador = 0;
        Nodo nodo = root;
        while(contador<index){
            nodo = nodo.getPuntero();
            contador++;
        }
        return nodo.getElemento();
    }

    public void Lista() {
        Nodo nodo = root;
        while(nodo != null){
            System.out.print(nodo.elemento+" ");
            nodo = nodo.puntero;
        }
    }

    public static void main(String[] args){
        NicoLinkedList arr = new NicoLinkedList();
        arr.add(1);
        arr.add(9);
        arr.add(65);
        arr.add(22);
        arr.add(87);
        arr.Lista();
        System.out.println("\n"+arr.Size());
        System.out.println(arr.Get(3));
    }
}