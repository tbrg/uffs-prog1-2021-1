class Inimigo extends Boid {
    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Inimigo achaAlvoMaisProximo(Inimigo[] i) {
        Posicao posicaoMinha = this.getPosicao();
        Forca velocidadeMinha = this.getVelocidade();

        for(Inimigo inimigo : i) {
            Posicao posicaoInimigo = inimigo.getPosicao();
            Forca velocidadeInimigo = inimigo.getVelocidade();

            if(posicaoMinha.getX() == posicaoInimigo.getX() &&
                    posicaoMinha.getY() == posicaoInimigo.getY() &&
                    velocidadeMinha.getA() == velocidadeInimigo.getA() &&
                    velocidadeMinha.getB() == velocidadeInimigo.getB()) {
                return inimigo;
            }
        }

        return null;
    }
}

