package com.example.and13_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TestFragment extends Fragment {

   //기본적으로 프래그먼트 파일을 추가하게 되면 불필요한 코드들이 많다.
    //우리가 필요한것은 onCreateView!만 있으면 돼!
    //onCreateView라는 메소드는 항상 View 타입이 리턴되어야 한다

    Button btn_fragment;
  //  MainActivity ma = new MainActivity();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_test, container, false); //붙이는 기능, + 붙인 뷰를 리턴해줌.
        btn_fragment = v.findViewById(R.id.btn_fragment);

        btn_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_fragment.setText("버튼 눌림/");
              //  static 걸었으니까 클래스에 . 찍으면 나와
              //  MainActivity.mainMethod();
                MainActivity activity = (MainActivity) getActivity();
                activity.mainMethodI();//<-이게 올바른 방식이야
            }
        });





        return v;

        //return 밑에는 절대로 실행될 문장이 아니기때문에 코드 에러. 지우거나 return위로 올려야 함. int aaa = ?
    }
}