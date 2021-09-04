class Calculadora {
    // Atributos

    // Metodos

    // O metodo a seguir pode lancar uma excecao
    // Esta excecao pode ser de dois tipos: ExcecaoArrayNull ou
    // ExcecaoArrayTamanhoZero
    // Como ExcecaoArrayNull e ExcecaoArrayTamanhoZero sao subclasses da
    // classe Exception, estes são tipos de excecoes verificadas e temos que
    // escrever
    //
    // throws ExcecaoArrayNull, ExcecaoArrayTamanhoZero
    //
    // na declaracao do metodo
    public double calculaMedia(int[] vals) throws ExcecaoArrayNull, ExcecaoArrayTamanhoZero {
        if (vals == null) {
            ExcecaoArrayNull e = new ExcecaoArrayNull("O array de valores " +
                    "eh null");
            throw e;
        }

        if (vals.length == 0) {
            throw new ExcecaoArrayTamanhoZero("O array de valores tem " +
                    "tamanho zero");
        }

        int soma = 0;
        for(int val : vals) {
            soma += val;
        }

        return soma / vals.length;
    }
}

