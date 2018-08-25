import java.util.Scanner;

public class URI1172 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int valor [] = new int [10];
        for(int i= 0; i< 10; i++){
            int numero = Integer.parseInt(input.nextLine());
            if (numero<=1){
                valor[i] = 1;
            }else{
                valor[i] = numero;
            }
        }for (int i=0; i<10; i++){
            System.out.println("X["+i+"] = "+valor[i]);

        }input.close();

    }
}
