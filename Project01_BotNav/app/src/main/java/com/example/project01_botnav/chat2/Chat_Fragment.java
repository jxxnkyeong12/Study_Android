package com.example.project01_botnav.chat2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_botnav.R;

import java.util.ArrayList;

public class Chat_Fragment extends Fragment {



RecyclerView rec_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chat_,container,false);


        rec_view = v.findViewById(R.id.recv_chat);
        ArrayList<ChatDTO> list = new ArrayList<>();
        list.add(new ChatDTO(R.drawable.flower3, "화관", "안녕안녕", "오늘 9:30", false));
        list.add(new ChatDTO(R.drawable.flower2, "화관", "안녕안녕", "오늘 9:30", true));
        list.add(new ChatDTO(R.drawable.imgae6, "화관", "안녕안녕", "오늘 9:30", false));


        Chat_Adapter adapter = new Chat_Adapter(inflater, list);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);

        rec_view.setAdapter(adapter);
        rec_view.setLayoutManager(manager);


        return v;
    }
}