import java.util.Scanner;

public class URI1005 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        double nota1 = Double.parseDouble (input.nextLine());
        double nota2 = Double.parseDouble (input.nextLine());
        double MEDIA = ((nota1*3.5)+(nota2*7.5))/11;
        System.out.printf("MEDIA = %.5f\n",MEDIA);
        input.close();
    }
}
