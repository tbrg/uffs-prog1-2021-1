abstract class Forma {
    // Atributos
    private int x;
    private int y;

    // Metodos
    public void imprimePosicao() {
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
    }

    public abstract double calculaArea();
}

