import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valor [] = input.nextLine().split(" ");
        int A = Integer.parseInt(valor[0]);
        int B = Integer.parseInt(valor[1]);
        double C = Double.parseDouble(valor[2]);
        String valor2 [] = input.nextLine().split(" ");
        int D = Integer.parseInt(valor2[0]);
        int E = Integer.parseInt(valor2[1]);
        double F = Double.parseDouble(valor2[2]);

        double valor3 = (B*C)+(E*F);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valor3);
        input.close();
    }
}
