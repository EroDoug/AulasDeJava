// 1. Liste todos os produtos.
// 2. Liste todos os produtos em ordem crescente de nome.
// 3. Liste todos os produtos em ordem crescente de preço.
// 4. Mostre apenas os produtos com preco maior que 100.
// 5. Busque um produto na lista e apresente uma de 2 mensagens: "O produto foi encontrado!" ou "O
// produto não existe na lista".
// 6. Busque e exclua um produto na lista e apresente uma de 2 mensagens: "O produto foi excluído!" ou
// "O produto não existe na lista".
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
            System.out.println("[5]Mostrar Produtos que custam 100 R$ ou mais");
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

                    s.nextLine();
                case 2:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                    }
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println("Produto " + i);
                        System.out.println("Nome: " + lista.get(i).getNome());
                        System.out.println("Preco: " + lista.get(i).getPreco());
                        System.out.println("Quantidade: " + lista.get(i).getQuantidade());
                        System.out.println();                        
                        }
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
                        System.out.println();                      
                        }
                case 4:
                    boolean teste = false;
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                    } else if (teste) {
                        
                    }
                    
                    
                    else{
                    lista.sort(Comparator.comparing(Produtos::getPreco));
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println("Produto " + i);
                        System.out.println("Nome: " + lista.get(i).getNome());
                        System.out.println("Preco: " + lista.get(i).getPreco());
                        System.out.println("Quantidade: " + lista.get(i).getQuantidade());
                        System.out.println();                      
                        }
                    }
                case 5:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia, sem produtos cadastrados!");
                    }
                    for(int i = 0; i < lista.size(); i++){
                        if (lista.get(i).getPreco()>=100){
                            System.out.println("Produto " + i);
                            System.out.println("Nome: " + lista.get(i).getNome());
                            System.out.println("Preco: " + lista.get(i).getPreco());
                            System.out.println("Quantidade: " + lista.get(i).getQuantidade());
                            System.out.println(); 
                        }
                    }
            }









        }



    }
}
