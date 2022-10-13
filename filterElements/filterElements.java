package filterElements;

import java.util.ArrayList;
import java.util.List;

public class filterElements {
    
    public static List<Integer> filterEle(int n, int k, int[] a) {  
        List<Integer> newA = new ArrayList<Integer>();
        
        for(int i = 0; i < n-1; i++){
            for(int j = 1; j < n-2; j++){
                if(a[i] == a[j]){
                    if(newA.contains(a[i])){
                        i += 1;
                    }
                    else{
                        newA.add(a[i]); 
                    }
                }
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