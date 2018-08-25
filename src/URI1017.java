import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = Integer.parseInt(input.nextLine());
        float km = Float.parseFloat(input.nextLine());
        float consumo = (km*hour)/12;
        System.out.printf("%.3f\n", consumo);
        input.close();
    }
}
