import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        ArrayList<Produtos> lista = new ArrayList<>();

        int opcao = 10;

        while (true) {
            System.out.println("------------menu------------");
            System.out.println("[1]Cadastrar Produto");
            System.out.println("[2]Listar Produtos");
            System.out.println("[3]Listar Nome Ordenado");
            System.out.println("[4]Listar Preco Ordenado");
            System.out.println("[5]Mostrar Produtos que custam mais de 100 R$");
            System.out.println("[6]Buscar Produto");
            System.out.println("[7]Excluir produto");
            System.out.println("[0]Sair");

            opcao = s.nextInt();
            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    s.nextLine();
                    System.out.println("Digite o nome do produto: ");
                    String nome = s.nextLine();

                    System.out.println("Digite o preco da unidade do produto: ");
                    double preco = s.nextDouble();

                    System.out.println("Digite a quantidade de produtos: ");
                    int quantidade = s.nextInt();

                    lista.add(new Produtos(nome, preco, quantidade));
                    break;

                case 2:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                    }
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println("Produto " + i);
                        System.out.println("Nome: " + lista.get(i).getNome());
                        System.out.println("Preco: " + lista.get(i).getPreco());
                        System.out.println("Quantidade: " + lista.get(i).getQuantidade());
                        System.out.println("Valor de estoque: " + lista.get(i).valorTotalEmEstoque());
                        System.out.println();
                    }
                    break;

                case 3:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                    }
                    lista.sort(Comparator.comparing(Produtos::getNome));
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println("Produto " + i);
                        System.out.println("Nome: " + lista.get(i).getNome());
                        System.out.println("Preco: " + lista.get(i).getPreco());
                        System.out.println("Quantidade: " + lista.get(i).getQuantidade());
                        System.out.println("Valor de estoque: " + lista.get(i).valorTotalEmEstoque());
                        System.out.println();
                    }
                    break;

                case 4:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                    }
                    lista.sort(Comparator.comparing(Produtos::getPreco));
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println("Produto " + i);
                        System.out.println("Nome: " + lista.get(i).getNome());
                        System.out.println("Preco: " + lista.get(i).getPreco());
                        System.out.println("Quantidade: " + lista.get(i).getQuantidade());
                        System.out.println("Valor de estoque: " + lista.get(i).valorTotalEmEstoque());
                        System.out.println();
                    }
                    break;

                case 5:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                    }
                    for(int i = 0; i < lista.size(); i++){
                        if (lista.get(i).getPreco() > 100){
                            System.out.println("Produto " + i);
                            System.out.println("Nome: " + lista.get(i).getNome());
                            System.out.println("Preco: " + lista.get(i).getPreco());
                            System.out.println("Quantidade: " + lista.get(i).getQuantidade());
                            System.out.println("Valor de estoque: " + lista.get(i).valorTotalEmEstoque());
                            System.out.println();
                        }
                    }
                    break;

                case 6:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                        break;
                    }

                    s.nextLine();
                    System.out.println("Digite o nome do produto que procura");
                    String procurarItem = s.nextLine();

                    boolean encontrado = false;

                    for(int i = 0; i < lista.size(); i++){
                        if (lista.get(i).getNome().equalsIgnoreCase(procurarItem)){
                            encontrado = true;
                        }
                    }

                    if (encontrado){
                        System.out.println("O produto foi encontrado!");
                    } else {
                        System.out.println("O produto não existe na lista");
                    }
                    break;

                case 7:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                        break;
                    }

                    s.nextLine();
                    System.out.println("Digite o nome do produto que quer remover");
                    String removerItem = s.nextLine();

                    boolean removido = false;

                    for(int i = 0; i < lista.size(); i++){
                        if (lista.get(i).getNome().equalsIgnoreCase(removerItem)){
                            lista.remove(i);
                            removido = true;
                            break;
                        }
                    }

                    if (removido){
                        System.out.println("O produto foi excluído!");
                    } else {
                        System.out.println("O produto não existe na lista");
                    }
                    break;
            }
        }
    }
}