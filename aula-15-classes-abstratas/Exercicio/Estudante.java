class Estudante extends Participante {
    // Atributos
    private String curso;

    // Metodos
    public Estudante(String nome, String curso) {
        super(nome);

        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void imprimeDescricao() {
        System.out.println(getNome() + ", estudante do curso " + this.curso);
    }
}

