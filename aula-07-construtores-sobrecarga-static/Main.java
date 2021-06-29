class Main {
    public static void main (String[] args) {
        // Uso da classe Funcionario antes da implementacao do construtor
        /*
        Funcionario f = new Funcionario();

        f.id = 5;
        f.nome = "Aldo Jose";
        */

        Funcionario f1 = new Funcionario(5, "Aldo Jose");

        System.out.println("id: " + f1.id);
        System.out.println("nome: " + f1.nome);
        Funcionario.imprimeNumFunc();

        Funcionario f2 = new Funcionario(8, "Ada Lovelace");

        System.out.println("id: " + f2.id);
        System.out.println("nome: " + f2.nome);
        Funcionario.imprimeNumFunc();

        Retangulo r;
        r = new Retangulo(2, 5);

        System.out.println("base: " + r.base);
        System.out.println("altura: " + r.altura);
    }
}

