import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

class Calculadora {
    // Atributos

    // Metodos
    public double calculaMedia(String arquivoVals) throws FileNotFoundException {
        try {
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
        catch(FileNotFoundException e) {
            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            // Neste try / catch, estamos capturando uma excecao
            // FileNotFoundException que foi lancada pelo metodo
            // Scanner(File source) -- um construtor da classe Scanner
            // O que devemos fazer nesta situacao?
            // A opcao mais razoavel eh lancar uma excecao para informar que a
            // excecao que capturamos aqui aconteceu
            // Para isso, podemos lancar novamente a propria excecao:
            throw e;

            // A abordagem acima nao eh muito util
            // Na verdade, o mais adequado seria tratar a excecao nao neste
            // metodo, mas sim no metodo anterior (o metodo que chamou
            // calculaMedia)
            // Para isso, poderiamos, em vez de capturar a excecao, deixar que
            // ela fosse propagada para o metodo anterior
        }
    }
}

