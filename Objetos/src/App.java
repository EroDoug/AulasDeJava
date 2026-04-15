public class App {
    public static void main(String[] args) throws Exception {

        ContaBancaria c1 = new ContaBancaria();
        c1.saldo = 0;
        c1.titular = "Douglas";
        c1.depositar();
        c1.sacar();
        c1.sacar();



    }

}
