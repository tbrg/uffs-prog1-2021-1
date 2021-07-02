class Funcionario {
    // Atributos
    private String nome;
    private double salario;
    /*
    private String dataContratacao; // ATENCAO: Forma ruim de representar um data!
    */
    private int diaDataContratacao; // ATENCAO: Forma nao tao boa de representar um data!
    private int mesDataContratacao;
    private int anoDataContratacao;

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
        /* Codigo antes da alteracao do atributo dataContratacao:

        return this.dataContratacao;
        */

        String dataContratacao = String.format("%02d/%02d/%04d",
                this.diaDataContratacao, this.mesDataContratacao,
                this.anoDataContratacao);

        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        /* Codigo antes da alteracao do atributo dataContratacao:

        // Checar se e uma data de contratacao valida e apropriada

        this.dataContratacao = dataContratacao;
        */

        String[] partesDataContratacao = dataContratacao.split("/");

        int dia = Integer.parseInt(partesDataContratacao[0]);
        int mes = Integer.parseInt(partesDataContratacao[1]);
        int ano = Integer.parseInt(partesDataContratacao[2]);

        if ((dia < 1) || (dia > 31)) { // Se dia < 1 ou dia > 31
            System.out.println("Alteracao nao realizada: dia de contratacao invalido!");
            return;
        }

        if ((mes < 1) || (mes > 12)) { // Se mes < 1 ou mes > 12
            System.out.println("Alteracao nao realizada: mes de contratacao invalido!");
            return;
        }

        if ((ano < 1990) || (mes > 2021)) { // Se ano < 1990 (supondo que a
                                            // empresa foi fundada em 1990) ou
                                            // ano > 2021
            System.out.println("Alteracao nao realizada: ano de contratacao invalido!");
            return;
        }

        this.diaDataContratacao = dia;
        this.mesDataContratacao = mes;
        this.anoDataContratacao = ano;
    }
}

