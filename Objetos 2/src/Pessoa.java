public class Pessoa {
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;


    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Falando: " + (this.falando ? "Sim" : "Não"));
        System.out.println("comendo: " + (this.comendo ? "Sim" : "Não"));
    }

    public void falar(){this.falando = true;}
    public void pararFalar(){this.falando = false;}
    public void comer(String alimento){this.comendo = true;}
    public void pararComer(){this.comendo = false;}

}
