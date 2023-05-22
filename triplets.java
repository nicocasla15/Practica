import java.util.ArrayList;
import java.util.List;

public class triplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            List<Integer> tot = new ArrayList<>();
            
            int alicescore = 0;
            int bobscore = 0;
            
            for (int i = 0; i< a.size(); i++){
                if (a.get(i) > b.get(i)){
                    alicescore += 1;
                }
                else if(a.get(i) < b.get(i)){
                    bobscore += 1;          
                }
            }
            
            tot.add(alicescore);
            tot.add(bobscore);
            
            return tot;
}
public static void main (String[] args){
    List<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    List<Integer> b = new ArrayList<>();
    b.add(3);
    b.add(2);
    b.add(1);
    System.out.println(compareTriplets(a, b));

}
}
