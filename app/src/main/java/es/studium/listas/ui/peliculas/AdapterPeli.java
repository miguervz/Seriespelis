package es.studium.listas.ui.peliculas;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import es.studium.listas.R;

public class AdapterPeli extends RecyclerView.Adapter<AdapterPeli.ViewHolderPeli>{
    private List<Peliculas> items;
    private static PeliculasInterface peliculasInterface;

    public static class ViewHolderPeli extends RecyclerView.ViewHolder  implements View.OnClickListener{

        public ImageView portadaPelicula;
        public TextView tituloPelicula;
        public TextView directorPelicula;

        public ViewHolderPeli(@NonNull View view){
            super(view);
            portadaPelicula = (ImageView) view.findViewById(R.id.imagenPelicula);
            tituloPelicula = (TextView) view.findViewById(R.id.nombrePelicula);
            directorPelicula = (TextView) view.findViewById(R.id.directorPelicula);
            portadaPelicula.setOnClickListener(this);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            peliculasInterface.onClick(view, getAdapterPosition());
        }
    }
    public AdapterPeli(List<Peliculas> items, PeliculasInterface peliculasInterface){
        this.items =items;
        this.peliculasInterface = peliculasInterface;
    }

    @Override
    public ViewHolderPeli onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.peliculas_card, viewGroup, false);
        return new ViewHolderPeli(v);
    }
    @Override
    public void onBindViewHolder(ViewHolderPeli peliculasViewHolder, int i) {
        peliculasViewHolder.portadaPelicula.setImageResource(items.get(i).getPortadaPelicula());
        peliculasViewHolder.tituloPelicula.setText(items.get(i).getTituloPelicula());
        peliculasViewHolder.directorPelicula.setText(items.get(i).getDirectorPelicula());
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
}

