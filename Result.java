public class Result {

    static int simpleArraySum (int[] ar) {
        int total = 0;
        for(int i=0; i<ar.length; i++){
            total = total + ar[i];
        }
        return total;
    }

public static void main(String[] args) {
    int[] ar = {1, 2, 3, 4, 10, 11};
    int sum = simpleArraySum(ar);
    System.out.println(sum);
    }
}