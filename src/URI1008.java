import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = Integer.parseInt(input.nextLine());
        int horas = Integer.parseInt(input.nextLine());
        double valor = Double.parseDouble(input.nextLine());
        double salario = horas*valor;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",numero,salario);
        input.close();
    }
}
