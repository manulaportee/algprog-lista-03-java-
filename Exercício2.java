import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int Cinquenta = 0, Vinte = 0, Dez = 0, Cinco = 0, Dois = 0, Um = 0;

        System.out.println("Seja bem vindo(a) à Máquina de Venda Automática.\n Insira o valor total da compra: ");
        int valorTotal = scanner.nextInt();
        System.out.println("Insira o valor total do pagamento: ");
        int pagamentoTotal = scanner.nextInt();

        if (pagamentoTotal < valorTotal){
            System.out.println("Quantia insuficiente para pagamento. \nFavor realizar o pagamento com o valor correto equivalente à compra total.");
        } else {
            System.out.println("Valor total da compra: "+ valorTotal + "\nValor pago: " + pagamentoTotal);
        }
        int troco = pagamentoTotal - valorTotal;

            Cinquenta = troco / 50;
            troco = troco % 50;

            Vinte = troco / 20;
            troco = troco % 20;

            Dez = troco / 10;
            troco = troco % 10;

            Cinco = troco / 5;
            troco = troco % 5;

            Dois = troco / 2;
            troco = troco % 2;

            Um = troco;

        System.out.println("Troco total: "+ troco + "\nNotas de R$50,00: " + Cinquenta + "\nNotas de R$20,00: "+ Vinte +  "\nNotas de R$10,00: "+ Dez + "\nNotas de R$5,00: " + Cinco + "\nNotas de R$2,00: " + Dois + "\nNotas de R$1,00: " + Um);
   
        scanner.close();
    }
    
}
