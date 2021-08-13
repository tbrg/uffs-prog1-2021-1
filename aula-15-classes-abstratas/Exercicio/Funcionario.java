class Funcionario extends Participante {
    // Atributos
    private String cargo;

    // Metodos
    public Funcionario(String nome, String cargo) {
        super(nome);

        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void imprimeDescricao() {
        System.out.println(getNome() + ", funcionario que ocupa o cargo " + this.cargo);
    }
}

