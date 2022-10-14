package jumpingClouds;

import java.util.ArrayList;
import java.util.List;

public class jumpingClouds {
    

    public static int jumpingInClouds(List<Integer> c,int n){
        int count = 0;
        int i = 0;
        while(i < c.size() - 1) {
            if(c.get(i + 2) == 1){
                count++;
                i++;
            } else {
                i += 2;
                count++;
            }
        }
        return count;    
    
    }

    public static void main(String[] args){
        List<Integer> c = new ArrayList<Integer>();
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        int n = 6;
        System.out.println(jumpingInClouds(c, n));
    }
}
