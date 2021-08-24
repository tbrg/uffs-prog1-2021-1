class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[9];

        formas[0] = new Quadrado();
        formas[1] = new Quadrado();
        formas[2] = new Quadrado();

        formas[3] = new Triangulo();
        formas[4] = new Triangulo();

        formas[5] = new Circulo();
        formas[6] = new Circulo();
        formas[7] = new Circulo();
        formas[8] = new Circulo();

        System.out.println("Formas:");
        for(int i = 0; i < formas.length; i++) {
            formas[i].imprimePosicao();
            System.out.println("area: " + formas[i].calculaArea());
            System.out.println();
        }
    }
}

