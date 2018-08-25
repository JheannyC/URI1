import java.util.Scanner;

public class URI1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vetor [] = input.nextLine().split(" ");
        String vetor2 [] = input.nextLine().split(" ");

        double x1 = Double.parseDouble(vetor [0]);
        double x2 = Double.parseDouble(vetor2 [0]);
        double y1 = Double.parseDouble(vetor [1]);
        double y2 = Double.parseDouble(vetor2 [1]);

        double soma =(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);

        double raiz = (Math.sqrt(soma));

        System.out.printf("%.4f\n", raiz);

    }
}

