import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("\nDigite outro numero inteiro: ");
        int num2 = scanner.nextInt();
        
        System.out.print("\nDigite outro numero inteiro: ");
        int num3 = scanner.nextInt();
        
        if (num1 < num2 && num1 < num3){
            System.out.printf("O numero %d e o menor dos 3!", num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.printf("O numero %d e o menor dos 3!", num2);
        }else if (num3 < num1 && num3 < num2){
            System.out.printf("O numero %d e o menor dos 3!", num3);
        }
        
        scanner.close();
    }
}