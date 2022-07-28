package com.example.and14_allview.gridview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.and14_allview.R;
import com.example.and14_allview.listview.KjkDTO;

import java.util.ArrayList;
import java.util.zip.Inflater;


public class GridFragment extends Fragment {

GridView gridView;

    /*1. 목록을 가지는 모든 뷰는 Adapter가 필요함.
     *       - 1-1. 한칸마다 보여질 데이터를 묶어놓은 객체 == DTO(ArrayList)
     *       - 1-2. 한칸마다 보여질 데이터를 디자인해놓은 파일 == res\layout\xml
     * 2. Adapter 생성
     *       -2-1. 클래스를 추가한다.
     *       -2-2. extends(상속)을 받아서 어댑터가 된다.
     * 3.gridView <=> Adapter 연결
     * */


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_grid, container, false);
        gridView = v.findViewById(R.id.grideview);

        ArrayList<KjkDTO> list = new ArrayList<>();

        list.add(new KjkDTO(1, R.drawable.flower1, "화관", "하양"));
        list.add(new KjkDTO(2, R.drawable.flower2, "화관", "빨강"));
        list.add(new KjkDTO(3, R.drawable.flower3, "화관", "새"));
        list.add(new KjkDTO(4, R.drawable.flower1280, "풍경", "풍경"));
        list.add(new KjkDTO(5, R.drawable.image4, "인물", "인물"));


        Grid_Adapter adapter = new Grid_Adapter(list, inflater);
        gridView.setAdapter(adapter);

        return v;
    }
}