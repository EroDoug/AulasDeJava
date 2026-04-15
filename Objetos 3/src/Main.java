public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2500.0, 10);
 
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Valor total: " + p1.valorTotalEmEstoque());
 
        p1.adicionarEstoque(5);
        p1.removerEstoque(3);
 
        System.out.println("Quantidade atual: " + p1.getQuantidade());
    }
}