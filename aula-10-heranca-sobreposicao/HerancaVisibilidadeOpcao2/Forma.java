class Forma {
    // Atributos
    protected int x;
    protected int y;

    // Metodos
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        // Checar se o valor eh adequado

        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        // Checar se o valor eh adequado

        this.y = y;
    }

    public void imprimePosicao() {
        System.out.println("Posicao:");
        System.out.println(this.x);
        System.out.println(this.y);
    }
}

