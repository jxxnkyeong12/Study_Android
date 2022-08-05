package com.example.project01_botnav.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.allenliu.badgeview.BadgeFactory;
import com.example.project01_botnav.MainActivity;
import com.example.project01_botnav.R;
import com.example.project01_botnav.chat2.ChatDTO;

import java.util.ArrayList;

public class ChatAdpter extends RecyclerView.Adapter<ChatAdpter.ViewHolder>{

    LayoutInflater inflater;
    ArrayList<ChatDTO2> list ;

    Context context; //좀더 여러군대에서 쓰려면 여기서 만드는게... 좋다?
    //필요한건 만들어라
    View.OnClickListener showToastListner ;

    public ChatAdpter(LayoutInflater inflater, ArrayList<ChatDTO2> list, Context context, View.OnClickListener showToastListner) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
        this.showToastListner = showToastListner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new ViewHolder(inflater.inflate(R.layout.item_chat2,parent,false)); //한칸마다 들어갈 정보를 주라
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    //데이터 (데이터DTO) <-> ViewHolder(DTO 위젯)
        holder.bind(holder,position);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //위젯들을 묶어놓을 DTO
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgv, imgv_pin, imgv_noti;
        TextView tv_name, tv_msg, tv_time,point ;
        public ViewHolder(@NonNull View v) {
            super(v);

            imgv = v.findViewById(R.id.imgv);
            imgv_pin = v.findViewById(R.id.imgv_pin);
            imgv_noti = v.findViewById(R.id.imgv_noti);
            tv_name = v.findViewById(R.id.tv_name);
            tv_msg = v.findViewById(R.id.tv_msg);
            tv_time = v.findViewById(R.id.tv_time);
            point = v.findViewById(R.id.point);


        }

        public void bind(@NonNull ViewHolder h, int i) {
            h.imgv.setImageResource(list.get(i).getImgv_res());
            h.tv_name.setText(list.get(i).getName());
            h.tv_msg.setText(list.get(i).getMsg());
            h.tv_time.setText(list.get(i).getTime());


            h.tv_name.setOnClickListener(showToastListner);

            // true, false를 DTO생성자에 넣거나 setter이용해서 바꾸면 되는데.
            //귀찮으니 여기서 작업을 함
            if (i%2==0) {
                h.imgv_pin.setVisibility(View.GONE);
                h.imgv_noti.setVisibility(View.GONE);
            }

            //                         액티비티 -> 붙임 (프래그먼트) -> 어댑터 사용

            //fragment에서 가져와..get..

            BadgeFactory.createDot(context).setBadgeCount(20).bind(point);

        }


    }

}
