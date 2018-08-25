import java.util.Scanner;

public class URI1004 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int A = Integer.parseInt(input.nextLine());
        int B = Integer.parseInt(input.nextLine());
        int PROD = (A*B);
        System.out.println("PROD = "+PROD);
        input.close();
    }
}
