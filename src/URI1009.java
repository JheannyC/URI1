import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = (input.nextLine());
        double salario = Double.parseDouble(input.nextLine());
        double montante = Double.parseDouble(input.nextLine());
        double valor = (montante*0.15)+salario;
        System.out.printf("TOTAL = R$ %.2f\n", valor);
        input.close();
    }
}
