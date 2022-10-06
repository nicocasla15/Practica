package busquedaBinaria;

public class binaria {

    private static int busqBinaria (int[] num) {
        int izquierda = 0;
        int derecha = num.length -1;
        int numABuscar = 66;
        int medio = 0;

        while(izquierda <= derecha){
            medio = (izquierda+derecha/2);

            if(num[medio] < numABuscar){
                izquierda = medio +1;
            }
            else if(num[medio] > numABuscar){
                derecha = medio - 1;
            }
            else if(num[medio] == numABuscar){
                break;
            }    
        }
        return medio;
    }

       
    public static void main(String[] args) {
        int num[] = {1, 3, 4, 5, 9, 48, 52, 66};
        busqBinaria(num);
        System.out.println(busqBinaria(num));
    }

}
