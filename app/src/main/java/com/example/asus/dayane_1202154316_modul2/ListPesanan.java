package com.example.asus.dayane_1202154316_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //daftar menu makanan
    private String[] Judul = {"Ice Cream", "Cupcake", "Macaron", "Pancake", "Waffle", "Spagetthi", "Fettucini", "Lasagna", "Chicken Grill", "Beef Steak"};
    private String[] test = {"Rp. 20.000", "Rp. 25.000", "Rp. 15.000", "Rp. 40.000", "Rp. 35.000", "Rp. 45.000", "Rp. 45.000", "Rp. 60.000", "Rp. 70.000", "Rp. 90.000"};
    private int[] Gambar = {R.drawable.icecream, R.drawable.cupcake, R.drawable.macaron, R.drawable.pancake, R.drawable.waffle, R.drawable.spagetthi, R.drawable.fettucini, R.drawable.lasagna, R.drawable.chickengrill, R.drawable.beefsteak};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);

        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);

        }

        private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }

    }
}
