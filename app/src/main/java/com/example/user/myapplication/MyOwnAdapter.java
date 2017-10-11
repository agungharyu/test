package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 10/5/2017.
 */

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String data1[],data2[];
    Context ctx;
    String data3[];
    int pic[];

    public MyOwnAdapter(Context ct, String s1[], String s2[],String s3[],int image[]){
        ctx = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        pic = image;
    }
    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View myOwnView = myInflator.inflate(R.layout.my_row,parent,false);
        return new MyOwnHolder(myOwnView,ctx);
    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView t1,t2;
        Context ctx;
        public MyOwnHolder(View itemView, Context ctx) {
            super(itemView);
            this.ctx = ctx;
            itemView.setOnClickListener(this);
            t1=(TextView)itemView.findViewById(R.id.text1);
            t2=(TextView)itemView.findViewById(R.id.text2);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Intent intent = new Intent(this.ctx,Recipe.class);
            intent.putExtra("resep",data3[position]);
            intent.putExtra("gambar",pic[position]);
            this.ctx.startActivity(intent);
        }
    }
}
