package com.example.japangi_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button btn_shin, btn_jin, btn_yeol, btn_hc, btn_price, btn_result, btn_random;
TextView txt_shin, txt_jin, txt_yeol, txt_hc, txt_jan;
EditText ed_main;
int money = 0;

Button[] btns = {btn_shin, btn_jin, btn_yeol, btn_hc, btn_price, btn_result, btn_random};
Integer[] Rid_btn = {R.id.btn_shin, R.id.btn_jin, R.id.btn_yeol,R.id.btn_hc, R.id.btn_price,R.id.btn_result ,R.id.btn_random};
ArrayList<RamenDTO> list = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 7 ; i++){
            btns[i]= findViewById(Rid_btn[i]);
        }

//        btn_shin = findViewById(R.id.btn_shin);
//        btn_jin = findViewById(R.id.btn_jin);
//        btn_yeol = findViewById(R.id.btn_yeol);
//        btn_hc = findViewById(R.id.btn_hc);
//        btn_price = findViewById(R.id.btn_price);
//        btn_result = findViewById(R.id.btn_result);
//        btn_random = findViewById(R.id.btn_random);
        ed_main = findViewById(R.id.txt_main);
        txt_jan = findViewById(R.id.txt_jan);
        txt_shin = findViewById(R.id.txt_shin);


        list.add(new RamenDTO("신라면", 10,1000, 0));
        list.add(new RamenDTO("진라면", 10,1000,0));
        list.add(new RamenDTO("열라면", 10,700,0));
        list.add(new RamenDTO("불닭라면", 10,1100,0));
        list.add(new RamenDTO("랜덤라면", 1,1000,0));
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);

        final InputMethodManager manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);



        //금액입력을 눌렀을때
        btns[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
               //txt_jan.setText(ed_main.getText());
                money =Integer.parseInt(ed_main.getText().toString());
                txt_jan.setText( "잔액 : " + money + " 원 ");

//                if(money == 1212){
//                    Toast.makeText(MainActivity.this, "관리자 모드", Toast.LENGTH_SHORT).show();
//                    list.get(0).count++;
//                }
                
                
            }
        });


        
        //신라면 주문하기를 눌렀을때
        btns[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //애초에 잔액이 없으면 구매할 수 없게 만들기
                if(money <list.get(0).price){
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();
                }else {

                    //돈이 있다면 이제 물건을 살 수 있으니까
                    if(list.get(0).cnt > 0){

                        //버튼 누른만큼 갯수는 감소되게
                        list.get(0).cnt--;
                        txt_shin.setText(list.get(0).cnt + "개 남음");

                        //버튼 누른만큼 내가 산 갯수를 증가
                        list.get(0).count++;

                        //잔액은 가격만큼 빼줘야지
                        money -= list.get(0).price;
                        txt_jan.setText("잔액 : " + money + " 원 ");
                        
                    }else {
                        Toast.makeText(MainActivity.this, "품절 - 재고가 없습니다", Toast.LENGTH_SHORT).show();
                    }
                    
                }
                
            }
        });

        //진라면 주문하기 눌렀을때
        btns[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //애초에 잔액이 없으면 구매할 수 없게 만들기
                if(money <list.get(1).price){
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();
                }else {

                    //돈이 있다면 이제 물건을 살 수 있으니까
                    if(list.get(1).cnt > 0){

                        //버튼 누른만큼 갯수는 감소되게
                        list.get(1).cnt--;
                        txt_jin.setText(list.get(1).cnt + "개 남음");

                        //버튼 누른만큼 내가 산 갯수를 증가
                        list.get(1).count++;

                        //잔액은 가격만큼 빼줘야지
                        money -= list.get(1).price;
                        txt_jan.setText("잔액 : " + money + " 원 ");

                    }else {
                        Toast.makeText(MainActivity.this, "품절 - 재고가 없습니다", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        //열라면 주문하기 눌렀을때
        btns[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //애초에 잔액이 없으면 구매할 수 없게 만들기
                if(money <list.get(2).price){
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();
                }else {

                    //돈이 있다면 이제 물건을 살 수 있으니까
                    if(list.get(2).cnt > 0){

                        //버튼 누른만큼 갯수는 감소되게
                        list.get(2).cnt--;
                        txt_yeol.setText(list.get(2).cnt + "개 남음");

                        //버튼 누른만큼 내가 산 갯수를 증가
                        list.get(2).count++;

                        //잔액은 가격만큼 빼줘야지
                        money -= list.get(2).price;
                        txt_jan.setText("잔액 : " + money + " 원 ");

                    }else {
                        Toast.makeText(MainActivity.this, "품절 - 재고가 없습니다", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });


        //불닭 주문하기 눌렀을때
        btns[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //애초에 잔액이 없으면 구매할 수 없게 만들기
                if(money <list.get(3).price){
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();
                }else {

                    //돈이 있다면 이제 물건을 살 수 있으니까
                    if(list.get(3).cnt > 0){

                        //버튼 누른만큼 갯수는 감소되게
                        list.get(3).cnt--;
                        txt_hc.setText(list.get(3).cnt + "개 남음");

                        //버튼 누른만큼 내가 산 갯수를 증가
                        list.get(3).count++;

                        //잔액은 가격만큼 빼줘야지
                        money -= list.get(3).price;
                        txt_jan.setText("잔액 : " + money + " 원 ");

                    }else {
                        Toast.makeText(MainActivity.this, "품절 - 재고가 없습니다", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });




        btns[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("money", money);
                intent.putExtra("list", list);

                startActivity(intent);


            }
        });

    }
}