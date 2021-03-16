package es.studium.listas.ui.series;

class Series {
    private final int portadaSerie;
    private final String tituloSerie;
    private String directorSerie;
    private String repartoSerie;
    private final float clasificacionSerie;
    private String nTemporadas;
    private String sinopsisSerie;
    public Series (int portadaSerie,
                   String tituloSerie,
                   String directorSerie
            , String repartoSerie,
                   float clasificacionSerie,
                   String temporadasSerie,
                   String sinopsisSerie){
        this.portadaSerie =portadaSerie;
        this.tituloSerie =tituloSerie;
        this.directorSerie=directorSerie;
        this.repartoSerie=repartoSerie;
        this.clasificacionSerie=clasificacionSerie;
        this.nTemporadas =temporadasSerie;
        this.sinopsisSerie=sinopsisSerie;
    }
    public int getPortadaSerie() {
        return portadaSerie;
    }
    public String getTituloSerie() {
        return tituloSerie;
    }
    public String getDirectorSerie() {
        return directorSerie;
    }
    public String getRepartoSerie() {
        return repartoSerie;
    }
    public final float getClasificacionSerie() {
        return clasificacionSerie;
    }
    public String getnTemporadas() {
        return nTemporadas;
    }
    public String getSinopsisSerie() {
        return sinopsisSerie;
    }
}
