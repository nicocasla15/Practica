package arrayList;

import java.util.Arrays;

public class NicoLinkedList {

    private static int[] array;
    int size = 0;
    int cont = 0;

    public NicoLinkedList(){
        super();
        array = new int[3];
    }

    public void add(int nod2) {
        array[cont] = nod2;
        cont += 1;
    }

    public String toString() {
        return ""+Arrays.toString(array);
    }

    public static void main(String[] args){
        NicoLinkedList arr = new NicoLinkedList();
        int num1 = 1;
        int num2 = 3;
        int num3 = 7;

        Nodo n1 = new Nodo(num1);
        Nodo n2 = new Nodo(num2);
        Nodo n3 = new Nodo(num3);

        n1.setPuntero(n2);
        n2.setPuntero(n3);

        Nodo nod = n1;
        for(int i = 0; i<3;i++){
            int nod2 = nod.getElemento();
            arr.add(nod2);
            System.out.println(nod2);
            nod = nod.getPuntero();
        }
        System.out.println(arr.toString());
    }
}
