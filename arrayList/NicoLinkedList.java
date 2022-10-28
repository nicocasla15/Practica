package arrayList;

public class NicoLinkedList {

    Nodo root = null;
    Nodo fin = null;
    int size = 0;
    int cont = 0;

    public NicoLinkedList(){
        super();
    }

    public void add(int n) {
        if(root == null){
            root = new Nodo(n);
            fin = root;
        }
        else {
            fin.puntero = new Nodo(n);
            fin = fin.puntero;
        }
        
    }

    public void Lista() {
        Nodo nod = root;
        while(nod!=null){
            System.out.print(nod.elemento+", ");
            nod = nod.puntero;
        }
    }

    public static void main(String[] args){
        NicoLinkedList arr = new NicoLinkedList();
        arr.add(1);
        arr.add(9);
        arr.add(22);
        arr.add(87);
        arr.Lista();
    }
}