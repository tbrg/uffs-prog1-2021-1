class Main {
    public static void testaCarro(Roda[] rodas) {
        Carro c = new Carro("Ford", "Prata", rodas);

        c.acelera();
    }

    public static void main(String[] args) {
        Roda[] rodas = new Roda[4];
        rodas[0] = new Roda(14);
        rodas[1] = new Roda(14);
        rodas[2] = new Roda(14);
        rodas[3] = new Roda(14);

        testaCarro(rodas);
        // Quando acabar a execucao deste metodo, o carro sera destruido

        // Aqui o carro nao existe mais
        // Mas as rodas do carro ainda existem
    }
}

