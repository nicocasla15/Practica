package cutTheSticks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cutTheSticks {

    public static List<Integer> cutSticks(List<Integer> arr, int n){
        Collections.sort(arr);
        List<Integer> arr1 = new ArrayList<Integer>();
        


        return arr1;


    }

    public static void main(String[] args){
        int n = 6;
        List<Integer> arr = new ArrayList<Integer>(n);
        arr.add(5);
        arr.add(4);
        arr.add(4);
        arr.add(2);
        arr.add(2);
        arr.add(8);
        System.out.println(cutSticks(arr,n));
    }

}
