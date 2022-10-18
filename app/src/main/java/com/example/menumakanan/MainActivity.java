package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        rec_Makanan.setAdapter(new MakananAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Ramen", "45K", "Ramen adalah hidangan sup yang telah berkembang menjadi sangat populer dan dianggap sebagai buah bibir untuk makanan Jepang. Awalnya, sup dibuat dari tulang ayam, tapi dalam beberapa tahun terakhir, daging babi, daging sapi, dan makanan laut juga digunakan dalam sup ini sehingga menciptakan beragam selera. Selain rasa garam, kecap dan miso yang khas, Anda bahkan dapat menemukan kari ramen rasa sekarang. Ada juga jenis ramen mie dan sup disajikan secara terpisah, yang dikenal sebagai tsukemen.", R.drawable.ramen));
        listMakanan.add(new Makanan("Udon", "35K", "Mirip dengan soba, hanya saja ukurannya lebih besar. Jika berlibur ke Jepang di musim dingin, mengapa tidak mencoba rebusan mie lezat, yang dikenal sebagai nabe yaki udon?", R.drawable.udon));
        listMakanan.add(new Makanan("Gyudon", "55k", "Hidangan berupa semangguk nasi yang diatasnya diberi daging sapi, ayam, atau babi (dimasak apa saja). Gyudon menjadi sangat terkenal, tak hanya di Jepang, Anda juga bisa menikmatinya di berbagai negera di dunia. Di beberapa restoran, mereka menambahkan telur kocok sebagai tambahan topping.", R.drawable.gyudon));
        listMakanan.add(new Makanan("Chankonabe", "57K", "Bisa dikatakan makanan sehat karena semua jenis makanan, baik daging ataupun sayuran dimasak jadi satu dalam sebuah wadah besar. Menu ini adalah sajian khusu untuk para atlet Sumo.", R.drawable.chankonabe));
        listMakanan.add(new Makanan("Sushi", "27K", "Sushi adalah masakan menggabungkan cuka beras dan makanan laut (meskipun kadang-kadang bahan-bahan lain juga digunakan). Ada jenis sushi fermentasi, yang dikenal sebagai nare-sushi, tapi jenis yang paling khas sushi yang nigirizushi dan temakizushi. Ada banyak bahan lain yang tersedia bagi Anda yang tidak suka ikan mentah, termasuk udang rebus dan belut panggang. Anda dapat menemukan sushi di seluruh Jepang,", R.drawable.sushi));
        listMakanan.add(new Makanan("Sukiyaki", "59k", "Sukiyaki adalah hidangan daging dan sayuran yang direbus dalam panci besi.  Dinikmati dengan kuah yang dikenal dengan nama warishita, terbuat dari kecap dan gula. Ada banyak variasi dalam bahan dan cara makan hidangan tergantung daerahnya. Beberapa daerah menambahkan telur kocok ke dalam kuahnya untuk membuat rasa lebih ringan. Jika Anda mencari untuk menikmati banyak daging sapi yang besar, ini adalah hidangan untuk Anda!", R.drawable.sukiyaki));
        listMakanan.add(new Makanan("Katsu Curry", "40k", "Banyak orang tahunya kari adalah makanan yang berasal dari India, ternyata Jepang juga punya loh! Kari yang berasal dari Jepang sangat unik, dibuat dari daging dan sayuran (wortel, kentang, bawang, dan lain-lain) dibumbui dengan bubuk kari, direbus, dan disajikan dengan nasi.", R.drawable.katsu_curry));
    }
}