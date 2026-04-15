class Exemplo {
    public static String par(int num){
        if(num % 2 == 0){
            return "E par sim"; 
        } else {
            return "Ne par nao"; 
        }
    }
    
    public static void main(String[] args) {
        System.out.println(par(2));
    }
}