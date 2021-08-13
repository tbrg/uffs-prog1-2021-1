class Main {
    public static void main(String[] args) {
        Leao leao = new Leao();
        System.out.println("Leao:");
        leao.emiteSom();
        leao.briga();

        Onca onca = new Onca();
        System.out.println("Onca:");
        onca.emiteSom();
        onca.briga();

        Gato gato = new Gato();
        System.out.println("Gato:");
        gato.emiteSom();
        gato.briga();

        Cachorro cachorro = new Cachorro();
        System.out.println("Cachorro:");
        cachorro.emiteSom();
        cachorro.briga();

        Lobo lobo = new Lobo();
        System.out.println("Lobo:");
        lobo.emiteSom();
        lobo.briga();

        Hipopotamo hipopotamo = new Hipopotamo();
        System.out.println("Hipopotamo:");
        hipopotamo.emiteSom();
        hipopotamo.briga();

        // Nao podemos instanciar um objeto da classe Animal, pois Animal eh
        // uma classe abstrata
        // O codigo a seguir nao compila:
        // Animal animal = new Animal();

        // Nao podemos instanciar um objeto da classe Felino, pois Felino eh
        // uma classe abstrata
        // O codigo a seguir nao compila:
        // Felino felino = new Felino();

        // Nao podemos instanciar um objeto da classe Canino, pois Canino eh
        // uma classe abstrata
        // O codigo a seguir nao compila:
        // Canino canino = new Canino();
    }
}

