package com.example.rufat.retrofit2rxjava.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rufat.retrofit2rxjava.R;

/**
 * Created by Rufat on 10.04.2018.
 */

public class PostViewHolder extends RecyclerView.ViewHolder  {
    TextView txt_title, txt_content, txt_author;
    public PostViewHolder(View itemView) {
        super(itemView);

        txt_author = (TextView)itemView.findViewById(R.id.txt_author);
        txt_content = (TextView)itemView.findViewById(R.id.txt_content);
        txt_title = (TextView)itemView.findViewById(R.id.txt_title);
    }
}
