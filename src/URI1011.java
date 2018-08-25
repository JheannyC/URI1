import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = Integer.parseInt(input.nextLine());
        double formula = ((4/3.0)*3.14159)*numero*numero*numero;
        System.out.printf("VOLUME = %.3f\n",formula);
        input.close();
    }
}
