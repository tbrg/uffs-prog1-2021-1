class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        Circulo[] circulos = new Circulo[4];
        circulos[0] = new Circulo();
        circulos[1] = new Circulo();
        circulos[2] = new Circulo();
        circulos[3] = new Circulo();

        System.out.println("Formas:");

        q1.imprimePosicao();
        System.out.println("area: " + q1.calculaArea());
        System.out.println();

        q2.imprimePosicao();
        System.out.println("area: " + q2.calculaArea());
        System.out.println();

        q3.imprimePosicao();
        System.out.println("area: " + q3.calculaArea());
        System.out.println();

        t1.imprimePosicao();
        System.out.println("area: " + t1.calculaArea());
        System.out.println();

        t2.imprimePosicao();
        System.out.println("area: " + t2.calculaArea());
        System.out.println();

        for(int i = 0; i < circulos.length; i++) {
            circulos[i].imprimePosicao();
            System.out.println("area: " + circulos[i].calculaArea());
            System.out.println();
        }
    }
}

