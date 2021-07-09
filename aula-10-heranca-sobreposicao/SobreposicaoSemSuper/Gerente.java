class Gerente extends Funcionario {
    // Atributos
    private double bonus;

    // Metodos

    // O metodo imprimeRemun herdado da classe Funcionario nao eh adequado
    // para esta classe.
    // O motivo eh que a remuneracao de um gerente nao eh dada apenas pelo
    // salario, mas sim pelo salario adicionado do bonus.
    // O metodo imprimeRemun eh entao redefinido abaixo:

    @Override
    public void imprimeRemun() {
        System.out.println("Remuneracao: " + (this.salario + this.bonus));
    }
}

