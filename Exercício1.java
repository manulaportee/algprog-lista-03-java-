import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        if (num1> num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }

        if (num1 < num2 && num1 < num2){
            System.out.println("O menor número é " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor número é " + num2);
        } else {
            System.out.println("O menor número é: "+  num3);
        }

        double mediaAritmetica = (num1 + num2 + num3)/3;
        System.out.println("A média aritmética dos três números é: "+ mediaAritmetica);
    }
    
}
