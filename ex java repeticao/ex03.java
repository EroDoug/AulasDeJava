import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;

        System.out.printf("Digite um numero inteiro: ");
        int num2 = scanner.nextInt();
        
        System.out.printf("______________________________________ \n");
        
        for (int i = 1 ; i < num2 ; i++){
            if (i % 2 == 0){
                System.out.printf(" %d \n", i);
                num++;
            }
        }
        System.out.printf("\n Foi mostrado %d de numeros pares", num);
        scanner.close();
    }
}   