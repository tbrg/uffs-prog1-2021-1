class Main {
    public static void main(String[] args) {
        Inimigo[] inimigos = new Inimigo[10];

        for(int i = 0; i < inimigos.length; i++) {
            Inimigo inimigo = new Inimigo();

            Posicao posicao = new Posicao();
            posicao.setX(i * 100);
            posicao.setY(i * 200);

            Forca velocidade = new Forca();
            velocidade.setA(10);
            velocidade.setB(20);

            inimigo.setPosicao(posicao);
            inimigo.setEnergia(i * 15);
            inimigo.setVelocidade(velocidade);

            System.out.println("Inimigo " + i + ":");
            System.out.println("getPosicao().getX():" +
                    inimigo.getPosicao().getX());
            System.out.println("getPosicao().getY():" +
                    inimigo.getPosicao().getY());
            System.out.println("getEnergia():" + inimigo.getEnergia());
            System.out.println("getVelocidade().tamanho():" +
                    inimigo.getVelocidade().tamanho());

            inimigos[i] = inimigo;
        }

        System.out.println();
        System.out.println("Services.contaPossiveisCandidatos: " +
                Services.contaPossiveisCandidatos(inimigos));
    }
}

