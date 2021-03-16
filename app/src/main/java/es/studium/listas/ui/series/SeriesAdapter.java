package es.studium.listas.ui.series;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import es.studium.listas.R;

public class SeriesAdapter extends RecyclerView.Adapter<es.studium.listas.ui.series.SeriesAdapter.SeriesViewHolder>{
    private List<Series> items;
    private static SeriesInterface seriesInterface;
    public static class SeriesViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{

        public ImageView portadaSerie;
        public TextView tituloSerie;
        public TextView directorSerie;
        public TextView temporadasSerie;
        public SeriesViewHolder(@NonNull View view){
            super(view);
            portadaSerie = (ImageView) view.findViewById(R.id.imagenSerie);
            tituloSerie = (TextView) view.findViewById(R.id.nombreSerie);
            directorSerie = (TextView) view.findViewById(R.id.directorSerie);
            temporadasSerie = (TextView) view.findViewById(R.id.nTemporadas);
            portadaSerie.setOnClickListener(this);
            view.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            seriesInterface.onClick(view, getAdapterPosition());
        }
    }
    public SeriesAdapter(List<Series> items, SeriesInterface seriesInterface){
        this.items =items;
        this.seriesInterface = seriesInterface;
    }
    @Override
    public es.studium.listas.ui.series.SeriesAdapter.SeriesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.series_card, viewGroup, false);
        return new es.studium.listas.ui.series.SeriesAdapter.SeriesViewHolder(v);
    }
    @Override
    public void onBindViewHolder(es.studium.listas.ui.series.SeriesAdapter.SeriesViewHolder seriesViewHolder, int i) {
        seriesViewHolder.portadaSerie.setImageResource(items.get(i).getPortadaSerie());
        seriesViewHolder.tituloSerie.setText(items.get(i).getTituloSerie());
        seriesViewHolder.directorSerie.setText(items.get(i).getDirectorSerie());
        seriesViewHolder.temporadasSerie.setText(items.get(i).getnTemporadas());
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
}