package com.example.project01_botnav.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_botnav.R;
import com.example.project01_botnav.SplashActivity;

import java.util.ArrayList;

public class View_Adapter extends RecyclerView.Adapter<View_Adapter.ViewHolder>  {

LayoutInflater inflater;
ArrayList<ViewDTO> list;
Context context;  //액티비티에서 가지고 오는거야


    public View_Adapter(LayoutInflater inflater, ArrayList<ViewDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    public View_Adapter(LayoutInflater inflater, ArrayList<ViewDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new ViewHolder(inflater.inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(holder, position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder {
        //tv_name,
        ImageView imgv, banner;
        TextView tv_name, tv_msg, view_header, view_middle;


        public ViewHolder(@NonNull View v) {
            super(v);

            imgv = v.findViewById(R.id.imgv);
           // banner = v.findViewById(R.id.banner);
            tv_name = v.findViewById(R.id.tv_name);
            tv_msg = v.findViewById(R.id.view_middle);
            view_header = v.findViewById(R.id.view_header);
            view_middle = v.findViewById(R.id.view_middle);




        }

        public void bind(@NonNull ViewHolder h, int i){
            h.imgv.setImageResource(list.get(i).getImgv());
            h.tv_name.setText(list.get(i).getName());
            h.tv_msg.setText(list.get(i).getMiddle());
        //-> DetailActivity 상세정보를 볼수있는 액티비티
            //Intent intent = new Intent(현재위치 (컨텍스트), 다음액티비티클래스) 
            
            h.view_header.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, SplashActivity.class);
                            context.startActivity(intent);
                            //MainActivity에 있으니까 거기에

                }
            });

        }


    }


}
