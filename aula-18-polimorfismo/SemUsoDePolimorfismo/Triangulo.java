class Triangulo extends Forma {
    // Atributos
    private int base;
    private int altura;

    // Metodos
    public double calculaArea() {
        System.out.println("Executando o metodo calculaArea da classe Triangulo");
        return this.base * this.altura / 2;
    }
}

