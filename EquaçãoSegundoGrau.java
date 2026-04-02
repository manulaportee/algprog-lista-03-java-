import java.util.Scanner;

public class EquaçãoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double coeficienteA = 0, coeficienteB = 0, coeficienteC = 0, x = 0;
        System.out.println("Insira o valor do coeficiente A da Equação do Segundo Grau: ");
            coeficienteA = scanner.nextInt();
        System.out.println("Insira o valor do coeficiente B da Equação do Segundo Grau: ");
            coeficienteB = scanner.nextInt();
        System.out.println("Insira o valor do coeficiente C da Equação do Segundo Grau: ");
            coeficienteC = scanner.nextInt();

        double discriminante = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);
        double raiz1 = (-coeficienteB + discriminante) / 2 * coeficienteA;
        double raiz2 = (-coeficienteB - discriminante) / 2 * coeficienteA;

        if (coeficienteA == 0 && coeficienteB == 0 && coeficienteC!=0){
            System.out.println("Coeficientes informados incorretamente.");
        }
        else if (coeficienteA == 0 && coeficienteB !=0){
            double eqPrimeiroGrau = (- coeficienteC) / coeficienteB;
            System.out.println("Essa é uma equação de primeiro grau");
            System.out.println("O resultado da equação do primeiro grau proposta é: " + eqPrimeiroGrau);
        }
        else if (discriminante < 0){
            System.out.println("Esta equação não possui raízes reais");
        }
        else if (discriminante == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais, sendo elas: " + "\n1: " + raiz1 + "\n2: " + raiz2);
        }
        else if (discriminante > 0){
            System.out.println("Esta equação possui duas raízes reais diferentes, sendo elas: " + "\n1: " + raiz1 + "\n2: " + raiz2);
        }

            scanner.close();
    }
}
