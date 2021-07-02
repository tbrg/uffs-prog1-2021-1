// Programa que nao respeita o encapsulamento
// Possivel problema: Uma alteracao na representacao dos dados da classe
//                    Funcionario pode fazer com que varios trechos do
//                    restante do codigo da aplicacao precisem ser alterados

class Main {
    public static void main(String[] args) {
        // O codigo abaixo nao funciona mais por causa da mudanca feita na
        // classe Funcionario
        // O codigo abaixo teria que ser alterado para acessar a data de
        // contratacao de um funcionario de acordo com a sua nova
        // representacao

        Funcionario f1 = new Funcionario("Alan Turyng", 2000.00, "10/01/2021");

        System.out.println("Funcionario 1:");
        System.out.println("Nome: " + f1.nome);
        System.out.println("Salario: " + f1.salario);
        System.out.println("Data de contratacao: " + f1.dataContratacao);

        f1.nome = "Alan Turing";
        System.out.println("Nome: " + f1.nome);

        f1.salario = 3000;
        System.out.println("Salario: " + f1.salario);

        f1.dataContratacao = "19/01/2021";
        System.out.println("Data da contratacao: " + f1.dataContratacao);

        Funcionario f2 = new Funcionario("Ada Lovelace", 2200.00, "14/03/2021");

        System.out.println("\nFuncionario 2:");
        System.out.println("Nome: " + f2.nome);
        System.out.println("Salario: " + f2.salario);
        System.out.println("Data de contratacao: " + f2.dataContratacao);

        f2.dataContratacao = "14/04/2021";
        System.out.println("Data da contratacao: " + f2.dataContratacao);
    }
}

