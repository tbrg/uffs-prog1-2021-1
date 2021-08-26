class Quadrado extends Forma {
    // Atributos
    private int lado;

    // Metodos
    public double calculaArea() {
        System.out.println("Executando o metodo calculaArea da classe Quadrado");
        return this.lado * this.lado;
    }
}

