import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valor [] = input.nextLine().split(" ");
        int codigo = Integer.parseInt(valor[0]);
        int quantidade = Integer.parseInt(valor[1]);
        double preco;

        if (codigo == 1) {
            preco = quantidade * 4.00;

        } else if (codigo == 2) {
            preco = quantidade * 4.50;

        } else if (codigo == 3) {
            preco = quantidade * 5.00;

        } else if (codigo == 4) {
            preco = quantidade * 2.00;

        } else {
            preco = quantidade * 1.50;
        }System.out.printf("Total: R$ %.2f\n",preco);
        input.close();
    }
}
