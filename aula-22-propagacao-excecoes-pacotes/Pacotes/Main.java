import geometria.retas.Retangulo;
import geometria.retas.Triangulo;
import geometria.curvas.*;

class Main {
    public static void main(String[] args) {
        // A classe Main esta no mesmo pacote das classes ClasseUm e
        // ClasseDois
        // Estas classes estao no pacote unnamed (pacote sem nome)
        // Para usar as classes ClasseUm e ClasseDois, a classe Main nao
        // precisa de nomenclaturas especiais, nem de importacoes
        // Exemplos:

        ClasseUm objClasseUm = new ClasseUm();
        System.out.println("objClasseUm.getClass(): " +
                objClasseUm.getClass());

        ClasseDois objClasseDois = new ClasseDois();
        System.out.println("objClasseDois.getClass(): " +
                objClasseDois.getClass());

        // A classe Main nao esta no mesmo pacote das classes Forma, Quadrado,
        // Retangulo, Triangulo, Circulo e Elipse
        // Estas classes estao nos seguintes pacotes:
        //   - Main: pacote unnamed (pacote sem nome)
        //   - Forma: pacote geometria
        //   - Quadrado, Retangulo e Triangulo: pacote geometria.retas
        //   - Circulo e Elipse: pacote geometria.curvas
        // Para usar as demais classes, a classe Main tem as seguintes opcoes:

        // Opcao 1 - Usar o nome qualificado da classe (fully qualified name),
        // que eh dado por
        //   <nome do pacote>.<nome da classe>
        // Exemplos:

        geometria.Forma forma = new geometria.Forma();
        System.out.println("forma.getClass(): " + forma.getClass());

        geometria.retas.Quadrado quadrado = new geometria.retas.Quadrado();
        System.out.println("quadrado.getClass(): " + quadrado.getClass());

        // Opcao 2 - Usar apenas o nome da classe apos importar uma classe
        // especifica de um pacote escrevendo
        //   import <nome do pacote>.<nome da classe>;
        // no inicio do arquivo
        // (Se no inicio de um arquivo existir uma linha
        //   package <nome do pacote>;
        // so podem existir comentarios antes desta linha)
        // Exemplos:

        // No inicio do arquivo:
        // import geometria.retas.Retangulo;
        Retangulo retangulo = new Retangulo();
        System.out.println("retangulo.getClass(): " + retangulo.getClass());

        // No inicio do arquivo:
        // import geometria.retas.Triangulo;
        Triangulo triangulo = new Triangulo();
        System.out.println("triangulo.getClass(): " + triangulo.getClass());

        // Opcao 3 - Usar apenas o nome da classe apos importar todas as
        // classes de um pacote escrevendo
        //   import <nome do pacote>.*;
        // no inicio do arquivo
        // (Se no inicio de um arquivo existir uma linha
        //   package <nome do pacote>;
        // so podem existir comentarios antes desta linha)
        // Exemplos:

        // No inicio do arquivo:
        // import geometria.curvas.*;
        Circulo circulo = new Circulo();
        System.out.println("circulo.getClass(): " + circulo.getClass());

        Elipse elipse = new Elipse();
        System.out.println("elipse.getClass(): " + elipse.getClass());
    }
}

