package com.example.ikhsan.beginner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Increment_btn(View v){
        jumlah = ++jumlah;
        update(jumlah);
    }

    public void Decrement_btn(View v){
        jumlah = --jumlah;
        update(jumlah);
    }

    private void update(int j) {
        TextView tv = findViewById(R.id.jumlah_tv);
        tv.setText(""+ j);
    }

    public void Pesan_btn (View v){
        TextView tv = findViewById(R.id.harga_tv);
        tv.setText("$ "+ jumlah*5);
    }
}
