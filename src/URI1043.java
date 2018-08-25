import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lista [] = input.nextLine().split(" ");
        float n1 = Float.parseFloat(lista[0]);
        float n2 = Float.parseFloat(lista[1]);
        float n3 = Float.parseFloat(lista[2]);
        float n4 = Float.parseFloat(lista[3]);
        float peso = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
        if (peso >= 5 && peso <=6.9){
            float exame = Float.parseFloat(input.nextLine());
            float exame2 = (exame+peso)/2;
            if (exame2>5){
                System.out.printf("Media: %.1f\nAluno em exame.\nNota do exame: %.1f\nAluno aprovado.\nMedia final: %.1f\n",peso, exame, exame2);
            }else {
                System.out.printf("Media: %.1f\nAluno em exame.\nNota do exame: %.1f\nAluno reprovado.\nMedia final: %.1f\n",peso, exame, exame2);
            }
        } else if (peso > 7){
            System.out.printf("Media: %.1f\nAluno aprovado.\n", peso);
        }else {
            System.out.printf("Media: %.1f\nAluno reprovado.\n", peso);
        }
        input.close();
    }
}
