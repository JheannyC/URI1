import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada[] = (input.nextLine().split(" "));
        double a = Double.parseDouble(entrada[0]);
        double b = Double.parseDouble(entrada[1]);
        double c = Double.parseDouble(entrada[2]);

        double triangulo = (a * c) / 2;
        double circulo = 3.14159 * c * c;
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);
        input.close();
    }
}
