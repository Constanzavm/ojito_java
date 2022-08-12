import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("númeritos a sacrificar por PI");
        int numeroParaPi = scan.nextInt(); //define cuantas veces se ralizara la suma infinita volviendola finita

        List<Double> fracciones = new ArrayList<>();
        double fraccion = -1; // aquí se guarda temporlamente el número para la fracción para la suma infinita
        for (int i = 0; i < numeroParaPi ; i++) {
            fraccion = fraccion + 2; //considerando que partimos de -1 se asegura de que el incremento sea 1, 3, 5, 7...
            /*
            define si el número para la suma será positivo o negativo
            dejando la secuencia en 1/1, -1/3, 1/5, -1/7, 1/9...
            */
            if ((i + 1) % 2 > 0) {
                fracciones.add(1 / fraccion);
            } else {
                fracciones.add(-(1 / fraccion));
            }
        }

        double suma = 0; //para la suma de las fracciones
        for (Double n: fracciones
             ) {
            suma = suma + n;
        }

        double elPi = 4 * (suma); //nuestro calculo de Pi

        System.out.println("el pi falso " + elPi);
        System.out.println("el pi verdadero" + Math.PI);
        System.out.println("la diferencia " + Math.abs(Math.PI - elPi));

    }
}
