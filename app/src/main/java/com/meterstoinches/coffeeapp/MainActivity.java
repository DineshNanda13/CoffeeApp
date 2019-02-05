package com.meterstoinches.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    Button add,minus,order;
    TextView counter,price;
    int quantity=0;
    double TotalPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.incrementbtnID);
        minus = (Button) findViewById(R.id.decrementbtnID);
        order = (Button) findViewById(R.id.orderbtnID);

        counter = (TextView) findViewById(R.id.counterbtnID);
        price = (TextView) findViewById(R.id.priceTotalID);
    }
    public void plusMethod(View view) {
        quantity=quantity+1;
        counter.setText(""+quantity);
    }

    public void minusMethod(View view) {
        quantity=quantity-1;
        counter.setText(""+quantity);
    }

    public void orderMethod(View view) {
        TotalPrice = Double.parseDouble(counter.getText().toString());
        TotalPrice=TotalPrice*5;
        price.setText(NumberFormat.getCurrencyInstance().format(TotalPrice));
    }
}
