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

    public boolean contains(int elemento){
        boolean a = false;
        int contador = 0;
        Nodo nodo = root;
        while(contador<size){
            if(nodo.getElemento() == elemento){
                a = true;
            }
            nodo = nodo.getPuntero();
            contador++;
        }
        return a;
    }

    public String Lista() {
        String a = "";
        Nodo nodo = root;
        while(nodo != null){
            a += nodo.elemento+" ";
            nodo = nodo.puntero;
        }
        return a;
    }

    public static void main(String[] args){
        NicoLinkedList arr = new NicoLinkedList();
        arr.add(1);
        arr.add(9);
        arr.add(63);
        arr.add(22);
        arr.add(87);
        arr.add(33);
        System.out.println(arr.Lista()); 
        System.out.println(arr.Size());
        System.out.println(arr.Get(4));
        System.out.println(arr.contains(63));
    }
}