package filterElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterElements {
    
    public static List<Integer> filterEle(int n, int k, int[] a) {  
        List<Integer> newA = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j+1]) {
                    int numero = a[j];
                    a[j] = a[j+1];
                    a[j+1] = numero;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < n-1; i++){
            if(a[i] == a[i+1]){
                newA.add(a[i]);
            }
        }
        return newA;
    }

    public static void main(String[] args) {
        int n = 9;
        int k = 2;
        int[] a = {4,5,2,5,4,3,1,3,4};
        System.out.println(filterEle(n,k,a));
    }
}
