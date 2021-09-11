import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) {
        try{
            Calculadora calculadora = new Calculadora();

            // A seguinte chamada ao metodo calculaMedia nao gera excecao (o
            // arquivo teste1.txt existe e pode ser aberto)
            double media = calculadora.calculaMedia("teste1.txt");

            System.out.println("Media: " + media);
        }
        catch(FileNotFoundException e) {
            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "FileNotFoundException");
        }
        catch(Exception e) {
            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao que " +
                    "nao eh FileNotFoundException");
        }

        System.out.println();
        try{
            Calculadora calculadora = new Calculadora();

            // A seguinte chamada ao metodo calculaMedia gera excecao (o
            // arquivo teste2.txt nao existe)
            double media = calculadora.calculaMedia("teste2.txt");

            System.out.println("Media: " + media);
        }
        catch(FileNotFoundException e) {
            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "FileNotFoundException");
        }
        catch(Exception e) {
            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao que " +
                    "nao eh FileNotFoundException");
        }
    }
}

