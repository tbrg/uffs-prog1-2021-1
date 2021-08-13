class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Mariana Barbosa",
                "Ciencia da Computacao");
        estudante.imprimeDescricao();

        Funcionario funcionario = new Funcionario("Renato Jose",
                "Analista de Software");
        funcionario.imprimeDescricao();

        // Nao podemos instanciar um objeto da classe Participante, pois
        // Participante eh uma classe abstrata
        // O codigo a seguir nao compila:
        // Participante participante = new Participante("Joao Feijao");
    }
}

