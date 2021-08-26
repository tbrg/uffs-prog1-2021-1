class Triangulo extends Forma {
    // Atributos
    private int base;
    private int altura;

    // Metodos
    public double calculaArea() {
        System.out.println("Executando o metodo calculaArea da classe Triangulo");
        return this.base * this.altura / 2;
    }

    // Vamos considerar que um objeto Triangulo herda da classe Object o
    // seguinte metodo:
    // public String getClassName() {
    //     ...
    // }

    // O metodo a seguir sobrescreve o metodo getClassName herdado da classe
    // Object
    public String getClassName() {
        return "Quadrado"; // Implementacao absurda!
    }

    // Por questoes de seguranca, para impedir que o metodo getClassName possa
    // ser sobrescrito, este metodo poderia ser declarado como final na classe
    // Object:
    // public final String getClassName() {
    //     ...
    // }

    // Pelo motivo ilustrado acima, nao eh permitido sobrescrever o metodo
    // getClass herdado da classe Object
    // O codigo a seguir nao compila
    // public Class<?> getClass() {
    //     // ...
    // }
}

