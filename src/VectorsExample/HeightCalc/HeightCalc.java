package VectorsExample.HeightCalc;

import java.util.Locale;
import java.util.Scanner;

public class HeightCalc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i<n; i++) {
            System.out.println("Digite o número para armazenar no vetor");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i<n; i++) {
            sum += vect[i];

        }

        double avg = sum/n;

        System.out.println("Média de alturas: " + avg);

        sc.close();
    }

//    public void teste() {
//        System.out.println("Testando se lembro de POO ainda");
//    }
}
