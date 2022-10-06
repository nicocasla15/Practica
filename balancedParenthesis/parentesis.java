package balancedParenthesis;

public class parentesis {
    
    public static int parent(String parentesis){
        int count = 0;
        int par = 0;

        for(int i = 0;i<parentesis.length();i++){
            if(parentesis.charAt(i) == '(' ){
                count += 1;
            }
            else if(parentesis.charAt(i) == ')'){
                count -= 1;
                if(count < 0){
                    par += 1;
                    count += 1;
                }
            }
        }
        return count+par;
    }

    public static void main(String[] args) {
        String parentesis = ")(";
        System.out.println(parent(parentesis));
    }
}
