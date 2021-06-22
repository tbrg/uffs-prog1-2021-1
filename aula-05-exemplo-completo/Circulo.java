class Circulo {
    // Atributos
    double raio;

    // Metodos
    double calculaArea() {
        // Dentro de um metodo, podemos acessar os atributos
        double area;
        area = 3.1416 * raio * raio;
        return area;
    }

    void imprimeArea() { // Este metodo nao estava na modelagem inicial
        // Dentro de um metodo, tambem podemos acessar os outros metodos
        System.out.println("Area: " + calculaArea());
    }
}

