package com.example.asus.dayane_1202154316_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 17/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvData, rvHarga;
    private ArrayList<Integer> gambar;

    public RecyclerViewAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gmbr) {
        rvData = inputData;
        rvHarga = dataHarga;
        gambar = gmbr;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {

        //ditutorial ini kita hanya menggunakan data string dan integer untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitile;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //utk menghubungkan dan mendapatkan context dari main activity
            context = itemView.getContext();
            //melakukan inisiasi textview, imageview dan linearlayout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitile = (TextView) v.findViewById(R.id.tv_subtitle);
            a = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailMakanan.class);
                    String ingredient = "";
                    switch (getAdapterPosition()) {
                        case 0:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "gula,ice,waffle,coklat,stawberry,air";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 1:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "gula,tepung,whipcream,coklat,stawberry,";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 2:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "gula,cream,selai,strawberry,coklat,air";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 3:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "gula,tepung,coklat,madu,strawberry";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 4:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "waffle,gula,ice cream,srawberry,coklat";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 5:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "spagetti,garam,gula,saos bolognise,daging cincang";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 6:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "fettucuni,garam,gula,cream cheese,tuna";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 7:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "keju,garam,gula,saos bolognise,daging cincang";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 8:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "ayam filet,saos bbq,minyak,lada,garam";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 9:
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "daging tenderlin, soas bbq,minyak,lada,garam";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
    }
}
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        //membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_list, parent, false);
        //mengeset ukuran view, margin, padding, dan prametet layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        //mengambil elemen dari dataset (arraylist) padda posisi tertentu
        //mengeset isi view dgn elemen dari dataset tersebut
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer text = gambar.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitile.setText(harga);
        holder.a.setImageResource(text);
    }

    @Override
    public int getItemCount(){
        //menghitung ukuran dataset/ jumlah data yang ditampilkan di recycleview
        return rvData.size();
    }
}
