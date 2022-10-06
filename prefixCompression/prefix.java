package prefixCompression;

public class prefix {
    
    public static void prex(String a, String b){
        String p = "";
        String a1 = "";
        String b1 = "";
        int n = 0;
        int min = 0;
        
        if(a.length() > b.length()){
            n = a.length();
            min = b.length();
        } 
        else{
            n = b.length();
            min = a.length();
        }

        for(int i=0;i<n;i++){
            if(i >= min){
                if(min == b.length()){
                    a1 += a.charAt(i);
                }
                else{
                    b1 += b.charAt(i);
                }
            }
            else if(i <= min){
                if(a.charAt(i) == b.charAt(i)){
                    p += a.charAt(i);
                }
                else{
                    a1 += a.charAt(i);
                    b1 += b.charAt(i);
                }
            }
        }
        System.out.println(p.length());
        System.out.println(p);
        System.out.println(a1.length());
        System.out.println(a1);
        System.out.println(b1.length());
        System.out.println(b1);
    }
    
    public static void main(String[] args) {
        String a = "aaabhj";
        String b = "aaakkk";
        prex(a, b);
    }
}


