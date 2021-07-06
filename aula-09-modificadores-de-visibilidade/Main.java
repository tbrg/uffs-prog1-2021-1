class Main {
    public static void main(String[] args) {
        Evento e = new Evento();

        System.out.println("Titulo do evento: " + e.getTitulo());

        // e.data -> Contem um objeto da classe Data
        System.out.println("Dia do evento: " + e.data.dia);
        System.out.println("Mes do evento: " + e.data.mes);
        // A linha de codigo comentada abaixo nao compila porque o atributo
        // ano da classe Data nao eh acessivel fora da classe Data
        // System.out.println("Ano do evento: " + e.data.ano);
    }
}

