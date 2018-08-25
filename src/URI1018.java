import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int notas = Integer.parseInt(input.nextLine());
        int cont;
        System.out.printf("%d\n", notas);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas/100);
        cont = notas%100;
        System.out.printf("%d nota(s) de R$ 50,00\n", cont/50);
        cont = cont%50;
        System.out.printf("%d nota(s) de R$ 20,00\n", cont/20);
        cont = cont%20;
        System.out.printf("%d nota(s) de R$ 10,00\n", cont/10);
        cont = cont%10;
        System.out.printf("%d nota(s) de R$ 5,00\n", cont/5);
        cont = cont%5;
        System.out.printf("%d nota(s) de R$ 2,00\n", cont/2);
        cont = cont%2;
        System.out.printf("%d nota(s) de R$ 1,00\n", cont/1);
        input.close();
    }
}
