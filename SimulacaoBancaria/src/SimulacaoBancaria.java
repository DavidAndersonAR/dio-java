import java.util.Scanner;
public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;


        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            System.out.println("3.Consultar Saldo");
            System.out.println("4.Encerrar");


            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    int valor = scanner.nextInt();
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    int valorSaque = scanner.nextInt();
                    if(valorSaque > saldo){
                        System.out.println("Saldo insuficiente.");
                    }
                    else {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.




        }
    }
}
