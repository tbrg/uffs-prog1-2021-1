class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();

        System.out.println(t.getClass());       // Saida: class Triangulo

        // Vamos considerar que a classe Object define o seguinte metodo:
        // public String getClassName() {
        //     ...
        // }

        System.out.println(t.getClassName());   // Saida esperada: Triangulo
    }
}

