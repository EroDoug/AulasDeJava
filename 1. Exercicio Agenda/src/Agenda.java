import java.util.ArrayList;
import java.util.Scanner;
 
class Agenda {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
 
        int opcao;
 
        while (true) {
 
            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine(); /* Limpar buffer */
            
            if (opcao == 5) {
                break;
            }
 
            switch (opcao) {
 
                case 1:
                    adicionarContato(scanner, lista);
                    break;
                case 2:
                     while(true) {
                        menuEditar();
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        
                        if(opcao == 3){
                             break;
                        }
                                
                        switch (opcao) {

                            case 1:
                                editarTelefone(scanner, lista);
                                break;
                            case 2:
                                editarEmail(scanner, lista);
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    }
 
                   break;
 
                case 3:
                    excluirContato(scanner, lista);
                    break;
                case 4:
                    listarContatos(lista);
                    break;
 
                 default:
                    System.out.println("Opcao invalida!");
            }
 
            System.out.println();
        }
 
        scanner.close();
    }
    
    public static void menuPrincipal(){
        System.out.println("======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }
 
    public static void menuEditar(){
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }
    
    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista){
    
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
 
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();
 
        lista.add(new Contato(nome, telefone, email));
 
        System.out.println("Contato adicionado!");
    }
    
    public static void listarContatos(ArrayList<Contato> lista){
        
        if(lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        }
        
        System.out.printf("\n%-20s | %-10s\n | %-30s\n", "Nome", "Telefone", "email");
        
        for(int i = 0; i < lista.size(); i++){
            System.out.printf("%-20s | %-10s\n | %-30s\n",
                lista.get(i).getNome(), lista.get(i).getTelefone(), lista.get(i).getEmail());
        }
    }

    public static void editarTelefone(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        } else{

            System.out.println("Digite o nome do contato que deseja editar o telefone");
            String editarContato = scanner.nextLine();

            for(int i = 0; i < lista.size(); i++){
                if (lista.get(i).getNome().equalsIgnoreCase(editarContato)){
                    System.out.println("=====Contato Encontrado=====");
                    System.out.println("Nome: " + lista.get(i).getNome());
                    System.out.println("E-mail: " + lista.get(i).getEmail());
                    System.out.println("Telefone: " + lista.get(i).getTelefone());
                    System.out.println("=============================");
                    System.out.println("Qual o novo telefone? ");
                    String tel = scanner.nextLine();
                    lista.get(i).setTelefone(tel);
                    System.out.println("=====Contato Atualizado=====");
                    System.out.println("Nome: " + lista.get(i).getNome());
                    System.out.println("E-mail: " + lista.get(i).getEmail());
                    System.out.println("Telefone: " + lista.get(i).getTelefone());
                }
            }
        }
    }
    public static void editarEmail(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        } else{

            System.out.println("Digite o nome do contato que deseja editar o E-mail");
            String editarContato = scanner.nextLine();

            for(int i = 0; i < lista.size(); i++){
                if (lista.get(i).getNome().equalsIgnoreCase(editarContato)){
                    System.out.println("=====Contato Encontrado=====");
                    System.out.println("Nome: " + lista.get(i).getNome());
                    System.out.println("E-mail: " + lista.get(i).getEmail());
                    System.out.println("Telefone: " + lista.get(i).getTelefone());
                    System.out.println("=============================");
                    System.out.println("Qual o novo E-mail? ");
                    String newEmail = scanner.nextLine();
                    lista.get(i).setTelefone(newEmail);
                    System.out.println("=====Contato Atualizado=====");
                    System.out.println("Nome: " + lista.get(i).getNome());
                    System.out.println("E-mail: " + lista.get(i).getEmail());
                    System.out.println("Telefone: " + lista.get(i).getTelefone());
                }
            }
        }
    }

    public static void excluirContato(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        } else{

            System.out.println("Digite o nome do contato que deseja editar o E-mail");
            String editarContato = scanner.nextLine();

            for(int i = 0; i < lista.size(); i++){
                if (lista.get(i).getNome().equalsIgnoreCase(editarContato)){
                    System.out.println("=====Contato Encontrado=====");
                    System.out.println("Nome: " + lista.get(i).getNome());
                    System.out.println("E-mail: " + lista.get(i).getEmail());
                    System.out.println("Telefone: " + lista.get(i).getTelefone());
                    System.out.println("=============================");
                    System.out.println("Voce realmente deseja excluir esse contato? ");
                    System.out.println("[0] Sim");
                    System.out.println("[1] Não");
                    int opcao = scanner.nextInt();
                    switch (opcao) {
                        case 0:
                            lista.remove(i);
                            break;
                        case 1:
                            break;
                        default: 
                            System.out.println("Não existe essa opcao!");
                    }
                    
                }
            }
        }
    }
}