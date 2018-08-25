import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = Double.parseDouble(entrada.nextLine());
        valor = valor + 0.001f;
        int cedulas [] = {100, 50, 20, 10, 5, 2};
        double[] moedas;
        moedas = new double[]{1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.println("NOTAS:");
        for (int i = 0; i<6; i++){
            double ced;
            ced = (int) valor / cedulas[i];
            valor = valor % cedulas[i];
            System.out.printf("%.0f nota(s) de R$ %d.00\n", ced, cedulas[i]);
        }
        System.out.println("MOEDAS:");
        for (int n = 0; n < 6; n++) {
            double moed = Math.floor(valor / moedas[n]);
            valor = valor % moedas [n];
            System.out.printf("%.0f moeda(s) de R$ %.2f\n", moed, moedas[n]);
        }
    entrada.close();
    }
}
