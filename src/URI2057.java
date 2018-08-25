import java.util.Scanner;

public class URI2057 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String array [] = (input.nextLine().split(" "));
        int S = Integer.parseInt(array [0]); //saída;
        int T = Integer.parseInt(array [1]); //tempo;
        int F = Integer.parseInt(array [2]); //fuso;
        int hora = (S+T+F)%24; //hora que chegou;
        if ( hora<0){
            hora = 24+hora;
        }
        System.out.println(hora);
        input.close();
    }
}
