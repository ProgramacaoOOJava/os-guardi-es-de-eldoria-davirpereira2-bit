

public class Main {
    /**
     * args
     */
    public static void main(String[] args) {
        // Criando o heroi1
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        
        // Criando o heroi2 (sem as etiquetas do editor e com o ponto e vírgula no final)
        Personagem heroi2 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);

        // Chamando o método exibirStatus() para cada um, conforme o regulamento
        heroi1.exibirStatus();
        System.out.println(); // Linha em branco apenas para organizar a saída
        heroi2.exibirStatus();
    }
}