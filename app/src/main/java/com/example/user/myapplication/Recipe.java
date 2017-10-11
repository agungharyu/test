package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Recipe extends AppCompatActivity {

    ImageView img;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_layout);
        img = (ImageView)findViewById(R.id.pic);
        txt = (TextView)findViewById(R.id.recipeText);
        img.setImageResource(getIntent().getIntExtra("gambar",00));
        txt.setText(getIntent().getStringExtra("resep"));
    }
}
