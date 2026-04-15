import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite quantidade de copias: ");
        double num1 = scanner.nextDouble();
        
        if (num1 > 99){
            System.out.printf("O valor a ser pago e: %.2f", num1 = num1 * 0.2);
        } else if(num1 >= 0){
            System.out.printf("O valor a ser pago e: %.2f", num1 = num1 * 0.25);
        }else {
            System.out.printf("Negativo num da ne prc");
        }
        scanner.close();
    }
}