package test;

public class Calculadora {
    
    public static int Suma(int x, int y){
        return x+y;
    }
    
    public int Resta(int x, int y){
        return x-y;
    }
    
    public static int Maximo(int[] array) {
        int max = array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }

    public static int Cubo(int n){
        return n*n*n;
    }
}