import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero entre 0 e 9: ");
        int num1 = scanner.nextInt();
        
        if(num1 == 0 || num1 == 9){
            System.out.printf("Falei ENTRE 0 e 9, entao 0 e 9 num pode");
        } else if(num1 < 0 || num1 > 9){
            System.out.printf("FALEI ENTRE 0 E 9 KCT, SE E BURRO?");
        } else if(num1 == 1){
            System.out.printf("Voce digitou o numero (Um) ");
        } else if(num1 == 2){
            System.out.printf("Voce digitou o numero (Dois) ");
        } else if(num1 == 3){
            System.out.printf("Voce digitou o numero (Tres) ");
        } else if(num1 == 4){
            System.out.printf("Voce digitou o numero (Quatro) ");
        } else if(num1 == 5){
            System.out.printf("Voce digitou o numero (Cinco) ");
        } else if(num1 == 6){
            System.out.printf("Voce digitou o numero (Seis) ");
        } else if(num1 == 7){
            System.out.printf("Voce digitou o numero (Sete) ");
        } else {
            System.out.printf("Voce digitou o numero (Oito) ");
        }
        scanner.close();
    }
}