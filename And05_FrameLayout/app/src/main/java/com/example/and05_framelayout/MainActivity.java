package com.example.and05_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imgv1, imgv2, imgv3;
    String var;
    int cnt= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);
        btn = findViewById(R.id.btn_img);
        imgv1 = findViewById(R.id.imgv1);
        imgv2 = findViewById(R.id.imgv2);
        imgv3 = findViewById(R.id.imgv3);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (cnt==0) {
                    imgv3.setVisibility(View.GONE);
                    imgv2.setVisibility(View.VISIBLE);
                    Log.d("이미지 3번 찍히나","이미지3");
                    cnt++;
                }else if (cnt==1) {
                    imgv2.setVisibility(View.GONE);
                    imgv1.setVisibility(View.VISIBLE);
                    cnt++;
                    Log.d("이미지 찍히나","이미지2");
                }else if(cnt==2) {
                    imgv1.setVisibility(View.GONE);
                    imgv3.setVisibility(View.VISIBLE);
                  /*  imgv2.setVisibility(View.VISIBLE);
                    imgv1.setVisibility(View.VISIBLE);
 */                 cnt = 0;
                    Log.d("이미지 찍히나","이미지1");

                }
               }
             //버튼을 누름 2 : 이미지뷰 2번 안보이게 함




        });
        var = "setContentView 디자인 연결 되고나서 값 줌";
    }
}
