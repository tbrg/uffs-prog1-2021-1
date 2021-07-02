class Funcionario {
    // Atributos
    private String nome;
    private double salario;
    private String dataContratacao; // ATENCAO: Forma ruim de representar um data!

    // Metodos
    public Funcionario(String nome, double salario, String dataContratacao) {
        setNome(nome);
        setSalario(salario);
        setDataContratacao(dataContratacao);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.equals("")) { // nome igual a ""
            System.out.println("Alteracao nao realizada: nome vazio!");
            return;
        }

        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            System.out.println("Alteracao nao realizada: salario nulo ou negativo!");
            return;
        }

        if (salario < 1100) {
            System.out.println("Alteracao nao realizada: salario inferior ao minimo legal!");
            return;
        }

        this.salario = salario;
    }

    public String getDataContratacao() {
        return this.dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        // Checar se e uma data de contratacao valida e apropriada

        this.dataContratacao = dataContratacao;
    }
}

