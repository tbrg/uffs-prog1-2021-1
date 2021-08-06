public class Predio {
    // Atributos
    private double largura;
    private double altura;
    private double comprimento;

    // Relacionamento (Composicao): Um predio tem salas
    private Sala[] salas;

    // Metodos
    public Predio() {
        // Construcao de um predio com valores-padrao
        this.largura = 20;
        this.altura = 50;
        this.comprimento = 130;

        Sala s1 = new Sala(30, this);
        Sala s2 = new Sala(10, this);

        this.salas = new Sala[2];
        this.salas[0] = s1;
        this.salas[1] = s2;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    // Em geral, nao vai existir o metodo getSalas

    // Em geral, nao vai existir o metodo setSalas
}

