import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list [] = input.nextLine().split(" ");
        float x = Float.parseFloat(list[0]);
        float y = Float.parseFloat(list[1]);

        if (x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0){
            System.out.println("Q2");
        } else if (x < 0 && y < 0){
            System.out.println("Q3");
        } else if (x > 0 && y < 0){
            System.out.println("Q4");
        } else if (x == 0 && y == 0){
            System.out.println("Origem");
        }else{
            if (x ==0){
                System.out.println("Eixo Y");
            }else{
                System.out.println("Eixo X");
            }
        }
        input.close();
    }
}
