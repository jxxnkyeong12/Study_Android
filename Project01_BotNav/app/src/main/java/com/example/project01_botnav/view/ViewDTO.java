package com.example.project01_botnav.view;

public class ViewDTO {

    private int imgv;
    private String name, date, header,
            middle;

    public ViewDTO(int imgv,  String name, String date, String header, String middle) {
        this.imgv = imgv;

        this.name = name;
        this.date = date;
        this.header = header;
        this.middle = middle;
    }


    public int getImgv() {
        return imgv;
    }

    public void setImgv(int imgv) {
        this.imgv = imgv;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }
}//class
