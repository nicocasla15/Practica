package stringMingling;

public class stringMingling {
    
    public static String stringMing(String stringp, String stringq){
        String newString = "";
        for(int i=0; i<stringp.length();i++){
            newString += stringp.charAt(i);
            newString += stringq.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args) {
        String stringp = "abcde";
        String stringq = "pqrst";
        System.out.println(stringMing(stringp, stringq));
    }
}
