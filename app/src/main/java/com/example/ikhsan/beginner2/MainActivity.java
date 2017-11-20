package com.example.ikhsan.beginner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int kuantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){
        displayPrice(kuantity*5);
    }

    private void displayPrice(int harga){
        TextView tv = findViewById(R.id.price_tv);
        tv.setText("$ "+ harga);
    }

    public void increment(View view){
        kuantity = kuantity+1;
        display(kuantity);
    }

    public void decrement(View view){
        kuantity = kuantity-1;
        display(kuantity);
    }

    private void display(int number) {
        TextView kuantityTextView = (TextView) findViewById(R.id.kuantity_text_view);
        kuantityTextView.setText("" + number);
    }
}
