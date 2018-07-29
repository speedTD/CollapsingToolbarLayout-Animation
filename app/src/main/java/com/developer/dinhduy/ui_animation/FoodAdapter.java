package com.developer.dinhduy.ui_animation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.Hoder> {
    List<Food> foodList;
    Context context;

    public FoodAdapter(List<Food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @NonNull
    @Override
    public Hoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.custom_item,parent,false);
        return new Hoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Hoder holder, int position) {
        final Food f=foodList.get(position);
        holder.imageView.setImageResource(f.getPicture());
        holder.textView.setText(f.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+f.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class Hoder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public Hoder(View itemView) {
            super(itemView);
            // sr
            imageView=(ImageView) itemView.findViewById(R.id.id_image);
            textView=(TextView) itemView.findViewById(R.id.id_Textview);
        }
    }
}
