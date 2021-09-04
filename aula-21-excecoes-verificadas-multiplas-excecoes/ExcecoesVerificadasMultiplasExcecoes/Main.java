class Main {
    public static void main(String[] args) {
        // O metodo calculaMedia de um objeto Calculadora pode lancar uma
        // excecao
        // Esta excecao pode ser de dois tipos: ExcecaoArrayNull ou
        // ExcecaoArrayTamanhoZero
        // Como ExcecaoArrayNull e ExcecaoArrayTamanhoZero sao subclasses da
        // classe Exception, estes são tipos de excecoes verificadas e temos
        // que estar preparados para capturar esta excecao caso ela seja
        // lancada
        // Para isso, colocamos a chamada a este metodo dentro de um comando
        // try / catch

        try{
            Calculadora calculadora = new Calculadora();

            // A seguinte chamada ao metodo calculaMedia gera uma excecao
            // ExcecaoArrayNull
            int[] vals = null;
            double media = calculadora.calculaMedia(vals);

            System.out.println("Media: " + media);
        }
        catch(ExcecaoArrayNull e) {
            System.out.println("Executando catch (ExcecaoArrayNull e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "ExcecaoArrayNull");
        }
        catch(ExcecaoArrayTamanhoZero e) {
            System.out.println("Executando catch (ExcecaoArrayTamanhoZero e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "ExcecaoArrayTamanhoZero");
        }
        catch(Exception e) {
            System.out.println("Executando catch (Exception e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao que " +
                    "nao eh ExcecaoArrayNull, nem ExcecaoArrayTamanhoZero");
        }

        System.out.println();
        try{
            Calculadora calculadora = new Calculadora();

            // A seguinte chamada ao metodo calculaMedia gera uma excecao
            // ExcecaoArrayTamanhoZero
            int[] vals = new int[0];
            double media = calculadora.calculaMedia(vals);

            System.out.println("Media: " + media);
        }
        catch(ExcecaoArrayNull e) {
            System.out.println("Executando catch (ExcecaoArrayNull e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "ExcecaoArrayNull");
        }
        catch(ExcecaoArrayTamanhoZero e) {
            System.out.println("Executando catch (ExcecaoArrayTamanhoZero e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "ExcecaoArrayTamanhoZero");
        }
        catch(Exception e) {
            System.out.println("Executando catch (Exception e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao que " +
                    "nao eh ExcecaoArrayNull, nem ExcecaoArrayTamanhoZero");
        }
    }
}

