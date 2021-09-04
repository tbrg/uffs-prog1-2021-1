class Calculadora {
    // Atributos

    // Metodos

    // O metodo a seguir pode lancar uma excecao
    // Esta excecao pode ser de dois tipos: NullPointerException ou
    // IllegalArgumentException
    // Como NullPointerException e IllegalArgumentException sao subclasses da
    // classe RuntimeException, estes são tipos de excecoes nao-verificadas e
    // nao eh obrigatorio escrever
    //
    // throws NullPointerException, IllegalArgumentException
    //
    // na declaracao do metodo
    public double calculaMedia(int[] vals) {
        if (vals == null) {
            NullPointerException e = new NullPointerException("O array de " +
                    "valores eh null");
            throw e;
        }

        if (vals.length == 0) {
            throw new IllegalArgumentException("O array de valores tem " +
                    "tamanho zero");
        }

        int soma = 0;
        for(int val : vals) {
            soma += val;
        }

        return soma / vals.length;
    }
}

