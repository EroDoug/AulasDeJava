import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oper = 0; 
        float saldo = 0; 
        float creditos = 0;
        float debitos = 0;
        
        System.out.print("Digite seu saldo inicial: ");
        saldo = scanner.nextFloat();
        float saldoInicial = saldo;
        
        do {
            System.out.println("\nDigite a operação que deseja fazer!");
            System.out.println("___________________________________");
            System.out.println("0 - Sair para extrato.");
            System.out.println("1 - Adicionar saldo.");
            System.out.println("2 - Sacar Dinheiro.");
            System.out.print("Operacao: ");
            oper = scanner.nextInt();

            if (oper == 1) {
                System.out.print("Digite o valor do depósito: ");
                float valor = scanner.nextFloat();
                creditos += valor;
                saldo += valor; 
            } else if (oper == 2) {
                System.out.print("Digite o valor do saque: ");
                float valor = scanner.nextFloat();
                debitos += valor;
                saldo -= valor; 
            } else if (oper != 0) {
                System.out.println("Essa operação não existe, tente novamente.");
            }

        } while (oper != 0);
        
        // C.P.M.F é 0,40% dos débitos
        float cpmf = debitos * 0.004f;  

        saldo -= cpmf; 

        System.out.println("\n------------------------");
        System.out.printf("Saldo inicial: R$ %.2f\n", saldoInicial);
        System.out.printf("Créditos.....: R$ %.2f\n", creditos);
        System.out.printf("Débitos......: R$ %.2f\n", debitos);
        System.out.printf("C.P.M.F......: R$ %.2f\n", cpmf);
        System.out.printf("Saldo final..: R$ %.2f\n", saldo);
        System.out.println("------------------------");

        scanner.close();
    }
}