package com.example.and10_intend;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn, btn2, btn_call, btn_internet, btn_gps;
    //안드로이드의 4대 컴포넌트 : ( 현 ) 액티비티
    //4가지의 컴포넌트들간의 통신을 담당 : Intent(전달)
String text = "testactivity";
int num1 = 10;
    LoginDTO dto = new LoginDTO(11, "admin");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        btn_call = findViewById(R.id.btn_call);
        btn_internet = findViewById(R.id.btn_internet);
        btn_gps = findViewById(R.id.btn_gps);

        btn_call.setOnClickListener(this);
        btn_internet.setOnClickListener(this);
        btn_gps.setOnClickListener(this);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //현재 위치 - > 이동할 위치 두개를 파라메터로 지정을 해둠.

                //직접 LoginActivity 라는 액티비티를 하나만들고
                //메인액티비티의 버튼을 클릭했을때 ↑ 새로 띄워지게 처리해보기.

 /*  //             Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.putExtra("test", "넘길값"); //소문자로 쓰는게 좋아
                intent.putExtra("num", 100);

                //id 에는 11 , pw는 admin

            //LoginDTO타입을 요소로 가지는 ArrayList를 만들기
                //Size == 10이어야 한다.

                ArrayList<LoginDTO> list = new ArrayList<>();
                 for(int i = 1; i<=10; i++ ){
                     list.add(new LoginDTO(i, "pw" + i));
                    //   list.size();
                 }

                intent.putExtra("list", list);







                intent.putExtra("dto", dto); //직렬화 Serializable*/




                //startActivity(intent); //실제 액티비티를 띄움
                // startActivity라는 메소드는 새창을 띄우는 용도로만 사용을함.
                // 다음 액티비티의 작업이나 결과를 받아오기 위해서는 다른 메소드를 사용.
                // intent (명시적, 암시적)
                // 명시적 : <-내가 만든 클래스 (바운더리)에서 작업이 되었을때를 의미함.
                // 암시적 : <- 내가 만들지 않은 어떤한 곳에서 작업이 되었을때 (카메라, 갤러리, 인터넷 등)
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivityForResult(intent, REQ_TESTCODE);
                //String 변수 하나
                intent.putExtra("text", text);
                intent.putExtra("num1", num1);
            }
        });
    }

    //근데 1001을 왜 썼을까? , Kakao에서는 왜 콜백을 만들었을까?
    //어떤 액티비티가 종료되었는지를 어떻게 구별할까? if문으로!
    //상수 <- requestCode = 1001
    final int REQ_TESTCODE = 1001;
    final int REQ_SUB_CODE = 1002;

    @Override   //<-startActivityForResult로 Intent(Activity)를 실행하면 항상 콜백부분 (메소드)
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_TESTCODE){
            Intent intentData = getIntent();
            Log.d("tqg", ": 테스트 액티비티가 실행되고 결과를 표시할꺼임 ");
            Log.d("tqg", ": 결과 코드 " + resultCode);
            //intent를 받아왔음 안에 들어있는 스트링값을 출력하기.
       //  String reint =   intentData.getIntExtra("reIntent");



        }else if(requestCode == REQ_SUB_CODE){
            Log.d("tqg", ": 서브 액티비티가 실행되고 결과를 표시할꺼임 ");

        }



        
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_call){
            //안드로이드에서 기본적으로 제공하고 우리가 만들지 않은 작업을 하게 되면 암시적 인텐트 라고 한다
            //전화걸기 ( 권한 매우 낮음 -> 매니페스트 파일에 명시만 해놓으면 바로 사용가능한 부분 ) permission
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:/119"));
            startActivity(intent);
        }else if (v.getId() == R.id.btn_gps){

            // gps <-권한을 승인받아야 함 . 현재위치를 노출해야할때
            
            
        }else if (v.getId() == R.id.btn_internet){

        }
    }
}