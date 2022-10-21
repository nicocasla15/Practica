
package arrayList;

import java.util.Arrays;

public class arrayList {
    
    private static int defaultCapacity = 10;
    private static int[] array = new int[defaultCapacity];
    private static int[] newArray;
    int size = 0;
    int cont = 0;

    public arrayList(){
        super();
    }

    public void add(int element) {
        if(array.length <= defaultCapacity){
            array[cont] += element;    
            cont += 1;
            if(cont >= 1){
                size += 1;
            }
            newArray = new int[size];
            for(int i = 0; i<size;i++){
                newArray[i] += array[i];
            }
        }
    }

    public int get(int index){
        return newArray[index];
    }

    public int getSize(){
        return size;
    }

    public int[] getArray(){
        return newArray;
    }

    public boolean contains(int element){
        boolean a = false;
        boolean b;
        boolean c;
        for(int i = 0; i<newArray.length;i++){
            if(newArray[i] == element){
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
        arrayList arr = new arrayList();
        arr.add(7);
        arr.add(6);
        System.out.println(Arrays.toString(arr.getArray()));
        System.out.println(arr.get(0));
        System.out.println(arr.getSize());
        System.out.println(arr.contains(5));
    }
}

