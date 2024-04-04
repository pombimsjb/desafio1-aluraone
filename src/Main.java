import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //GERAR SISTEMA BANCÁRIO
        /*
        EXIBIÇÃO INICIAL: DADOS DO CLIENTE, NOME, TIPO CONTA, SALDO INICIAL.
        OPERAÇÕES: CONSULTA DE SALDO, RECEBER VALOR, TRANSFERIR VALOR E SAIR
        */

        String nome = "Tião do Gás";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        //Inicialização da conta
        System.out.println("*******************");
        System.out.println("\nNome do cliente: "+ nome);
        System.out.println("Tipo conta: "+tipoConta);
        System.out.println("Saldo atual: "+saldo);
        System.out.println("\n*******************");


        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transfeir Valor
                3 - Receber Valor
                4 - Sair
                
                """;
        //Menu de opções
        Scanner leitor = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.printf("Seu saldo é de R$ %.2f",saldo);
                    break;
                case 2:
                    System.out.printf("\nSeu saldo é de R$ %.2f",saldo);
                    System.out.println("\nDigite o valor à transferir:");
                    double valorTransferencia = leitor.nextDouble();
                    if(saldo < valorTransferencia){
                        System.out.println("Saldo insuficiente!");
                    }else{
                        saldo = saldo - valorTransferencia;
                        System.out.printf("Transferencia de R$ %.2f enviada com sucesso e seu saldo atual é de R$ %.2f\n",valorTransferencia, saldo);
                    }
                    break;
                case 3:
                    System.out.printf("\nSeu saldo é de R$ %.2f",saldo);
                    System.out.println("\nDigite o valor à transferir:");
                    double valorReceber = leitor.nextDouble();
                        if(valorReceber < 0){
                            System.out.println("Valor inválido!");
                        }else{
                            saldo = saldo + valorReceber;
                            System.out.printf("Valor recebido, seu novo saldo é de R$ %.2f\n",saldo);
                        }
                    break;
                default:
                    break;
            }
        }
    }
}