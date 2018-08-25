
import java.util.Scanner;

public class URI1016 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number = Integer.parseInt(input.nextLine());
            int valor = number * 2;
            System.out.printf("%d minutos\n", valor);
            input.close();
        }

}
