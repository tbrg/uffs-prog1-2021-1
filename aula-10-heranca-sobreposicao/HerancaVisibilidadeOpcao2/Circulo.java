class Circulo extends Forma {
    // Atributos
    private int raio;

    // Metodos
    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        // Checar se o valor eh adequado

        this.raio = raio;
    }

    public void imprimePontoMaisADir() {
        System.out.println("Ponto mais a direita do circulo:");

        // Um objeto da classe Circulo possui os atributos x e y, que sao
        // herdados da classe Forma.
        // Como estes atributos sao declarados como protegidos (protected) na
        // classe Forma, eles podem ser acessados por codigos de subclasses da
        // classe Forma, como a classe Circulo.
        // Por consequencia, podemos acessar os atributos x e y como nas
        // linhas a seguir:

        System.out.println(this.x + raio);
        System.out.println(this.y);
    }
}

