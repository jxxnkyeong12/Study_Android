package com.example.project01_botnav.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_botnav.R;

import java.util.ArrayList;
import java.util.Random;


public class MainFragment extends Fragment {

    RecyclerView recv_main;
/*   int[] imgArr = {   *//*이런식으로 배열에 묶어서 사용할수도 있다!*//*
            R.drawable.flower2,
            R.drawable.flower1,
            R.drawable.imgae6,
            R.drawable.flower3,
            R.drawable.image4,
            R.drawable.user,
            R.drawable.flower2,
            R.drawable.imgae6,
            R.drawable.flower3,
            R.drawable.flower1,

    };*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);
        recv_main = v.findViewById(R.id.recv_main);

        //mainDTO를 10개를 가진 ArrayList 만들기
        ArrayList<MainDTO> list = new ArrayList<>();
   /*     for (int i = 0 ; i<30 ; i++){
            int profile = new Random().nextInt(imgArr.length);
            list.add(new MainDTO(profile, "꽃" + i, "상태 " + i));
            if (i%3 ==0) {
                list.add(new MainDTO(profile, "친구이름" + i, "상태 " + i));
            }
        }
        */


        list.add(new MainDTO("화관", "안녕안녕안녕", R.drawable.flower2, false));
        list.add(new MainDTO("꽃놀이", "상대메시지", R.drawable.flower1, false));
        list.add(new MainDTO("써니사이드", "안녕, 보고싶은너에게", R.drawable.imgae6, true));
        list.add(new MainDTO("도토리", "돌체라떼", R.drawable.flower3));
        list.add(new MainDTO("컴포즈커피", "따뜻한 카페라떼 존맛 ", R.drawable.image4, true));
        list.add(new MainDTO("메가커피", "큐뷰라떼 가격오름...", R.drawable.user));
        list.add(new MainDTO("화관", "안녕안녕안녕", R.drawable.flower2));
        list.add(new MainDTO("꽃놀이", "상대메시지", R.drawable.flower1, true));
        list.add(new MainDTO("도토리", "돌체라떼", R.drawable.flower3));
        list.add(new MainDTO("써니사이드", "안녕, 보고싶은너에게", R.drawable.imgae6, true));

        Main_Adapter adapter = new Main_Adapter(inflater, list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getContext(), RecyclerView.VERTICAL, false);


        recv_main.setAdapter(adapter);
        recv_main.setLayoutManager(layoutManager);

        return v;

    }
}