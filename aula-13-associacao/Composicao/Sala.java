class Sala {
    // Atributos
    private double capacidade;

    // Relacionamento (Composicao): Um predio tem salas
    private Predio predio;

    // Metodos
    public Sala(double capacidade, Predio predio) {
        this.capacidade = capacidade;
        this.predio = predio;
    }
}

