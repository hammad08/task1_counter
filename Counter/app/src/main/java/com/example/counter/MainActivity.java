package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter=0;
    TextView counter_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter_value = (TextView) findViewById(R.id.counterValue);
        counter_value.setText(Integer.toString( counter ));
    }

    public void btn_increment_click(View view) {
        counter++;
        counter_value.setText(Integer.toString( counter ));
    }

    public void btn_decrement_click(View view) {
        counter--;
        counter_value.setText(Integer.toString( counter ));
    }

    public void btn_reset_click(View view) {
        counter=0;
        counter_value.setText(Integer.toString( counter ));
    }
}