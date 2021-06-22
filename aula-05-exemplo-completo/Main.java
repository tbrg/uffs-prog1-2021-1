import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Aqui sao dados os passos iniciais do nosso programa

        Scanner sc = new Scanner(System.in);

        // Declaracao de uma variavel de referencia
        // tipo_da_variavel nome_da_variavel;
        Circulo circ1;

        // Criacao de um objeto e atribuicao do objeto a variavel
        circ1 = new Circulo();

        System.out.print("Digite o raio do circulo: ");
        double r = sc.nextDouble();

        // Acesso a um atributo de um objeto
        // nome_da_variavel.nome_do_atributo
        circ1.raio = r;

        // Invocacao de um metodo de um objeto
        // nome_da_variavel.nome_do_metodo(parametros_do_metodo)
        double a = circ1.calculaArea();
        System.out.println("Area: " + a);

        Circulo circ2 = new Circulo();

        System.out.print("Digite o raio do circulo: ");
        circ2.raio = sc.nextDouble();

        circ2.imprimeArea();

        Triangulo tri;
        tri = new Triangulo();

        System.out.print("Digite a base do triangulo: ");
        tri.base = sc.nextDouble();

        System.out.print("Digite a altura do triangulo: ");
        tri.altura = sc.nextDouble();

        System.out.println("Area: " + tri.calculaArea());
    }
}

