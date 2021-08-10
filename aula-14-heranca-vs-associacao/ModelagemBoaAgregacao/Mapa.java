class Mapa {
    // Atributos
    private int comprimento;
    private int largura;
    private String[][] celulas;

    // Metodos
    public Mapa(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.celulas = new String[comprimento][largura];
    }

    public String getInfo(int x, int y) {
        // Checar se x eh uma coordenada valida
        // Checar se y eh uma coordenada valida

        return this.celulas[x][y];
    }

    public void setInfo(String info, int x, int y) {
        // Checar se x eh uma coordenada valida
        // Checar se y eh uma coordenada valida

        this.celulas[x][y] = info;
    }

    public void imprimeInfos() {
        int maxTamInfo = 0;
        for(String[] linha : this.celulas) {
            for(String info : linha) {
                if(info != null) {
                    if(info.length() > maxTamInfo) {
                        maxTamInfo = info.length();
                    }
                }
            }
        }

        for(String[] linha : this.celulas) {
            for(String info : linha) {
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

