import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1 ; i < 101 ; i++){
            soma += i;
        } System.out.printf("Seu numero e %d", soma);

        scanner.close();
    }
}