package sumOfPowers;

public class sumOfPowers {
    
    public static int sumPowers(int x,int n,int num){
        int sum = (int) Math.pow(num, n);
        if(sum < x)
            return sumPowers(x,n,num+1) + sumPowers(x-sum, n, num+1);

        if(sum == x)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int x = 100;
        int n = 2;
        int num = 1;
        System.out.println(sumPowers(x,n,num));
    }
}
