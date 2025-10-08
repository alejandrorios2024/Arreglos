public class Arreglo {
    public static void main(String[] args) {
        int[][] arrExample = {
            {2, 5, 0, 1},
            {5, 1, 9, 5},
            {9, 5, 2, 8},
            {4, 0, 0, 4},
            {7, 5, 1, 2}
        };

        int sumaTotal = 0; 

        for (int[] fila : arrExample) {
            for (int valor : fila) {
                sumaTotal += valor; 
            }
        }

        System.out.println("La suma total del arreglo es: " + sumaTotal);

    }
}
    

