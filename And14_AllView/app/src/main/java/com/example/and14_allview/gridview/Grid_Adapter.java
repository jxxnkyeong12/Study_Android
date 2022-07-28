package com.example.and14_allview.gridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and14_allview.R;
import com.example.and14_allview.listview.KjkDTO;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Grid_Adapter extends BaseAdapter {

ArrayList<KjkDTO> list;
LayoutInflater inflater;

    public Grid_Adapter(ArrayList<KjkDTO> list, LayoutInflater inflater) {
        this.list = list;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.contains(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    //convertView 부분은 우리한테 내용물을 넣으라고 null인 상태로 비워져서 들어오는 변수 return해주면 알아서 붙임 (os)
    //parent getCount만큼 나눈 공간을 position별로 한칸씩 우리한테 줌.
    //두가지는 붙일 내용물과 붙일 공간. ■ LayoutInflter ■
    //ViewHolder라는 것을 만들어보기 ! (View(위젯)용 DTO) <=RecyclerView에서는 ViewHolder를 강제함.

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_listview,parent,false);
       // ImageView img_id = convertView.findViewById(R.id.img_id1);
        GridViewHolder viewHolder = new GridViewHolder(convertView);
        viewHolder.bind(list.get(i));

     return  convertView;
    }

    // ? Inner Class -> GridViewHolder라는 클래스


   public class GridViewHolder {
        ImageView img_id;
        TextView tv_no, tv_category, tv_name;

        public  GridViewHolder (View v){
            img_id = v.findViewById(R.id.img_id1);
            tv_no = v.findViewById(R.id.no1);
            tv_category = v.findViewById(R.id.category1);
            tv_name = v.findViewById(R.id.name);
        }

        public void bind(KjkDTO dto) {
            img_id.setImageResource(dto.getImg_id());
            tv_no.setText(dto.getNo()+"");
            tv_category.setText(dto.getCategory());
            tv_name.setText(dto.getName());
        }

    }

}//class


