class Funcionario {
    // Atributos
    int id;                 // id = 0
    String nome;            // nome = null
    static int numFunc = 0;

    // Metodos
    public Funcionario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        numFunc++;
    }

    static void imprimeNumFunc() {
        System.out.println("numFunc: " + numFunc);
    }
}

