class Calculadora {
    // Atributos

    // Metodos
    public int contaPositivos(int[] vals) {
        // Se o array de valores (vals) eh null, vamos indicar que aconteceu
        // um erro, pois o argumento recebido eh invalido
        // Para isso, vamos retornar um valor especial, que seja diferente de
        // todos os possiveis valores de retorno do metodo
        // Como o metodo retorna uma quantidade e uma quantidade eh sempre
        // maior ou igual a zero, o valor especial que indica erro pode ser -1
        if (vals == null) {
            return -1;
        }

        int qtdPosit = 0;
        for(int val : vals) {
            if(val > 0) {
                qtdPosit++;
            }
        }

        return qtdPosit;
    }

    public double calculaMedia(int[] vals) {
        // O array de valores (vals) nao pode ser null
        // Se este for o caso, gostariamos de indicar que aconteceu um erro
        // Para isso, gostariamos de usar a mesma abordagem do metodo acima
        // No entanto, como a media pode ser um valor positivo, zero ou um
        // valor negativo, nao temos um valor especial que seja diferente de
        // todos os possiveis valores de retorno deste metodo

        // Se o array de valores (vals) eh null, o que fazer?
        if (vals == null) {
            System.out.println("vals == null: Como indicar que aconteceu um" +
                    " erro e interromper a execucao normal do metodo " +
                    "calculaMedia?");
        }

        int soma = 0;
        for(int val : vals) {
            soma += val;
        }

        return soma / vals.length;
    }
}

