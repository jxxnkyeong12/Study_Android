package com.example.and04_linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
        implements View.OnClickListener
{

    /*  1.디자인 파일에 있는 버튼과 에딧텍스트를 자바코드에서 사용할수있게 찾아주기
        - 내가 사용할 위젯을 자바에서 찾을수있게 ID를 주기. (attribute)
        - findViewById라는 메소드를 이용해서 ↑ 해당하는 아이디로 위젯 찾아서 연결
    *   2.※ 버튼 클릭 이벤트를 만들고 log찍어보기 ※
    * */
    Button btn_login , btn_join ;//null
    EditText edt_id , edt_pw;//null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);//<= xml <=> java (<-연결된 xml파일 내부에있는 위젯을 id로 찾기)

        btn_login = findViewById(R.id.loginbtn);
        btn_join = findViewById(R.id.joinbtn);
        edt_id = findViewById(R.id.edt_id);
        edt_pw = findViewById(R.id.edt_pw);

    /*    View.OnClickListener vo = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("aaa" , " aaa" + v.getId() + " : " + R.id.joinbtn + "");
            }
        };
*/
        btn_join.setOnClickListener(this);
        edt_pw.getText();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // admin : id, admin1234 <=pw
                //edt<- .getText   <-String 타입으로 바꾸고 비교해보기.
                String id = String.valueOf(edt_id.getText());
                String pw = String.valueOf(edt_pw.getText());
                Log.d("아이디 뭐찍힘? : ", id);
                Log.d("비번 뭐찍힘? : ", pw);
                if (id.equals("admin") && pw.equals("admin1234")) {
                    Log.d("로그찍기", "로그인 성공");

                }else {
                     Log.d("로그찍기", " 로그인 실패 ");

                }





            }
        });


    }

    @Override
    public void onClick(View v) {//?
        Log.d("로그찍기", " 아무값");
    }
}