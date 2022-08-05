package com.example.project01_botnav.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_botnav.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class ViewFragment extends Fragment {

    TabLayout tabs;
    RecyclerView rec_view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_view, container, false);
        tabs = v.findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("My뷰"));  //여기에 setid 줘도 쓸수있어!
        tabs.addTab(tabs.newTab().setText("발견"));
        tabs.addTab(tabs.newTab().setText("카카오TV"));
        tabs.addTab(tabs.newTab().setText("코로나19"));
        tabs.addTab(tabs.newTab().setText("잔여백신"));



        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { //인터페이스!
            //포커싱이 되었을때 (선택함)
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() ==0) {
                    Log.d("탭", "onTabSelected: 탭 선택 됨! ");

                }else if(tab.getPosition()==1){
                    Log.d("탭", "onTabSelected: 탭 선택 됨! ");
                }
            }

            //포커싱이 해제 되었을때 (선택해제)
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            //다시 눌렀을때
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        rec_view = v.findViewById(R.id.recv_view);

       // int imgv, int banner, String name, String date, String header, String middle
        ArrayList<ViewDTO> list = new ArrayList<>();
        list.add(new ViewDTO(R.drawable.flower1,  "뷰테스트", "2022.07.13", "노트북아 오래가자", "작디작은 소중한 오쪼쪼"));
        list.add(new ViewDTO(R.drawable.flower2, "룰루랄라", "2022.07.13", "노트북아 오래가자", "작디작은 소중한 오쪼쪼"));
        list.add(new ViewDTO(R.drawable.flower3,  "뷰테스트", "2022.07.13", "노트북아 오래가자", "작디작은 소중한 오쪼쪼"));





        View_Adapter adapter = new View_Adapter(inflater, list, getContext());
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        rec_view.setAdapter(adapter);
        rec_view.setLayoutManager(manager);

        return v;
    }
}