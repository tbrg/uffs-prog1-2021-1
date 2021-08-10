class Mapa3D {
    // Atributos
    private int comprimento;
    private int largura;
    private int altura;

    // Relacionamento (Agregacao): Um mapa 3D contem mapas (2D)
    private Mapa[] mapas;

    // Metodos
    public Mapa3D(int comprimento, int largura, int altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;

        this.mapas = new Mapa[altura];
        for(int z = 0; z < this.altura; z++) {
            mapas[z] = new Mapa(this.comprimento, this.largura);
        }
    }

    public String getInfo(int x, int y, int z) {
        // Checar se x eh uma coordenada valida
        // Checar se y eh uma coordenada valida
        // Checar se z eh uma coordenada valida

        Mapa mapa = this.mapas[z];
        return mapa.getInfo(x, y);
    }

    public void setInfo(String info, int x, int y, int z) {
        // Checar se x eh uma coordenada valida
        // Checar se y eh uma coordenada valida
        // Checar se z eh uma coordenada valida

        Mapa mapa = this.mapas[z];
        mapa.setInfo(info, x, y);
    }

    public void imprimeInfos() {
        for(int z = 0; z < this.altura; z++) {
            System.out.println("Altura: " + z);
            Mapa mapa = this.mapas[z];
            mapa.imprimeInfos();
        }
    }
}

