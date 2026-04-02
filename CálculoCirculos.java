import java.util.Scanner;

public class CálculoCirculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Seja bem vindo(a), escolha o tipo de operação que deseja realizar: ");
        System.out.println("1- Perímetro do círculo \n2- Área do círculo \n3- Volume da esfera");
        int resposta = scanner.nextInt();

        switch (resposta) {
            case 1: 
                System.out.println("Digite o valor do raio do círculo: ");
                double raio = scanner.nextDouble();
                double perimetroCirculo = 2 * 3.14 *raio;
                System.out.println("O valor do perímetro do círculo é: " + perimetroCirculo);
                break;
            case 2: 
                System.out.println("Digite o valor do raio do círculo: ");
                raio = scanner.nextDouble();
                double areaCirculo = 3.14 * (raio * raio);
                System.out.println("O valor da área do círculo é: " + areaCirculo);
                break;
            case 3: 
                System.out.println("Digite o valor do raio do círculo: ");
                raio = scanner.nextDouble();
                double volumeEsfera = 4.0/3.0 * 3.14 * (raio * raio * raio);
                System.out.println("O valor do volume da esfera é: " +volumeEsfera);
                break;
            default:
                System.out.println("ERRO: Código de operação inválido. \nFavor inserir o número de alguma das opções oferecidas.");
                break;
        }
        scanner.close();
    }
}
