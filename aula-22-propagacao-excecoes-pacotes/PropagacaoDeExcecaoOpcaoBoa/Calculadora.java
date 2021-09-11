import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

class Calculadora {
    // Atributos

    // Metodos
    public double calculaMedia(String arquivoVals) throws FileNotFoundException {
        // O metodo Scanner(File source) -- um construtor da classe
        // Scanner -- pode lancar uma excecao FileNotFoundException
        // No codigo a seguir, chamamos este metodo, mas nao vamos capturar a
        // excecao caso ela seja lancada
        // Em vez disso, vamos deixar que a excecao seja propagada para o
        // metodo anterior (o metodo que chamou calculaMedia)
        // Para isso,
        //   - nao colocamos o codigo a seguir em um comando try / catch e
        //   - escrevemos   throws FileNotFoundException   na declaracao deste
        //   metodo

        File file = new File(arquivoVals);
        Scanner input = new Scanner(file);

        double soma = 0;
        int qtdVals = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();

            soma += Integer.parseInt(line);
            qtdVals++;
        }

        input.close();

        return soma / qtdVals;
    }
}

