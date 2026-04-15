class Exemplo {
    public static float multiplicar(float num, float num2){
        return num * num2;
    }
    
    public static int multiplicar(float num, float num2, float num3){
        return num * num2 * num3;
    }
    
    public static void main(String[] args) {
        System.out.printf(multiplicar("%.2f"5, 79));
        System.out.printf(multiplicar("%.2f"5, 79, 88)); 
    //pode ser 2 ou 3 numeros, o código identifica a função correta
    }
}