package com.example.and10_intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_login= findViewById(R.id.btn_login);



                Intent intent = getIntent(); // 이전 액티비티에서 Intent로 새로운 창을 띄울때 사용함 Intent를 가지고옴.
                String test = intent.getStringExtra("test");
                int num = intent.getIntExtra("num", -1);
                int num1 = intent.getIntExtra("num1", -1);
                LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dto");
        ArrayList<LoginDTO> list = (ArrayList<LoginDTO>)intent.getSerializableExtra("list");
                //int 타입은 참조형 데이터타입이 아니기 때문에
                //null인 상태가 있을수가 없음
                Log.d("메인 액티비티에서 가져온 값 : ", test);
                Log.d("메인 액티비티에서 가져온 값 : ", num + "");
                Log.d("메인 액티비티에서 가져온 값 : ", num1 + "");
                 Log.d("메인 pw : ", dto.getPw() + "" );
                 Log.d("메인 id : ", dto.getId() + "" );
                 Log.d("리스트 사이즈 : ", list.size()+ "" );

                //startActivity(intent);
            }



}