import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("\nDigite outro numero inteiro: ");
        int num2 = scanner.nextInt();
        
        if (num1 == num2){
            System.out.printf("\n o numero %d e igual ao %d ", num1, num2);
        }else if(num1 > num2){
            System.out.printf("\n o numero %d e maior que %d ", num1, num2);
        }
        else {System.out.printf("\n o numero %d e maior que %d ", num2, num1);}

        scanner.close();
    }
}