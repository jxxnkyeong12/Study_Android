package com.example.project01_botnav.chat2;

public class ChatDTO {
    private int profile;
    private String name, content, time;
    private boolean cnt;


    public ChatDTO(int profile, String name, String content, String time, boolean cnt) {
        this.profile = profile;
        this.name = name;
        this.content = content;
        this.time = time;
        this.cnt = cnt;
    }

    public ChatDTO(int profile, String name, String content, String time) {
        this.profile = profile;
        this.name = name;
        this.content = content;
        this.time = time;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isCnt() {
        return cnt;
    }

    public void setCnt(boolean cnt) {
        this.cnt = cnt;
    }
}
