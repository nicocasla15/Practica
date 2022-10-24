package arrayList;

import java.util.LinkedList;

public class NicoLinkedList {
    
    private static int defaultCapacity = 10;
    private static int[] array = new int[defaultCapacity];
    private static int[] newArray;
    int size = 0;
    int cont = 0;

    public NicoLinkedList(){
        super();
        newArray = new int[size];
    }

    public void add(int element) {
        
    }

    public static void main(String[] args){
        NicoLinkedList arr = new NicoLinkedList();
        arr.add(7);
        arr.add(6);
    }
}
