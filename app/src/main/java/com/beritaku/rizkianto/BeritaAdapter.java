package com.beritaku.rizkianto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder> {
    private ArrayList<Berita> dataBerita;
    private Context context;
    private SimpleDateFormat sdFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");

    public BeritaAdapter(ArrayList<Berita> dataBerita, Context context) {
        this.dataBerita = dataBerita;
        this.context = context;
    }

    @NonNull
    @Override
    public BeritaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_berita, parent, false);
        return new BeritaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeritaViewHolder holder, int position) {
        Berita tempBerita = dataBerita.get(position);
        holder.tvJudul.setText(tempBerita.getJudulBerita());
        holder.tglBerita = sdFormat.format(tempBerita.getTglBerita());
        holder.gambar = tempBerita.getGambar();
        holder.caption = tempBerita.getCaption();
        holder.penulis = "Penulis: " + tempBerita.getPenulis();
        holder.tvHeadLine.setText(tempBerita.getIsiBerita());
        holder.linkBerita = tempBerita.getLinkBerita();
        holder.imgBerita.setImageResource(context.getResources().getIdentifier(
                holder.gambar, "drawable", "com.beritaku.rizkianto"
        ));
    }

    @Override
    public int getItemCount() {
        return dataBerita.size();
    }

    public class BeritaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView imgBerita;
        private TextView tvJudul, tvHeadLine;
        private String tglBerita, caption, penulis, gambar, linkBerita;

        public BeritaViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBerita = itemView.findViewById(R.id.iv_berita);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvHeadLine = itemView.findViewById(R.id.tv_headline);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent bukaBerita = new Intent(context, TampilActivity.class);
            String judul, isiBerita;
            judul = tvJudul.getText().toString();
            isiBerita = tvHeadLine.getText().toString();
            bukaBerita.putExtra("JUDUL", judul);
            bukaBerita.putExtra("TANGGAL", tglBerita);
            bukaBerita.putExtra("GAMBAR", gambar);
            bukaBerita.putExtra("CAPTION", caption);
            bukaBerita.putExtra("PENULIS", penulis);
            bukaBerita.putExtra("ISI_BERITA", isiBerita);
            bukaBerita.putExtra("LINK", linkBerita);
            context.startActivity(bukaBerita);
        }
    }
}
