class Carro {
    // Atributos
    private String marca;
    private String cor;

    // Relacionamento (Agregacao): Um carro tem rodas
    private Roda[] rodas;

    // Metodos
    public Carro(String marca, String cor, Roda[] rodas) {
        this.marca = marca;
        this.cor = cor;
        this.rodas = rodas;
    }

    public void acelera() {
        System.out.println("Vrummmmm!");
    }
}

