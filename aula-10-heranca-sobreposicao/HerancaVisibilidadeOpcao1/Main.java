class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo();

        c.setRaio(7);
        c.setX(10);
        c.setY(3);

        System.out.println("c.raio: " + c.getRaio());
        System.out.println("c.x: " + c.getX());
        System.out.println("c.y: " + c.getY());

        c.imprimePosicao();

        c.imprimePontoMaisADir();
    }
}

