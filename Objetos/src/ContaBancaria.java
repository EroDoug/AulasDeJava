import java.util.*;

public class ContaBancaria {
    Scanner sc = new Scanner(System.in);
    String titular;
    float saldo;


    public void sacar (){


        System.out.println("Quanto voce vai sacar?");
        float sacar = sc.nextFloat(); 

        if (sacar > saldo) {
            System.out.println("Voce não pode sacar um valor maior do que tem em conta, seu saldo atual e: " + this.saldo);
        } 
        else {
            System.out.println("Voce sacou R$" + sacar + "Seu saldo atual e " + this.saldo);
        }
    }

    public void depositar (){

        System.out.println("Quanto voce quer depositar? ");
        float deposit = sc.nextFloat();

        saldo += deposit;

        System.out.println("Voce depositou " + deposit);

    }
}
