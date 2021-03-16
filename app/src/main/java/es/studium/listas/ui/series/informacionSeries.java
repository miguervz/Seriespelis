package es.studium.listas.ui.series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import es.studium.listas.R;

public class informacionSeries extends AppCompatActivity implements View.OnClickListener{



    TextView director;
    TextView reparto;
    RatingBar clasificacion;
    TextView temporadas;
    TextView sinopsis;
    ImageView fotoPortada;
    TextView titulo;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacionseries);
        initViews();
        initValues();
    }
    private void initViews() {
        clasificacion = findViewById(R.id.calificacion);
        temporadas = findViewById(R.id.nTemporadas);
        sinopsis = findViewById(R.id.sinopsis);
        fotoPortada = findViewById(R.id.portada);
        titulo = findViewById(R.id.titulo);
        director = findViewById(R.id.director);
        reparto = findViewById(R.id.reparto);

    }
    private void initValues(){
        fotoPortada.setImageResource(SeriesFragment.listaSeries.get(SeriesFragment.posicion).getPortadaSerie());
        titulo.setText(SeriesFragment.listaSeries.get(SeriesFragment.posicion).getTituloSerie());
        director.setText(SeriesFragment.listaSeries.get(SeriesFragment.posicion).getDirectorSerie());
        reparto.setText(SeriesFragment.listaSeries.get(SeriesFragment.posicion).getRepartoSerie());
        clasificacion.setRating(SeriesFragment.listaSeries.get(SeriesFragment.posicion).getClasificacionSerie());
        temporadas.setText(SeriesFragment.listaSeries.get(SeriesFragment.posicion).getnTemporadas());
        sinopsis.setText(SeriesFragment.listaSeries.get(SeriesFragment.posicion).getSinopsisSerie());
        button = findViewById(R.id.botonSeries);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}

