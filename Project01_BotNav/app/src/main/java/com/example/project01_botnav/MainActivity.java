package com.example.project01_botnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.project01_botnav.chat.ChatFragment;
import com.example.project01_botnav.chat2.Chat_Fragment;
import com.example.project01_botnav.main.MainFragment;
import com.example.project01_botnav.view.ViewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    MainFragment mainFragment = new MainFragment();

    BottomNavigationView btm_nav;
    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btm_nav = findViewById(R.id.bttom_nav);

        actionBar = getSupportActionBar();
        actionBar.setTitle("친구");
        
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();


        // 객체 생성...? 아래에 생기는 메소드는 안드로이드 내장기능이 자동으로 만들어주는..
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.d("탭", "onNavigationItemSelected: " + item);
                //id <-이걸 사용하는게 더 좋아. title은 필요에 따라서 자주 바뀔 가능성이 있음 (개발 초기)
                if(item.getItemId() == R.id.tab1){
                    actionBar.setTitle("친구");
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
                }else if (item.getItemId() == R.id.tab2){
                    actionBar.setTitle("채팅");
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new ChatFragment()).commit();
                }else if(item.getItemId() == R.id.tab3){
                    actionBar.setTitle("뷰");
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new ViewFragment()).commit();
                }else if(item.getItemId() == R.id.tab4){
                    actionBar.setTitle("쇼핑");
                }else if(item.getItemId() == R.id.tab5){
                    actionBar.setTitle("더보기");
                }

                return true;
            }
        });


        //정의, 구현, 동작
        //객체 (버튼) - 객체 (액티비티)
        // 인터페이스 (옵저버 패턴) : 다른객체간 어떤 작업이 끝났는지를 또는 어떤 작업이 시작되어야 할때를
        //서로 알려주기 위한 패턴. == 리스너




        ObClass ob = new ObClass(new ObClass.Callbackob() {
            @Override
            public void onResult(String result) {
                Log.d("결과값", "onResult: " +result);
            }
        });

        ob.callback();

    }
}