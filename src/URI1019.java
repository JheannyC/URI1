import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundos = Integer.parseInt(input.nextLine());
        int minuto, hora;

        hora = segundos / 3600;
        segundos = segundos - (hora * 3600);

        minuto = segundos / 60;
        segundos = segundos - (minuto * 60);


        System.out.printf("%d:%d:%d\n", hora, minuto,segundos);
        input.close();
    }
}
