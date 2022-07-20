package com.example.testand02_exlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "KJK";
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //context : 현재 화면에서 보여지는 객체가 어떤것인지.
        TextView tv_name= new TextView(this);
        tv_name.setText(" K J K ");
        tv_name.setGravity(Gravity.CENTER); //가운데 정렬! 가운데다가 만들겠다. 추후 위젯 사용시 다시 공부할 예정

        ImageView imgv = new ImageView(this);
        imgv.setImageResource(R.drawable.ic_launcher_background); //setImageResource 이건 이미지뷰에만 있다!


        Button btn = new Button(this);
        btn.setText("클릭해보기");
        //위젯들이 화면에 보이기 위해서는 반드시 Layout(View->ViewGroup상속받은 종류의 위젯이 필요함)
        //Layout 이라는 것은 위젯은 어떤식으로 정렬(위치)해서 보여질지의 규칙이 정해져있는 판
        
        //차곡차곡 쌓는 방식 (정렬방식) : LinearLayout 세로로 쌓을지, 가로로 쌓을지를 결정후 위젯을 넣으면 자동으로 정렬됨
        //제약(링커, 앵커)을 두고 부모나 다른 위젯을 기준으로 해당하는 위젯의 위치를 결정하는 방식 : ConstranintLayout

        LinearLayout layout = new LinearLayout(this); //현재 보여질 화면을 넘긴다
        layout.setOrientation(LinearLayout.VERTICAL); //세로 입력 추후 위젯 사용시 다시 공부할 예정
        layout.addView(tv_name); //어떤걸 추가할거냐
        layout.addView(imgv);
        layout.addView(btn);

       setContentView(layout);//<-자바로 짠 경우! 다만 자바로 짜면 미리보기가 안되서... 모양이 안좋게 나온다
       // setContentView(R.layout.test_buttonevent); //<-( 디자인 <-> 자바 연결 ) <-xml로 짠 경우
     //안드로이드에서 디자인을 하는 방식 javaCode vs Android.xml
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "버튼눌림", Toast.LENGTH_LONG).show(); //위의 영역!
                                                            //text는 힌트야! 자동완성!
            }
        });


    }
}