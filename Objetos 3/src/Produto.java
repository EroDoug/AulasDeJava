public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //_____________________________________________________________________//
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    //_____________________________________________________________________//
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("O preço nao pode ser negativo, otario!");
        } else
            {
            this.preco = preco;
        }
        
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            System.out.println("A quantidade nao pode ser negativa, otario!");
        } else
            {
            this.quantidade = quantidade;
        }
    }
    
    public double valorTotalEmEstoque(){
        return this.preco * this.quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidade -= quantidade;
    }









}
