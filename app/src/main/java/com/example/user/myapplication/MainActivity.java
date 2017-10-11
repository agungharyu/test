package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[],s3[];
    int image[] = {R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9};
    MyOwnAdapter md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RecyclerView)findViewById(R.id.myRecycler);
        s1 = getResources().getStringArray(R.array.title);
        s2 = getResources().getStringArray(R.array.desc);
        s3 = getResources().getStringArray(R.array.recipe);

        md = new MyOwnAdapter(this,s1,s2,s3,image);
        r1.setAdapter(md);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
