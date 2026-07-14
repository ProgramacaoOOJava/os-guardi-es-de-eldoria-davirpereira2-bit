public class Personagem {  //definindo os atributos
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;


    //Referenciando os atributos

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel ;
        this.pontosDeVida = pontosDeVida ;
        this.poderBase = poderBase ;

    }
     
    // exibirStatus para mostrar todas as informações do personagem

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println( "Nome:" + nome);
        System.out.println("Classe:" + classe);
        System.out.println("Nível:" + nivel);
        System.out.println("Pontos de vida:" + pontosDeVida);
        System.out.println("Poder base:" + poderBase);

        

    }
}

