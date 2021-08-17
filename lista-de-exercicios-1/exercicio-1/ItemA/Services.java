class Services {
    public static int contaPossiveisCandidatos(Inimigo[] i) {
        int cont = 0;
        for(Inimigo inimigo : i) {
            Posicao posicao = inimigo.getPosicao();
            int energia = inimigo.getEnergia();
            Forca velocidade = inimigo.getVelocidade();

            if((posicao.getX() > 100 || posicao.getY() > 100) &&
                    energia <= 50 && velocidade.tamanho() == 200) {
                cont++;
            }
        }

        return cont;
    }
}

