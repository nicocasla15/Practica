
package stringPermute;

public class stringPermute {
    
    public static String stringPer(String str){
        String newString  = "";
        for(int i = 0; i<str.length();i++){
            if (i == 7){
                break;
            }
            newString += str.charAt(i+1);
            newString += str.charAt(i);
            i += 1;
        }
        return newString;
    }
 
    public static void main(String[] args){
        String str = "abcdpqrs";
        System.out.println(stringPer(str));
    }
}
