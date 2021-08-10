class Mapa3D extends Mapa {
    // Atributos
    private int altura;
    private String[][][] celulas;

    // Metodos
    public Mapa3D(int comprimento, int largura, int altura) {
        super(comprimento, largura);

        this.altura = altura;
        this.celulas = new String[comprimento][largura][altura];
    }

    public String getInfo(int x, int y, int z) {
        // Checar se x eh uma coordenada valida
        // Checar se y eh uma coordenada valida
        // Checar se z eh uma coordenada valida

        return this.celulas[x][y][z];
    }

    public void setInfo(String info, int x, int y, int z) {
        // Checar se x eh uma coordenada valida
        // Checar se y eh uma coordenada valida
        // Checar se z eh uma coordenada valida

        this.celulas[x][y][z] = info;
    }

    @Override
    public void imprimeInfos() {
        int maxTamInfo = 0;
        for(String[][] celulasXFixo : this.celulas) {
            for(String[] celulasXYFixos : celulasXFixo) {
                for(String info : celulasXYFixos) {
                    if(info != null) {
                        if(info.length() > maxTamInfo) {
                            maxTamInfo = info.length();
                        }
                    }
                }
            }
        }

        for(int z = 0; z < this.altura; z++) {
            System.out.println("Altura: " + z);

            for(String[][] celulasXFixo : this.celulas) {
                for(String[] celulasXYFixos : celulasXFixo) {
                    String info = celulasXYFixos[z];

                    String infoComEspDir;
                    if(info != null) {
                        infoComEspDir = String.format("%-" + maxTamInfo + "s", info);
                    }
                    else {
                        infoComEspDir = String.format("%-" + maxTamInfo + "s", "");
                    }

                    System.out.print("(" + infoComEspDir + ")");
                }
                System.out.println();
            }
        }
    }
}

