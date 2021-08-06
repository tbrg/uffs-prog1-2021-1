class Main {
    public static void testaPredio() {
        Predio p = new Predio();

        System.out.println("Largura do predio: " + p.getLargura());
        System.out.println("Altura do predio: " + p.getAltura());
        System.out.println("Comprimento do predio: " + p.getComprimento());
    }

    public static void main(String[] args) {
        testaPredio();
        // Quando acabar a execucao deste metodo, o predio sera destruido

        // Aqui o predio nao existe mais
        // As salas do predio foram destruidas juntamente com o predio
    }
}

