import java.util.*;

class leu_pq_e_viado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando a lista com nomes pré-prontos
        ArrayList<String> alunos = new ArrayList<>(Arrays.asList("Thiago", "Moraes", "Felipe"));
        ArrayList<Integer> idAluno = new ArrayList<>();
        
        int opcao;
        
        while(true){
            System.out.println("=========menu=========");
            System.out.println("[1] - Cadastrar Aluno");
            System.out.println("[2] - Listar Alunos");
            System.out.println("[3] - Buscar Alunos");
            System.out.println("[4] - Remover Aluno");
            System.out.println("[5] - Salir\n"); 
            
            System.out.println("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            
            if(opcao == 5){
                System.out.println("Cabo");
                break;
            }
            
            switch(opcao){
                case 1:
                    System.out.print("Digite o nome do cabloco: ");
                    alunos.add(scanner.next());
                    System.out.println("Aluno adicionado com sucsses!");
                break;

                case 2:
                    if(alunos.isEmpty()){
                        System.out.println("Nenhum aluno searched");
                    } else{
                        Collections.sort(alunos);
                        for(int i = 0; i < alunos.size(); i++){
                            System.out.printf("%d - %s\n", i + 1, alunos.get(i));
                        }
                    }
                break;

                case 3:
                    if(alunos.isEmpty()){
                        System.out.println("Nenhum aluno searched");
                    } else {
                        System.out.printf("Qual mascaco voce procura? ");
                        String nomeAluno = scanner.next();
                        if(alunos.contains(nomeAluno)){
                            System.out.printf("O macaco is here!\n");
                        } else{
                            System.out.printf("O macaco is not here!\n");
                        }
                    }
                break;
                case 4: 
                    if(alunos.isEmpty()){
                        System.out.println("Nenhum aluno searched");
                    } else {
                        System.out.printf("Qual mascaco voce procura? ");
                        String nomeAluno = scanner.next();
                        if(alunos.contains(nomeAluno)){
                            System.out.printf("Macaco foi de ralo!\n");
                            alunos.remove(nomeAluno);
                        } else{
                            System.out.printf("Voce errou o nome do macaco, macaco!\n");
                        }
                    }
                break;

                default: 
                    System.out.println("ah tem essa opcao nao viado");
            }
        }
        
        scanner.close();
    }
}