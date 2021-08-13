abstract class Participante {
    // Atributos
    private String nome;

    // Metodos
    public Participante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    // Nao existe o metodo setNome porque nao faz sentido alterar o nome de um
    // participante

    public abstract void imprimeDescricao();
}

