package com.example.and11_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_name1, tv_name2, tv_cnt1, tv_cnt2, tv_money;
    Button btn_order1, btn_order2, btn_inputmoney, btn_ok;
    EditText edt_money;

    ArrayList<DrinkDTO> list; //= new ArrayList<>(); // 이러면 null오류는 안나온다. ArrayList를 사용할 준비를 함
    DrinkDAO dao = new DrinkDAO();   //밑에 dao를 만들어내니까 list는 선언만 해도 돼


    ArrayList<ViewDTO> v_list = new ArrayList<>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = dao.initDrinks(); //음료 두건을 만들어냄 (사실 디비에서 가져와야 함)


     //   ViewDTO vdto = new ViewDTO(findViewById(R.id.tv_name1), findViewById(R.id.tv_name2),findViewById(R.id.btn_order1));
        v_list.add(new ViewDTO(findViewById(R.id.tv_name1), findViewById(R.id.tv_cnt1),findViewById(R.id.btn_order1)) );
        v_list.add(new ViewDTO(findViewById(R.id.tv_name2), findViewById(R.id.tv_cnt2),findViewById(R.id.btn_order2)) );
        //dto 위젯 세개를 묶어서 관리할 수 있게 됨.

        for(int i = 0; i <v_list.size(); i++){
            v_list.get(i).getBtn_order().setOnClickListener(this);
            //btn_order1. <-
        }


        //독립적인 부분들
        tv_money = findViewById(R.id.tv_money);
        btn_inputmoney = findViewById(R.id.btn_inputmoney);
        btn_ok = findViewById(R.id.btn_ok);
        edt_money = findViewById(R.id.edt_money);

        dao.setData(list,v_list);






//===============ArrayList와 DTO 구조로 묶어서 사용 안해도 되는 부분 =======================
/*      tv_name1 = findViewById(R.id.tv_name1);
        tv_name1.setText(list.get(0).getNameCnt());
        tv_name2 = findViewById(R.id.tv_name2);
        tv_name2.setText(list.get(1).getNameCnt());
        tv_cnt1 = findViewById(R.id.tv_cnt1);
        tv_cnt2 = findViewById(R.id.tv_cnt2);

        btn_order1 = findViewById(R.id.btn_order1);
       btn_order2 = findViewById(R.id.btn_order2); */
//============================================================================================



    }

    @Override
    public void onClick(View v) {
        int i = 0;
        if(v.getId() == R.id.btn_order1){
            i =0;
            // 0 <- 환타, 1000, 10
         //   list.get(0).setCnt(list.get(0).getCnt() -1 );
        }else if (v.getId() ==  R.id.btn_order2){
            i =1;
        }
        dao.setMinusDrink(list, i); //순서 중요...! 밑에 있으면 두번 눌러야 차감된다 ㅎ
        dao.setData(list,v_list);
    }


//
//    public  ArrayList<ViewDTO> Vlist() {
//        ArrayList<ViewDTO> v_list = new ArrayList<>();
//        v_list.add( new ViewDTO(tv_name1, tv_cnt1, btn_order1));
//        v_list.add( new ViewDTO(tv_name2, tv_cnt2, btn_order2));
//
//        return v_list;
//    }

}