class Main {
    public static void main(String[] args) {
        Pessoa h = new Pessoa();
        Pessoa z = new Pessoa();

        h.idade = 5;
        z.idade = 70;

        System.out.println("h.idade: " + h.idade);
        System.out.println("z.idade: " + z.idade);

        h = z;

        System.out.println("h.idade: " + h.idade);
        System.out.println("z.idade: " + z.idade);
    }
}

