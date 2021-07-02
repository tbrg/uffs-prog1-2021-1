class Funcionario {
    // Atributos
    String nome;
    double salario;
    /*
    String dataContratacao; // ATENCAO: Forma ruim de representar um data!
    */
    int diaDataContratacao; // ATENCAO: Forma nao tao boa de representar um data!
    int mesDataContratacao;
    int anoDataContratacao;

    // Metodos
    public Funcionario(String nome, double salario, int diaDataContratacao,
            int mesDataContratacao, int anoDataContratacao) {
        this.nome = nome;
        this.salario = salario;
        /*
        this.dataContratacao = dataContratacao;
        */
        this.diaDataContratacao = diaDataContratacao;
        this.mesDataContratacao = mesDataContratacao;
        this.anoDataContratacao = anoDataContratacao;
    }
}

