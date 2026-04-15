import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        Collections.addAll(nomes, "Carlos", "Bruno", "Ana", "Fernando", "Diego");
        nomes.add(4, "Helena");
        
        System.out.println(nomes);
        nomes.add(0, "Gustavo");
        
        if(nomes.contains("Fernando")){
            System.out.println("Tem a porra do Fernando!");
        } 

        if(nomes.contains("Ana")){
        nomes.remove("Ana");
            }
        System.out.println(nomes);
        
        Collections.sort(nomes);
        
        System.out.println(nomes);
        
        nomes.clear();
        
        System.out.println(nomes);
        
        scanner.close();
    }
}