package es.studium.listas.ui.series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import es.studium.listas.R;

public class portadaSerie extends AppCompatActivity implements View.OnClickListener{
    ImageView portada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada_serie);
        portada = findViewById(R.id.portadaSerieç);
        portada.setImageResource(SeriesFragment.listaSeries.get(SeriesFragment.posicion).getPortadaSerie());
        portada.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}