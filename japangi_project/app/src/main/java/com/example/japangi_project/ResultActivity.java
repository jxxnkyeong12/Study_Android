package com.example.japangi_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    TextView txt_sub1, txt_sub2;
    ImageView img_shin, img_jin, img_yeol, img_hc, img_ran;
  //  RamenDAO dao = new RamenDAO();
    int money = 0;
    String text ="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        txt_sub1 = findViewById(R.id.txt_sub1);
        txt_sub2 = findViewById(R.id.txt_sub2);


        img_shin = findViewById(R.id.img_shin);
        img_jin = findViewById(R.id.img_jin);
        img_yeol = findViewById(R.id.img_yeol);
        img_hc = findViewById(R.id.img_hc);
        img_ran = findViewById(R.id.img_ran);


        Intent intent = getIntent();
        ArrayList<RamenDTO> list = (ArrayList<RamenDTO>) intent.getSerializableExtra("list");

        //받아줄 준비


        imgvGone();


        money = intent.getIntExtra("money", -1);
        txt_sub1.setText("잔액 : " + money + "원");
        Log.d("리스트", "넘어와 " + list.get(0).getName() + list.get(0).count);


//        if (list.get(0).count > 0) {
//            img_shin.setVisibility(View.VISIBLE);
//            Log.d("들어왔나?", "잔액 " + money);
//
//            for (int i = 0; i < list.size(); i++) {
//
//                text.append(dao.RamenList(list).get(i).getName() + dao.RamenList(list).get(i).getCount());
//            }
//
//            txt_sub2.setText(text.toString());
//
//        }


        if(list.get(0).count > 0){
            img_shin.setVisibility(View.VISIBLE);
            txt_sub2.setText( list.get(0).getName() + " : " + list.get(0).count + "개");
        }else if(list.get(1).count >0 ){
            img_jin.setVisibility(View.VISIBLE);
            txt_sub2.setText( list.get(1).getName() + " : " + list.get(1).count + "개");
        }else if (list.get(2).count>0){
            img_yeol.setVisibility(View.VISIBLE);
            txt_sub2.setText( list.get(2).getName() + " : " + list.get(2).count + "개");
        }else if (list.get(3).count>0){
            img_hc.setVisibility(View.VISIBLE);
            txt_sub2.setText( list.get(2).getName() + " : " + list.get(2).count + "개");
        }


    }





    public void imgvGone() {
        img_shin.setVisibility(View.GONE);
        img_jin.setVisibility(View.GONE);
        img_yeol.setVisibility(View.GONE);
        img_hc.setVisibility(View.GONE);
        img_ran.setVisibility(View.GONE);
    }

}