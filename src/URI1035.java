import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valores [] = (input.nextLine().split(" "));

        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);
        int d = Integer.parseInt(valores[3]);
        int soma1 = c+d;
        int soma2 = a+b;
        if (b > c && d > a && soma1 > soma2 && c > 0 && d > 0 && a%2==0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        input.close();
    }
}
