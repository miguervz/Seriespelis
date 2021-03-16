package es.studium.listas.ui.peliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import es.studium.listas.R;

public class informacionPeliculas extends AppCompatActivity implements View.OnClickListener {
    TextView titulo;
    ImageView foto;
    TextView director;
    TextView reparto;
    RatingBar clasificacion;
    TextView sinopsis;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacionpeliculas);
        initViews();
        initValues();
    }
    private void initViews() {
        foto = findViewById(R.id.portada);
        titulo = findViewById(R.id.titulo);
        director = findViewById(R.id.director);
        reparto = findViewById(R.id.reparto);
        clasificacion = findViewById(R.id.calificacion);
        sinopsis = findViewById(R.id.sinopsis);
    }
    private void initValues(){
        titulo.setText(FragmentPelis.listaPeliculas.get(FragmentPelis.posicion).getTituloPelicula());
        director.setText(FragmentPelis.listaPeliculas.get(FragmentPelis.posicion).getDirectorPelicula());
        reparto.setText(FragmentPelis.listaPeliculas.get(FragmentPelis.posicion).getRepartoPelicula());
        clasificacion.setRating(FragmentPelis.listaPeliculas.get(FragmentPelis.posicion).getClasificacionPelicula());
        sinopsis.setText(FragmentPelis.listaPeliculas.get(FragmentPelis.posicion).getSinopsisPelicula());
        button1 = findViewById(R.id.botonPeliculas);
        foto.setImageResource(FragmentPelis.listaPeliculas.get(FragmentPelis.posicion).getPortadaPelicula());
        button1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        finish();
    }
}