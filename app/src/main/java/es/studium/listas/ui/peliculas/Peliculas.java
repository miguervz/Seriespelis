package es.studium.listas.ui.peliculas;

import java.io.Serializable;

public class Peliculas implements Serializable {

    private final int portadaPelicula;
    private final String tituloPelicula;
    private final String directorPelicula;
    private String repartoPelicula;
    private final float clasificacionPelicula;
    private String sinopsisPelicula;




    public Peliculas (int portadaPelicula,
                      String tituloPelicula,
                      String directorPelicula,
                      String repartoPelicula,
                      float clasificacionPelicula,
                      String sinopsisPelicula){
        this.portadaPelicula =portadaPelicula;
        this.tituloPelicula =tituloPelicula;
        this.directorPelicula=directorPelicula;
        this.repartoPelicula=repartoPelicula;
        this.clasificacionPelicula=clasificacionPelicula;
        this.sinopsisPelicula=sinopsisPelicula;
    }

    public int getPortadaPelicula() {
        return portadaPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public String getDirectorPelicula() {
        return directorPelicula;
    }

    public String getRepartoPelicula() {
        return repartoPelicula;
    }

    public final float getClasificacionPelicula() {
        return clasificacionPelicula;
    }

    public String getSinopsisPelicula() {
        return sinopsisPelicula;
    }

}
