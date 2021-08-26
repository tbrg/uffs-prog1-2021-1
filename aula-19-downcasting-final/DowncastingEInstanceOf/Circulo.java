class Circulo extends Forma {
    // Atributos
    private int raio;

    // Metodos
    public double calculaArea() {
        System.out.println("Executando o metodo calculaArea da classe Circulo");
        return 3.1415 * this.raio * this.raio;
    }

    public double calculaCircunferencia() {
        return 2 * 3.1415 * this.raio;
    }
}

