package cutTheSticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cutTheSticks {

    public static List<Integer> cutSticks(int[] arr){
        Arrays.sort(arr);

        List<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(arr.length);
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr1.add(arr.length - i);
            }
        }
        return arr1;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,3,3,2,1};
        System.out.println(cutSticks(arr));
    }

}
