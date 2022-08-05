package com.example.project01_botnav.chat;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.project01_botnav.R;

import java.util.ArrayList;

public class ChatFragment extends Fragment {

    //여기는 선생님이랑 다시 하는 부분입니다 
    RecyclerView recv_chat;
    ArrayList<ChatDTO2> list = new ArrayList<>();
    View.OnClickListener showToastListner;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_chat, container, false);

        recv_chat = v.findViewById(R.id.recv_chat2);

        for (int i = 0; i<20; i++){
            if(i%2==0){
                list.add(new ChatDTO2(R.drawable.and, "친구이름 " + i , "메세지" + i, "11:0" + i));
            }else {
                list.add(new ChatDTO2(R.drawable.flower1, "친구이름 " + i , "메세지" + i, "11:0" + i));

            }
        }


        Toast.makeText(getContext(), "", Toast.LENGTH_SHORT).show();


        showToastListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "친구이름", Toast.LENGTH_SHORT).show();
            }
        };
        
        
        ChatAdpter adpter = new ChatAdpter(inflater, list, getContext(), showToastListner);
        recv_chat.setAdapter(adpter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recv_chat.setLayoutManager(manager);
        
        //어댑터 (레이아웃 - 칸마다 보여질 정보를 만들어 놓는것 ) , 레이아웃 매니저

        return v;



    }
}