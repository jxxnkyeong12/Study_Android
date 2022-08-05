package com.example.project01_botnav;



//옵저버 클래스
public class ObClass {
    //생성할때 인터페이스를 입력받아서 생성할수 있게 함.
    Callbackob callbackob; //필드로 놔두는거야

    public ObClass(Callbackob callbackob) {
        this.callbackob = callbackob;
    }
    

    //인터페이스는 대문자로 시작
    public interface Callbackob{
        void onResult(String result); //온클릭을 비슷하게 만들고 있는 것
                                      //onClick(View v);
    }

    public void callback(){ // <-안드로이드 OS
        callbackob.onResult("값을 넘어줌");
    }


}
