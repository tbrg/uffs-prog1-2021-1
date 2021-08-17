class Boid extends Entidade {
    private int energia;
    private Forca velocidade;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Forca getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Forca velocidade) {
        this.velocidade = velocidade;
    }
}

