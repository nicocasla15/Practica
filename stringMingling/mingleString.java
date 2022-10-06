package stringMingling;

public class mingleString {
    
    public static String mingleStr(String stringp, String stringq){
        String newString = "";
        int n = 0;

        if(stringp.length() > stringq.length()){
            n = stringp.length();
        }
        else{
            n = stringq.length();
        }

        for(int i=0;i<n;i++){
            if(i >= stringp.length()){
                newString += stringq.charAt(i);
            }
            else if(i < stringp.length()){
                newString += stringp.charAt(i);
                newString += stringq.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String stringp = "abc";
        String stringq = "pqrst";
        System.out.println(mingleStr(stringp, stringq));
    }
}
