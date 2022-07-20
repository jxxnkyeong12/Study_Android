package com.example.test_and10_intentresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn_intent;
    //안드로이드의 4대 컴포넌트 : (현) 액티비티
    //4가지의 컴포넌트들간의 통신을 담당 : Intent (전달)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_intent= findViewById(R.id.btn_intent);

        btn_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //버튼이 눌렸을때 새화면이 뜬다
                //직접 LoginActivity라는 액티비티를 하나만들고 메인액티비티의 버튼을 클릭했을때 ↑ 새로 띄워지게 처리해보기.


              //  Intent intent = new Intent(MainActivity.this, SubActivity.class); //인텐트는 객체를 생성해줘
                                                            //현재 위치에서 이동할 위치를 파라메터로 넘겨준다! 두개를 파라메터로 넘겨준다
               //startActivity(intent);

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        }); //View = (->Button)


    }
}