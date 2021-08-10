class Main {
    public static void main(String[] args) {
        Mapa m = new Mapa(3, 5);

        m.setInfo("buraco", 0, 3);
        m.setInfo("mina", 1, 0);
        m.setInfo("agua", 2, 4);

        System.out.println("Infos do Mapa:");
        m.imprimeInfos();

        Mapa3D m3D = new Mapa3D(3, 5, 2);

        m3D.setInfo("buraco", 0, 3, 0);
        m3D.setInfo("mina", 1, 0, 1);
        m3D.setInfo("agua", 2, 4, 0);

        System.out.println("\nInfos do Mapa3D:");
        m3D.imprimeInfos();
    }
}

