package arrayList;

public class arrayList {
    
    private static int defaultCapacity = 10;
    private static int[] array = {defaultCapacity};
    int size = 0;
    int cont = 0;

    public arrayList(){
        super();
    }

    public void add(int index,int element) {
        array[index] += element;
        cont += 1;
        if(cont == 1){
            size += 1;
        }
    }

    public int[] getArray(){
        return array;
    }

    public static void main(String[] args){
        arrayList arr = new arrayList();
        arr.add(0,7);
        System.out.println(arr.getArray());
    }
}

