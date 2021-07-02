// Programa que respeita o encapsulamento
// Problema resolvido: Não podem ser atribuidos valores invalidos ou
//                     inapropriados aos atributos de um objeto da classe
//                     Funcionario

class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Alan Turing", 2000.00, "10/01/2021");

        System.out.println("Funcionario 1:");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario: " + f1.getSalario());
        System.out.println("Data de contratacao: " + f1.getDataContratacao());

        // Tenta atribuir um valor invalido ou inapropriado ao nome do funcionario
        f1.setNome("");
        System.out.println("Nome: " + f1.getNome());

        // Tenta atribui um valor invalido ou inapropriado ao salario do funcionario
        f1.setSalario(-10);
        System.out.println("Salario: " + f1.getSalario());

        f1.setDataContratacao("19/01/2021");
        System.out.println("Data da contratacao: " + f1.getDataContratacao());

        Funcionario f2 = new Funcionario("Ada Lovelace", 2200.00, "14/03/2021");

        System.out.println("\nFuncionario 2:");
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Salario: " + f2.getSalario());
        System.out.println("Data de contratacao: " + f2.getDataContratacao());

        f2.setDataContratacao("14/04/2021");
        System.out.println("Data da contratacao: " + f2.getDataContratacao());
    }
}

