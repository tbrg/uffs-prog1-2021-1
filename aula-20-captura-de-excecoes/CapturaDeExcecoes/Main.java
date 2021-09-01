import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // O metodo Scanner(File source) -- um construtor da classe
        // Scanner -- pode lancar uma excecao
        // A declaracao deste metodo na classe Scanner eh a seguinte:
        //
        // public Scanner(File source) throws FileNotFoundException {
        //     ...
        // }
        //
        // Usamos este metodo para acessar o conteudo de um arquivo
        // O metodo lanca uma excecao caso o arquivo nao possa ser aberto
        // Para usar este metodo, temos que estar preparados para capturar
        // esta excecao caso ela seja lancada
        // Para isso, colocamos a chamada a este metodo dentro de um comando
        // try / catch

        try {
            File file = new File("teste1.txt");

            // A seguinte chamada ao metodo Scanner(File source) nao gera
            // excecao (o arquivo teste1.txt existe e pode ser aberto)
            Scanner input = new Scanner(file);

            System.out.println("Conteudo do arquivo teste1.txt:");
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();
        }
        catch (Exception e) {
            System.out.println("Nao foi possivel abrir o arquivo teste1.txt");
        }

        System.out.println();
        try {
            File file = new File("teste2.txt");

            // A seguinte chamada ao metodo Scanner(File source) gera excecao
            // (o arquivo teste2.txt nao existe)
            Scanner input = new Scanner(file);

            System.out.println("Conteudo do arquivo teste2.txt:");
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();
        }
        catch (Exception e) {
            System.out.println("Nao foi possivel abrir o arquivo teste2.txt");
        }
    }
}

