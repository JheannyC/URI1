import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double raio = Double.parseDouble(input.nextLine());
        double area = 3.14159 * raio * raio;
        System.out.printf("A=%.4f\n", area);
        input.close();
    }
}
