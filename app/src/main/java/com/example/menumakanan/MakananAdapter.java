package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {
    public ArrayList<Makanan> listMakanan;

    public MakananAdapter(ArrayList<Makanan> listMakanan) {
        this.listMakanan = listMakanan;
    }

    @NonNull
    @Override
    public MakananAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // memasukan layout ke view holder
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item, parent, false));


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.ViewHolder holder, int position) {
        // mapping komponen
        Makanan makanan = listMakanan.get(position);
        holder.txtNama.setText(makanan.getNama());
        holder.txtHarga.setText(makanan.getHarga());
        holder.imgFoto.setImageResource(makanan.getImgFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(v.getContext(), DetailMakanan.class);

                it.putExtra("nama", makanan.getNama());
                it.putExtra("harga", makanan.getHarga());
                it.putExtra("deskripsi", makanan.getDeskripsi());
                it.putExtra("foto", makanan.getImgFoto());

                v.getContext().startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNama, txtHarga;
        public ImageView imgFoto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.txtNama);
            txtHarga = itemView.findViewById(R.id.txtHarga);
            imgFoto = itemView.findViewById(R.id.imgFoto);

            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.main_layout);
        }
    }
}
