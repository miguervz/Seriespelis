package es.studium.listas.ui.peliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import es.studium.listas.R;

public class portadaPeliculas extends AppCompatActivity implements View.OnClickListener{
    ImageView foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caratula_peliculas);
        foto = findViewById(R.id.CaratulasPeliculas);
        foto.setImageResource(FragmentPelis.listaPeliculas.get(FragmentPelis.posicion).getPortadaPelicula());
        foto.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        finish();
    }
}