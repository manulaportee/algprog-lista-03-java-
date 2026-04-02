import java.util.Random;
import java.util.Scanner;

public class Sorteador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();

        System.out.println("Insira um número inteiro: ");
        int resposta1 = scanner.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int resposta2 = scanner.nextInt();

        int maior = Math.max(resposta1, resposta2);
        int menor = Math.min(resposta1, resposta2);

        int numeroSorteado = random.nextInt((maior - menor) + 1) + menor;

        System.out.println("O maior número inserido é: " + maior + "\nO menor número inserido é: " + menor);
        System.out.println("O número sorteado é: " + numeroSorteado);

        if (numeroSorteado % 2 == 0){
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        scanner.close();
    }
}
