package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    ImageView detailFoto;
    TextView detailNama, detailHarga, detailDesc;
    String namaMakanan, deskripsi, harga;
    int foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        detailNama = findViewById(R.id.detailNama);
        detailDesc = findViewById(R.id.detailDesc);
        detailHarga = findViewById(R.id.detailHarga);
        detailFoto = findViewById(R.id.detailFoto);

        Bundle bundle =  getIntent().getExtras();
        foto = bundle.getInt(String.valueOf("foto"));
        detailFoto.setImageResource(foto);

        getInputExtra();
    }

    private void getInputExtra() {

        namaMakanan = getIntent().getStringExtra("nama");
        deskripsi = getIntent().getStringExtra("deskripsi");
        harga = getIntent().getStringExtra("harga");

        setDataActivity(namaMakanan, deskripsi, harga);
    }

    private void setDataActivity(String namaMakanan, String deskripsi, String harga){
        detailNama.setText(namaMakanan);
        detailDesc.setText(deskripsi);
        detailHarga.setText(harga);

    }
}