package stringCompression;

public class stringCompression {
    
    public static String stringCompress(String string){
        int count = 1;
        String s = "";

        for(int i=0;i<string.length();i++){
            if(i == 0){
                s += string.charAt(i);
            }
            else if(count>1 & string.charAt(i) != string.charAt(i-1)){
                s += count;
                s += string.charAt(i);
                count = 1;
            }
            else if(string.charAt(i) != string.charAt(i-1)){
                s += string.charAt(i);
            }
            else{
                count += 1;
            }
        }
        if(count>1){
            s += count;
        }
        return s;
    }

    public static void main(String[] args) {
        String string = "abbcccdeefggghiiaa";
        System.out.println(stringCompress(string));
    }
}
