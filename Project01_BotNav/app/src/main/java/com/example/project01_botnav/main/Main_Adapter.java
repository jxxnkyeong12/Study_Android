package com.example.project01_botnav.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_botnav.R;

import java.util.ArrayList;

public class Main_Adapter extends RecyclerView.Adapter<Main_Adapter.MainHoler> {

    LayoutInflater inflater; //칸마다 들어가는 데이터를 붙이기 위한거!
    ArrayList<MainDTO> list;

    public Main_Adapter(LayoutInflater inflater, ArrayList<MainDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    
    @NonNull
    @Override
    public Main_Adapter.MainHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_rec,parent,false); //디자인 하나를 가지고 옴
        MainHoler holder= new MainHoler(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Main_Adapter.MainHoler holder, int position) {
        holder.bind(holder,position);   //원래 여기다가 작업했는데 그러면 코드가 길어지니까 밑에 메소드(bind) 만들고 호출만 한거야!
    }

    @Override
    public int getItemCount() {
        return list.size();  //20 나중에 데이터를 받아올수 있으면 DTO가 준비가 되면! 변경 예정 (ArrayList) -> 변경했음! 2022.08.04에 KJK가 수정완
    }

    public class MainHoler extends RecyclerView.ViewHolder {
            ImageView profile_image, isMusic;
            TextView txtv_main1, txtv_main2;

        public MainHoler(@NonNull View v) { //itemView 이거 이름 기니까 짧게 바꿔도 돼
            super(v);

            profile_image =v.findViewById(R.id.profile_image);
            txtv_main1 = v.findViewById(R.id.txtv_main1);
            txtv_main2 = v.findViewById(R.id.txtv_main2);
            isMusic = v.findViewById(R.id.isMusic);


        }

        public void bind(@NonNull Main_Adapter.MainHoler h, int i){
            h.profile_image.setImageResource(list.get(i).getProfile());
            h.txtv_main1.setText(list.get(i).getName());
            h.txtv_main2.setText(list.get(i).getContent());

            if(list.get(i).isMusic()){
                h.isMusic.setVisibility(View.VISIBLE);
            }else {
                h.isMusic.setVisibility(View.INVISIBLE);
            }

        }
    }
}
