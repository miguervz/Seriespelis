package es.studium.listas.ui.peliculas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import es.studium.listas.R;

public class FragmentPelis extends Fragment implements Serializable {
    RecyclerView PelisRecyclerView;
    AdapterPeli AdapterPelis;
    RecyclerView.LayoutManager layoutManager;

    public static List<Peliculas> listaPeliculas;
    public static int posicion;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_peliculas, container, false);

        listaPeliculas = new ArrayList();
        cargarlista();
        PelisRecyclerView =view.findViewById(R.id.peliculasRecyclerView);

        layoutManager = new LinearLayoutManager(getContext());
        PelisRecyclerView.setLayoutManager(layoutManager);
        AdapterPelis = new AdapterPeli(listaPeliculas, new PeliculasInterface() {
            @Override
            public void onClick(View view, int pos) {
                if  (view.getId()==R.id.imagenPelicula){
                    posicion = pos;
                    Intent intent2 = new Intent(view.getContext(), portadaPeliculas.class);
                    startActivity(intent2);
                }
                else {
                    posicion = pos;
                        Intent intent2 = new Intent(view.getContext(), informacionPeliculas.class);
                        startActivity(intent2);
                }
            }
        });

        PelisRecyclerView.setAdapter(AdapterPelis);
        return view;
    }
    public void cargarlista() {
        listaPeliculas.add(new Peliculas(R.drawable.avatar, getString(R.string.nombrePelicula1),getString(R.string.directorPelicula1)
                , getString(R.string.repartoPelicula1),1,getString(R.string.resumenPelicula1)));
        listaPeliculas.add(new Peliculas(R.drawable.edla, getString(R.string.nombrePelicula2),getString(R.string.directorPelicula2)
                , getString(R.string.repartoPelicula2),1,getString(R.string.resumenPelicula2)));
        listaPeliculas.add(new Peliculas(R.drawable.jurassicpark, getString(R.string.nombrePelicula3),getString(R.string.directorPelicula3)
                , getString(R.string.repartoPelicula3),5,getString(R.string.resumenPelicula3)));
        listaPeliculas.add(new Peliculas(R.drawable.regresofuturo, getString(R.string.nombrePelicula4),getString(R.string.directorPelicula4)
                , getString(R.string.repartoPelicula4),3,getString(R.string.resumenPelicula4)));
        listaPeliculas.add(new Peliculas(R.drawable.infiltrados, getString(R.string.nombrePelicula5),getString(R.string.directorPelicula5)
                ,  getString(R.string.repartoPelicula5),2,getString(R.string.resumenPelicula5)));
    }
}