package staticExamples;

import staticExamples.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.println("Circumference: " + c);
        System.out.println("Volume: " + v);

        sc.close();

    }
}
