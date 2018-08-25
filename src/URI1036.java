import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valores [] = (input.nextLine().split(" "));
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);

        double delta = (b*b)-(4*a*c);
        double raiz = Math.sqrt(delta);

        if (delta < 0 || (2*a)==0) {
            System.out.println("Impossivel calcular");
        } else {

            double x1 = ((-b + raiz) / (2 * a));
            double x2 = ((-b - raiz) / (2 * a));

            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        }
        input.close();
    }
}
