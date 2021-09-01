class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Chamadas dos metodos da calculadora com um argumento valido
        int[] vals = new int[3];
        vals[0]= 9;
        vals[1]= 2;
        vals[2]= -7;

        System.out.println("Valores:");
        System.out.print(vals[0]);
        for(int i = 1; i < vals.length; i++) {
            System.out.print(" " + vals[i]);
        }
        System.out.println();

        int qtdPosit = calculadora.contaPositivos(vals);
        if(qtdPosit >= 0) {
            System.out.println("Quantidade de positivos: " + qtdPosit);
        }
        else {
            System.out.println("Ocorreu um erro no calculo da quantidade de" +
                    " positivos");
        }

        double media = calculadora.calculaMedia(vals);
        System.out.println("Media: " + media);

        // Chamadas dos metodos da calculadora com um argumento invalido (o
        // array de valores eh null)
        vals = null;

        System.out.println("\nO array de valores eh null");

        qtdPosit = calculadora.contaPositivos(vals);
        if(qtdPosit >= 0) {
            System.out.println("Quantidade de positivos: " + qtdPosit);
        }
        else {
            System.out.println("Ocorreu um erro no calculo da quantidade de" +
                    " positivos");
        }

        // ATENCAO: A chamada a seguir gera um erro na execucao do programa
        media = calculadora.calculaMedia(vals);
        System.out.println("Media: " + media);
    }
}

