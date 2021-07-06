class Evento {
    // Atributos
    private String titulo;
    Data data;

    // Metodos
    public Evento() {
        this.titulo = "Sem titulo";

        // Constroi um objeto da classe Data e armazena no atributo data
        this.data = new Data();
    }

    // Metodo getter para o atributo privado titulo
    // Objetivo: permitir um codigo externo a classe Evento acessar o valor
    //           do atributo privado titulo
    public String getTitulo() {
        return this.titulo;
    }

    // Metodo setter para o atributo privado titulo
    // Objetivo: permitir um codigo externo a classe Evento alterar o valor do
    //           atributo privado titulo
    public void setTitulo(String titulo) {
        // Checar se o valor recebido eh um valor adequado

        this.titulo = titulo;
    }
}

