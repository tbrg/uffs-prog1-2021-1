class Cachorro {
    // Atributos
    private String raca;
    private int freqLatido;

    // Relacionamento (Associacao): Pessoa eh dona de zero ou mais cachorros
    private Pessoa dono;

    // Metodos
    void late() {
        System.out.println("Au au!");
    }
}

