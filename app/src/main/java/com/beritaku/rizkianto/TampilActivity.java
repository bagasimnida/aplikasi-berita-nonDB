package com.beritaku.rizkianto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TampilActivity extends AppCompatActivity {

    private TextView tvJudul, tvTanggal, tvCaption, tvPenulis, tvIsiBerita;
    private Button btnShare;
    private String linkBerita;
    private ImageView imgBerita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        tvJudul = findViewById(R.id.tv_judul);
        tvTanggal = findViewById(R.id.tv_tanggal);
        tvCaption = findViewById(R.id.tv_caption);
        tvPenulis = findViewById(R.id.tv_penulis);
        tvIsiBerita = findViewById(R.id.tv_isi_berita);
        btnShare = findViewById(R.id.btn_share);
        imgBerita = findViewById(R.id.iv_berita);

        Intent terimaData = getIntent();
        tvJudul.setText(terimaData.getStringExtra("JUDUL"));
        tvTanggal.setText(terimaData.getStringExtra("TANGGAL"));
        tvCaption.setText(terimaData.getStringExtra("CAPTION"));
        tvPenulis.setText(terimaData.getStringExtra("PENULIS"));
        tvIsiBerita.setText(terimaData.getStringExtra("ISI_BERITA"));
        imgBerita.setImageResource(this.getResources().getIdentifier(
                terimaData.getStringExtra("GAMBAR"), "drawable", "com.beritaku.rizkianto"
        ));
        linkBerita = terimaData.getStringExtra("LINK");

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bagikanBerita = new Intent(Intent.ACTION_SEND);
                bagikanBerita.setType("text/plain");
                bagikanBerita.putExtra(Intent.EXTRA_SUBJECT, tvJudul.getText().toString());
                bagikanBerita.putExtra(Intent.EXTRA_TEXT, linkBerita);
                startActivity(Intent.createChooser(bagikanBerita, "Bagikan Berita"));
            }
        });
    }
}
