class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();

        System.out.println("t.base: " + t.base);
        System.out.println("t.altura: " + t.altura);

        int m = 2;
        int n = 5;

        t.incDimensoes(m, n);

        System.out.println("t.base: " + t.base);
        System.out.println("t.altura: " + t.altura);

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        System.out.println("t1.base: " + t1.base);
        System.out.println("t1.altura: " + t1.altura);

        System.out.println("t2.base: " + t2.base);
        System.out.println("t2.altura: " + t2.altura);

        t1.base = 2;
        t1.altura = 3;

        t2.base = 9;
        t2.altura = 6;

        System.out.println("t1.base: " + t1.base);
        System.out.println("t1.altura: " + t1.altura);

        System.out.println("t2.base: " + t2.base);
        System.out.println("t2.altura: " + t2.altura);

        System.out.println("t1.temDimIguais(t2): " + t1.temDimIguais(t2));

        t2.base = 2;
        t2.altura = 3;

        System.out.println("t2.base: " + t2.base);
        System.out.println("t2.altura: " + t2.altura);

        System.out.println("t1.temDimIguais(t2): " + t1.temDimIguais(t2));
    }
}

