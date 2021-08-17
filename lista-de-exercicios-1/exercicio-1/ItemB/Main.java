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

        // Testes do metodo achaAlvoMaisProximo da classe Inimigo

        Inimigo inimigo;

        System.out.println();

        // Teste 1 do metodo achaAlvoMaisProximo da classe Inimigo

        inimigo = inimigos[0].achaAlvoMaisProximo(inimigos);

        System.out.println("inimigos[0].achaAlvoMaisProximo:");
        System.out.println("getPosicao().getX():" +
                inimigo.getPosicao().getX());
        System.out.println("getPosicao().getY():" +
                inimigo.getPosicao().getY());
        System.out.println("getEnergia():" + inimigo.getEnergia());
        System.out.println("getVelocidade().tamanho():" +
                inimigo.getVelocidade().tamanho());

        // Teste 2 do metodo achaAlvoMaisProximo da classe Inimigo

        inimigo = inimigos[2].achaAlvoMaisProximo(inimigos);

        System.out.println("inimigos[2].achaAlvoMaisProximo:");
        System.out.println("getPosicao().getX():" +
                inimigo.getPosicao().getX());
        System.out.println("getPosicao().getY():" +
                inimigo.getPosicao().getY());
        System.out.println("getEnergia():" + inimigo.getEnergia());
        System.out.println("getVelocidade().tamanho():" +
                inimigo.getVelocidade().tamanho());

        // Teste 3 do metodo achaAlvoMaisProximo da classe Inimigo

        inimigo = inimigos[7].achaAlvoMaisProximo(inimigos);

        System.out.println("inimigos[7].achaAlvoMaisProximo:");
        System.out.println("getPosicao().getX():" +
                inimigo.getPosicao().getX());
        System.out.println("getPosicao().getY():" +
                inimigo.getPosicao().getY());
        System.out.println("getEnergia():" + inimigo.getEnergia());
        System.out.println("getVelocidade().tamanho():" +
                inimigo.getVelocidade().tamanho());

        // Teste 4 do metodo achaAlvoMaisProximo da classe Inimigo

        Inimigo inimigoValsMenos1 = new Inimigo();

        Posicao posicao = new Posicao();
        posicao.setX(-1);
        posicao.setY(-1);

        Forca velocidade = new Forca();
        velocidade.setA(-1);
        velocidade.setB(-1);

        inimigoValsMenos1.setPosicao(posicao);
        inimigoValsMenos1.setEnergia(-1);
        inimigoValsMenos1.setVelocidade(velocidade);

        inimigo = inimigoValsMenos1.achaAlvoMaisProximo(inimigos);

        System.out.println("inimigoValsMenos1.achaAlvoMaisProximo:");
        if(inimigo != null) {
            System.out.println("getPosicao().getX():" +
                    inimigo.getPosicao().getX());
            System.out.println("getPosicao().getY():" +
                    inimigo.getPosicao().getY());
            System.out.println("getEnergia():" + inimigo.getEnergia());
            System.out.println("getVelocidade().tamanho():" +
                    inimigo.getVelocidade().tamanho());
        }
        else {
            System.out.println("Nenhum inimigo encontrado!");
        }
    }
}

