package es.studium.listas.ui.series;

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

public class SeriesFragment extends Fragment implements Serializable {

    RecyclerView SeriesRecyclerView;
    SeriesAdapter AdpterSeries;
    RecyclerView.LayoutManager layoutManager;
    public static List<Series> listaSeries;
    public static int posicion;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_series, container, false);
        listaSeries = new ArrayList();
        cargarlista();
        SeriesRecyclerView =view.findViewById(R.id.seriesRecyclerView);
        layoutManager = new LinearLayoutManager(getContext());
        SeriesRecyclerView.setLayoutManager(layoutManager);
        AdpterSeries = new SeriesAdapter(listaSeries, new SeriesInterface() {
            @Override
            public void onClick(View view, int pos) {
                if  (view.getId()==R.id.imagenSerie){
                    posicion = pos;
                    Intent intent = new Intent(view.getContext(), portadaSerie.class);
                    startActivity(intent);
                }
                else {
                    posicion = pos;
                    Intent intent = new Intent(view.getContext(), informacionSeries.class);
                    startActivity(intent);
                }
            }
        });

        SeriesRecyclerView.setAdapter(AdpterSeries);
        return view;
    }

    public void cargarlista() {
        listaSeries.add(new Series(R.drawable.friends, getString(R.string.nombreSerie1), getString(R.string.directorSerie1),
                getString(R.string.repartoSerie1),3,getString(R.string.temporadasSerie1),getString(R.string.resumenSerie1)));
        listaSeries.add(new Series(R.drawable.lossoprano, getString(R.string.nombreSerie2), getString(R.string.directorSerie2),
                getString(R.string.repartoSerie2),1,getString(R.string.temporadasSerie2),getString(R.string.resumenSerie2)));
        listaSeries.add(new Series(R.drawable.thewire, getString(R.string.nombreSerie3), getString(R.string.directorSerie3),
                getString(R.string.repartoSerie3),5,getString(R.string.temporadasSerie3),getString(R.string.resumenSerie3)));
        listaSeries.add(new Series(R.drawable.hijosanarquia, getString(R.string.nombreSerie4), getString(R.string.directorSerie4),
                getString(R.string.repartoSerie4),5,getString(R.string.temporadasSerie4),getString(R.string.resumenSerie4)));
        listaSeries.add(new Series(R.drawable.shameless, getString(R.string.nombreSerie5), getString(R.string.directorSerie5),
                getString(R.string.repartoSerie5),4,getString(R.string.temporadasSerie5),getString(R.string.resumenSerie5)));
    }
}