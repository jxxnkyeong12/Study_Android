package com.example.and11_vendingmachine;

import android.widget.Toast;

import java.util.ArrayList;

public class DrinkDAO {

    //DrinKDTO 두건을 가진 ArrayList를 return 하는 메소드 initDrinks를 만드세요

    public ArrayList<DrinkDTO> initDrinks () {
       ArrayList<DrinkDTO> list = new ArrayList<>();
       
       list.add(new DrinkDTO("환타", 1000,10));
       list.add(new DrinkDTO("사이다", 900,8));

        return  list;
    }//
    
    //ArrayList<ViewDTO> <-텍스트이름1, 수량1, 버튼1 .... 2 , 2 , 2
    //ArrayList<DrinkDTO>를 입력받아 ArrayList<ViewDTO>의 내용을 세팅할수 있는 메소드를 만드세요.
    //두 개의 ArrayList는 Size가 같기때문에 index(주소)를 잘활용하면 데이터 매칭이 편리하다.
    
  /*  public ArrayList<ViewDTO> setViewDTO(ViewDTO dto){
        ArrayList<ViewDTO> v_list = new ArrayList<>();
        dto.getTv_name().setText("콜라");
        dto.getTv_cnt().setText("10");
 //       v_list.get(0).getTv_name().setText("환타");==============================
//        v_list.get(0).setTv_cnt(dto.getTv_cnt()+"");

        return v_list;
    }*/
    
    //Data <-ArrayList<DrinkDTO> list 메인에 있는 리스트를 활용
    //widget <-데이터를 표현하기 위한 위젯들을 묶어놓은 리스트 활용
    public void setData(ArrayList<DrinkDTO> list, ArrayList<ViewDTO> v_list) {
        for (int i = 0; i <v_list.size(); i++) {
           // v_list.get(i)  //DTO까지만 접근한거.
            v_list.get(i).getTv_name().setText(list.get(i).getNameCnt());
        //    v_list.get(i).getTv_cnt().setText(list.get(i).getNcnt()); 메소드를 만들어서 써벌임; ㅎ
            v_list.get(i).getTv_cnt().setText(list.get(i).getCnt() + "개 남음"); //cnt는 또 쓸수 있으니까 일단은 뒤에 + "개 남음"으로 써줘
            
        }
    }

    //list와 index를 가지고와서 작업.
    //DTO만 가지고와서 작업.

    public boolean setMinusDrink( ArrayList<DrinkDTO> list, int index){
        //수량 체크, 금액 체크 (별도 메소드 이용)
        if(list.get(index).getCnt() == 0){

        }else {
             list.get(index).setCnt(list.get(index).getCnt() -1);

        }
         return  false;




    }

    
}//class
