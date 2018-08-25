import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class URI1020 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = Integer.parseInt(input.nextLine());
        int ano = valor/365;
        int valor2 = valor%365;
        int mes = valor2/30;
        int dia = (valor2%30)%30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",ano,mes,dia);
        input.close();
    }
}
