// Programa que nao respeita o encapsulamento
// Possivel problema: Podem ser atribuidos valores invalidos ou inapropriados
//                    aos atributos de um objeto da classe Funcionario

class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Alan Turing", 2000.00, "10/01/2021");

        System.out.println("Funcionario 1:");
        System.out.println("Nome: " + f1.nome);
        System.out.println("Salario: " + f1.salario);
        System.out.println("Data de contratacao: " + f1.dataContratacao);

        // Atribui um valor invalido ou inapropriado ao nome do funcionario
        f1.nome = "";
        System.out.println("Nome: " + f1.nome);

        // Atribui um valor invalido ou inapropriado ao salario do funcionario
        f1.salario = -10;
        System.out.println("Salario: " + f1.salario);

        // Atribui um valor invalido ou inapropriado a data de contratacao do
        // funcionario
        f1.dataContratacao = "45/22/3333";
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

