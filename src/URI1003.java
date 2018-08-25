import java.util.Scanner;

public class URI1003 {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int A = Integer.parseInt(input.nextLine());
        int B = Integer.parseInt(input.nextLine());
        int soma = (A+B);
        System.out.println("SOMA = "+soma);
        input.close();
    }
}
