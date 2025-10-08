public class Arreglo1 {
    public static void main(String[] args) {
        int[][] arrExample = {
            {2, 5, 0, 1},
            {5, 1, 9, 5},
            {9, 5, 2, 8},
            {4, 0, 0, 4},
            {7, 5, 1, 2}
        };

        arrExample[0][0] = 0;
        arrExample[1][1] = 0;
        arrExample[2][2] = 0;
        arrExample[3][3] = 0;

        int sumadiagonal = 0;

         for (int[] fila : arrExample) {
            for (int valor : fila) {
                sumadiagonal += valor; 
            }
        }

        System.out.println("La suma total del arreglo sin la diagonal es: " + sumadiagonal);


    }
}
