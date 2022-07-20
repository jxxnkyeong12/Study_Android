package com.example.testand03_relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "잘찍히나";

    /*1.디자인 파일에 있는 버튼과 에딧텍스트를 자바코드에서 사용할수 있게 찾아주기
      - 내가 사용할 위젯을 자바에서 찾을수있게 ID를 주기.(attribute)
      - findViewById라는 메소드를 이용해서 ↑ 해당하는 아이디로 위젯 찾아서 연결
    * 2. 버튼 클릭 이벤트(interface)를 만들고 log찍어보기
    * */
    EditText id, pw;  //null
    Button logbtn, joinbtn;  //null
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity); //<= xml <=> java 연결된 xml파일 내부에 있는 위젯을 id로 찾기!
     id = findViewById(R.id.id);
     pw = findViewById(R.id.pw);
     logbtn = findViewById(R.id.logbtn);
     joinbtn = findViewById(R.id.joinbtn);

//     View.OnClickListener vo = new View.OnClickListener() {
//         @Override
//         public void onClick(View v) {
//             Log.d("aaa", "aaa " + v.getId() + " : " + R.id.joinbtn + "");
//         }
//     };



    logbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //admin <- id, admin1234 <-pw
            //edt <- .getText <-String타입으로 바꾸고 비교해보기


            Log.d(TAG, "login 찍어보기 ");


            if(id.getText().toString().equals("admin")&& pw.getText().toString().equals("admin1234")){
                Log.d(TAG, "로그인 성공 " + id.getText());
                Toast.makeText(MainActivity.this, "로그인성공", Toast.LENGTH_SHORT).show();
            }else {
                Log.d(TAG, "아이디 또는 비밀번호를 확인해주세요 " + id.getText());
                Toast.makeText(MainActivity.this, "로그인실패", Toast.LENGTH_SHORT).show();

            }
        }
    });

    
    
    joinbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(TAG, "join 잘찍히나 ");
        }
    });
    }

    //추상클래스는 반드시 상속받아야 한다 강제성!

    //logbtn.setOnClickListener(this) { ↓ 이 아래가 실행된다
    @Override
    public void onClick(View v) {  //이대론 절대 실행안돼
        Log.d("로그찍기", "아무값 ");
    }
}