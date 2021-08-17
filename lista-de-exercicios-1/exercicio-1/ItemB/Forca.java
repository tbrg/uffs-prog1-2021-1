class Forca {
    private int a;
    private int b;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public double tamanho() {
        // TODO Com o objetivo de testar este metodo, eh feito aqui um calculo
        // artificial do tamanho de um forca
        return (a * b);
    }
}

