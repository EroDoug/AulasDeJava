import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();
        
        if (num1 % 2 == 0 && num1 % 7 == 0){
            System.out.printf("Seu numero e divisivel por 2 e por 7, congratulations!");
        } else if(num1 % 7 == 0) {
            System.out.printf("Seu numero e divisivel por 7");
        } else if(num1 % 2 == 0) {
            System.out.printf("Seu numero e divisivel por 2");
        }else {
            System.out.printf("Seu numero nao e divisivel nem por 2 nem por 7 ti vira!");
        }
        scanner.close();
    }
}