package com.example.project01_botnav.chat2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_botnav.R;

import java.util.ArrayList;

public class Chat_Adapter extends RecyclerView.Adapter<Chat_Adapter.ChatHolder> {

LayoutInflater inflater;
ArrayList<ChatDTO> list;

    public Chat_Adapter(LayoutInflater inflater, ArrayList<ChatDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View iv= inflater.inflate(R.layout.item_chat,parent,false);
        ChatHolder ch = new ChatHolder(iv);

        return ch;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder holder, int position) {
            //여기다 하면 무거워지니까 아래쪽에
            holder.bold(holder, position);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ChatHolder extends RecyclerView.ViewHolder {
        TextView txtv_chat1, txtv_chat2,txt_chat_time,chat_cnt;
        ImageView profile_chat;

        public ChatHolder(@NonNull View itemView) {
            super(itemView);

            txtv_chat1 = itemView.findViewById(R.id.txtv_chat1);
            txtv_chat2 = itemView.findViewById(R.id.txtv_chat2);
            txt_chat_time = itemView.findViewById(R.id.txt_chat_time);
            chat_cnt = itemView.findViewById(R.id.chat_cnt);
            profile_chat = itemView.findViewById(R.id.profile_chat);




        }
        public void bold(@NonNull ChatHolder holder, int position) {
            holder.txtv_chat1.setText(list.get(position).getName());
            holder.txtv_chat2.setText(list.get(position).getContent());
            holder.txt_chat_time.setText(list.get(position).getTime());
            holder.profile_chat.setImageResource(list.get(position).getProfile());



        }

    }


    
}
