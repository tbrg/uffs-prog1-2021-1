class Funcionario {
    // Atributos
    String nome;
    double salario;
    String dataContratacao; // ATENCAO: Forma ruim de representar um data!

    // Metodos
    public Funcionario(String nome, double salario, String dataContratacao) {
        this.nome = nome;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
    }
}

