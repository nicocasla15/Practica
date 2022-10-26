package arrayList;

public class filterElements2 extends NicoArrayList{
    
    public static void filterEle(int n, int k, int[] a) {  
        NicoArrayList newA = new NicoArrayList();
            
        for(int i = 0; i < n; i++){
            int cont = 1;
            for(int j = 0; j < n-i; j++){
                if(a[i] == a[j+1+i]){
                    cont += 1;
                    if(newA.contains(a[i])){
                     break;
                    }
                    else if(cont >= k){
                    newA.add(a[i]);
                    }
                }
            }
        }
        System.out.println(newA.toString());
    }

    public static void main(String[] args) {
        int n = 9;
        int k = 3;
        int[] a = {4,5,2,5,4,3,1,1,3,4};
        filterEle(n,k,a);
    }
      
}
