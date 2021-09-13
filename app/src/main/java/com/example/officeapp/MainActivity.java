package com.example.officeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    Button bshow,bhide;
    Button btoust;
    TextView nextpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview = findViewById(R.id.imageview);
        bshow = findViewById(R.id.bshow);
        bhide = findViewById(R.id.bhide);
        btoust = findViewById(R.id.btoust);
        nextpage = findViewById(R.id.nextpage);



        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(myIntent);
            }
        });



        bshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview.setVisibility(View.VISIBLE);
            }
        });

        bhide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview.setVisibility(View.GONE );
            }
        });


        btoust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"this is alost",Toast.LENGTH_LONG).show();
            }
        });

    }
}