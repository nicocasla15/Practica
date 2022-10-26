
package arrayList;

import java.util.Arrays;

public class NicoArrayList {
    
    private static int defaultCapacity = 10;
    private static int[] array;
    int size = 0;
    int cont = 0;

    public NicoArrayList(){
        super();
        array = new int[defaultCapacity];
    }

    public void add(int element) {
        if(array.length <= defaultCapacity){
            array[size] += element;    
            size += 1;
        }
    }

    public String toString(){
        int[] arr = new int[size];
        for(int i = 0; i<size;i++){
            arr[i] += array[i];
        }
        return ""+Arrays.toString(arr);
    }

    public int get(int index){
        return array[index];
    }

    public int getSize(){
        return size;
    }

    public boolean contains(int element){
        boolean a = false;
        boolean b;
        boolean c;
        for(int i = 0; i<array.length;i++){
            if(array[i] == element){
                b = true;
                a = b;
                break;
            }
            else{
                c = false;
                a = c;
            }
        }
        return a;
    }

    public static void main(String[] args){
        NicoArrayList arr = new NicoArrayList();
        arr.add(7);
        arr.add(6);
        System.out.println(arr.toString());
        System.out.println(arr.get(0));
        System.out.println(arr.getSize());
        System.out.println(arr.contains(7));
    }
}

