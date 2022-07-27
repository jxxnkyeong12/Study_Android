package com.example.and13_fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class SubFragment extends Fragment {
Button btn_subfragment;
Context context;
    //기본적으로 프래그먼트 파일을 추가하게 되면 불필요한 코드들이 많다.
    //우리가 필요한것은 onCreateView!만 있으면 돼!
    //onCreateView라는 메소드는 항상 View 타입이 리턴되어야 한다

    // 서브프래그먼트가 생성될때 상위 액티비티에서 받오는 방식.....

//생성자를 이용해서 액티비티로부터 Context를 받아온다.
    // 3번째 방법 필요한 기능(객체)이 있고 생성하거나 받아올수없는 상황이면,
    // ■ 객체가 생성될 때 해당하는 기능을 받아오면 된다.
    public SubFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sub, container, false);
        btn_subfragment = v.findViewById(R.id.btn_sub_fragment);
        
        btn_subfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Context는 어떠한 기능을 사용하기위해서 상위 액티비티에서 무언가를 받아온다

              //  Toast.makeText(v.getContext(), "토스창", Toast.LENGTH_SHORT).show(); <-오류가 날 소지가 많으니까 쓰는건 자제!
              //  Toast.makeText(getContext(), "토스창", Toast.LENGTH_SHORT).show();

                //DTO 데이터 객체.. vo
                    Toast.makeText(context, "토스창", Toast.LENGTH_SHORT).show();



                //1. Fragment에서 Context기능을 받아오기 위한 첫번째 방법.
                //Toast.makeText(getActivity(), "토스창", Toast.LENGTH_SHORT).show();
                //2. Fragment에서 Context기능을 받아오기 위한 두번째 방법.
            }
        });
        return v;




    }
}