package bubble;

import java.util.Arrays;

public class bubble {
    
    private static void burbuja(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int numero = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = numero;
                }
            }
        }
    }
    public static void main(String[] args) {
        int numeros[] = {10, 3, 7, 4, 5, 1, 9, 8, 2, 6};
        burbuja(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}