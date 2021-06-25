class Main {
    public static void main(String[] args) {
        int a = 1;

        String s1 = "palavra_" + a;
        String s2 = "palavra_" + a;

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}

