package com.example.appandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    Context context;
    List<Movie> mData;
    MovieItemClick movieItemClick;
    public MovieAdapter(Context context, List<Movie> mData,MovieItemClick listener ){
        this.context= context;
        this.mData=mData;
        movieItemClick=listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_movie,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.ImgMovie.setImageResource(Integer.valueOf(mData.get(position).getImage()));
        //holder.txtkq.setText(Integer.valueOf(mData.get(position).getImage())+"");
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView ImgMovie;
        private TextView txtkq;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ImgMovie=itemView.findViewById(R.id.item_movie_img);
            //txtkq=itemView.findViewById(R.id.textkq);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //movieItemClick.onMovie(mData.get(getAdapterPosition()),ImgMovie);
                }
            });
        }
    }
}
