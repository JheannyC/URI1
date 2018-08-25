import java.util.Scanner;

public class URI1180 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade = Integer.parseInt(entrada.nextLine()); // quantidade de entadas do user;
        int numeros [] = new int [quantidade]; // tamanho do array [quantidade de entradas que o user digitou]
        String [] vetor = entrada.nextLine().split(" "); // valores lidos inserindo espaços

        for (int i=0; i<quantidade; i++){
            numeros[i] = Integer.parseInt(vetor[i]);
        }
        int menor = numeros[0];
        int menorPos = 0;
        for (int i=0; i<quantidade; i++){
            if (numeros[i]<menor){
                menor=numeros[i];
                menorPos=i;
            }
        }entrada.close();
        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+menorPos);
    }
}
