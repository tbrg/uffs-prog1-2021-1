class Triangulo {
    // Atributos
    double base;
    double altura;

    // Metodos
    void incDimensoes(int iB, int iA) {
        base = base + iB;
        altura = altura + iA;
    }

    boolean temDimIguais(Triangulo t) {
        return (base == t.base && altura == t.altura);
    }
}

