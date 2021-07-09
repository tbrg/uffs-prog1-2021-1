class Gerente extends Funcionario {
    // Atributos
    private double bonus;

    // Metodos

    // O metodo getRemun herdado da classe Funcionario nao eh adequado para
    // esta classe.
    // O motivo eh que a remuneracao de um gerente nao eh dada apenas pelo
    // salario, mas sim pelo salario adicionado do bonus.
    // O metodo getRemun eh entao redefinido abaixo:

    @Override
    public double getRemun() {
        // Remuneracao de um gerente: salario + bonus

        // Este metodo redefine o metodo getRemun herdado da classe
        // Funcionario.
        // Por consequencia, se escrevermos getRemun() em um código desta
        // classe, estaremos chamando este proprio metodo.
        // Na linha de codigo abaixo, queremos acessar o metodo getRemun
        // herdado da classe Funcionario.
        // Para isso, podemos escrever super.getRemun(), como a seguir:

        return super.getRemun() + this.bonus;

        // A linha de codigo a seguir seria uma implementacao errada deste
        // metodo (aconteceriam sucessivas chamadas a este proprio metodo):

        // return getRemun() + this.bonus;
    }
}

