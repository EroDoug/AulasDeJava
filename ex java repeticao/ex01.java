import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1 ; i < 11 ; i++){
            System.out.printf("Seu numero e %d \n", i);
        }

        scanner.close();
    }
}