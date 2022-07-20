package com.example.testand05_framlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn_imgv1, btn_imgv2;
    ImageView img1, img2, img3;
    int cnt = 1;
//    ArrayList<ImageView> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn_imgv1= findViewById(R.id.btn_imgv);
         btn_imgv2=findViewById(R.id.btn_imgv2);
         img1= findViewById(R.id.imgv1);
         img2= findViewById(R.id.imgv2);
         img3= findViewById(R.id.imgv3);

//       btn_imgv1.setOnClickListener(this);

         btn_imgv1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.d("이전버튼", "또잉 : " + cnt);

                 if(cnt == 3){
                     img3.setVisibility(View.GONE);
                     img1.setVisibility(View.VISIBLE);

                     cnt = 2;
                 }else if(cnt ==2) {
                     img1.setVisibility(View.GONE);
                     img2.setVisibility(View.VISIBLE);

                     cnt = 1 ;
                 }else if(cnt==1){
                     img2.setVisibility(View.GONE);
                     img3.setVisibility(View.VISIBLE);

                     cnt = 3;
                 }

             }
         });

         btn_imgv2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.d("다음버튼", "어떻게찍혀 " + cnt);


                 if(cnt == 1){
                     img1.setVisibility(View.GONE);
                     img2.setVisibility(View.VISIBLE);
                     cnt = 2;
                 }else if(cnt ==2) {
                     img2.setVisibility(View.GONE);
                     img3.setVisibility(View.VISIBLE);
                     cnt = 3;
                 }else if(cnt==3){
                     img3.setVisibility(View.GONE);
                     img1.setVisibility(View.VISIBLE);
                     cnt = 1;
                 }
             }
         });

    }
//        public void imageGone(){
//         img1.setVisibility(View.GONE);
//         img2.setVisibility(View.GONE);
//         img3.setVisibility(View.GONE);
//
//         if(cnt ==1 ){
//             img1.setVisibility(View.VISIBLE);
//         }else if(cnt ==2) {
//             img2.setVisibility(View.VISIBLE);
//         }else if(cnt ==3) {
//             img3.setVisibility(View.VISIBLE);
//         }



}