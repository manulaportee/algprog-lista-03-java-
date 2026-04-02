import java.util.Scanner;

public class SemiCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Insira um número real: ");
        double resposta1 = scanner.nextDouble();
        System.out.println("Insira outro número real: ");
        double resposta2 = scanner.nextDouble();
        System.out.println("Insira um símbolo de operação entre os números reais: ");
        String simbolo = scanner.next();

        switch (simbolo) {
            case "+":
                double adição = resposta1 + resposta2;
                System.out.println("O resultado da operação é: " + adição);
                break;
            case "-":
                double subtração = resposta1 - resposta2;
                System.out.println("O resultado da operação é: " + subtração);
                break;
            case "*":
                double multiplicação = resposta1 * resposta2;
                System.out.println("O resultado da operação é: " + multiplicação);
                break;
            case "/":
                double divisão = resposta1 / resposta2;
                System.out.println("O resultado da operação é: " + divisão);
                break;
            case "^":
                divisão = resposta1 / resposta2;
                System.out.println("O resultado da operação é: " + divisão);
                break;
            default:
                System.out.println("ERRO: O símbolo da operação é inválido. \nFavor inserir um dos símbolos propostos.");
                break;
        }
        scanner.close();

    }
}
