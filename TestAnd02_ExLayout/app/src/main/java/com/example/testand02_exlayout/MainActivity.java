package com.example.testand02_exlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_linearlayout);

        Button btn = findViewById(R.id.button);
        Button btn13 = findViewById(R.id.btn11);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(MainActivity.this, "버튼눌림", Toast.LENGTH_LONG).show();

          }
      });
    }


}