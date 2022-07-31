package com.example.japangi_project;

import java.util.ArrayList;



public class RamenDAO {

    public ArrayList<RamenDTO> RamenList(ArrayList<RamenDTO> list) {
        for(int i = 0; i <list.size(); i++) {
            list.get(i).getName();
            list.get(i).getCount();
        }
        return list;
    }



}//class
