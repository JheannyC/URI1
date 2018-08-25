import java.util.Scanner;

public class URI1014 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        double y = Float.parseFloat(input.nextLine());
        double gasto = x/y;
        System.out.printf("%.3f km/l\n",gasto );
        input.close();
    }

}
