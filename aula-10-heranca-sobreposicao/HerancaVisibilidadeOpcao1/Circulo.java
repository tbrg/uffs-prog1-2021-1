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
        // No entanto, como estes atributos sao declarados como privados
        // (private) na classe Forma, eles so podem ser acessados por codigos
        // de dentro da classe Forma.
        // Por consequencia, nao podem ser acessados por codigos de dentro da
        // classe Circulo.
        // Como resultado, nao podemos acessar os atributos x e y como nas
        // linhas a seguir:

        // System.out.println(this.x + raio);
        // System.out.println(this.y);

        // Temos que acessar os atributos x e y atraves dos metodos getters
        // and setters:

        System.out.println(this.getX() + raio);
        System.out.println(this.getY());
    }
}

