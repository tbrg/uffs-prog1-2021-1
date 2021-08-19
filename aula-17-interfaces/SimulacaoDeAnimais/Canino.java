abstract class Canino extends Animal {
    // Os caninos emitem som de diferentes maneiras (o cachorro late, o lobo
    // uiva, etc.)
    // Por isso, o metodo abstrato emiteSom() herdado da classe Animal nao eh
    // implementado aqui
    // Como consequencia, as subclasses concretas desta classe terao que
    // implementar o metodo emiteSom()

    // Estamos supondo que todos os caninos brigam da mesma maneira
    // Por isso, o metodo abstrato briga() herdado da classe Animal eh
    // implementado aqui
    // Como consequencia, as subclasses concretas desta classe nao precisarao
    // implementar o metodo briga()
    public void briga() {
        System.out.println("Eu brigo usando os dentes");
    }
}

