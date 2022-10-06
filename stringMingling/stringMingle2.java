package stringMingling;

public class stringMingle2 {
    
    public static String stringMingle(String stringp, String stringq){
        String newString = "";
        for(int i=stringp.length()-1;i>=0;i--){
            newString += stringq.charAt(i);
            newString += stringp.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args) {
        String stringp = "abcde";
        String stringq = "pqrst";
        System.out.println(stringMingle(stringp, stringq));
    }
}
