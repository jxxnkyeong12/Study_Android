package com.example.carrot_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
ImageView setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     setting = findViewById(R.id.setting);

     setting.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Log.d("TAG", "톱니바퀴 눌러봄 ");

         }
     });


    }
}