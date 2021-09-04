class Main {
    public static void main(String[] args) {
        // O metodo calculaMedia de um objeto Calculadora pode lancar uma
        // excecao
        // Esta excecao pode ser de dois tipos: NullPointerException ou
        // IllegalArgumentException
        // Como NullPointerException e IllegalArgumentException sao subclasses
        // da classe RuntimeException, estes são tipos de excecoes
        // nao-verificadas e nao eh obrigatorio estarmos preparados para
        // capturar esta excecao caso ela seja lancada
        // Mesmo assim, optamos por colocar a chamada a este metodo dentro de
        // um comando try / catch

        try{
            Calculadora calculadora = new Calculadora();

            // A seguinte chamada ao metodo calculaMedia gera uma excecao
            // NullPointerException
            int[] vals = null;
            double media = calculadora.calculaMedia(vals);

            System.out.println("Media: " + media);
        }
        catch(NullPointerException e) {
            System.out.println("Executando catch (NullPointerException e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "NullPointerException");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Executando catch (IllegalArgumentException e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "IllegalArgumentException");
        }
        catch(Exception e) {
            System.out.println("Executando catch (Exception e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao que " +
                    "nao eh NullPointerException, nem IllegalArgumentException");
        }

        System.out.println();
        try{
            Calculadora calculadora = new Calculadora();

            // A seguinte chamada ao metodo calculaMedia gera uma excecao
            // IllegalArgumentException
            int[] vals = new int[0];
            double media = calculadora.calculaMedia(vals);

            System.out.println("Media: " + media);
        }
        catch(NullPointerException e) {
            System.out.println("Executando catch (NullPointerException e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "NullPointerException");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Executando catch (IllegalArgumentException e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao " +
                    "IllegalArgumentException");
        }
        catch(Exception e) {
            System.out.println("Executando catch (Exception e):");

            String msg = e.getMessage();
            System.out.println("Excecao: " + msg);
            System.out.println("Stacktrace:");
            e.printStackTrace();

            System.out.println("Realizar acoes para tratar uma excecao que " +
                    "nao eh NullPointerException, nem IllegalArgumentException");
        }
    }
}

