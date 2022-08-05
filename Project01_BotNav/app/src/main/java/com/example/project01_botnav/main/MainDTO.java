package com.example.project01_botnav.main;

public class MainDTO {
    private String name, content;
     private int profile;
     private boolean isMusic = false; //음악 있는 사람 있고, 없는 사람 있으니까

    public MainDTO(String name, String content, int profile) {
        this.name = name;
        this.content = content;
        this.profile = profile;
    }

    public MainDTO(String name, String content, int profile, boolean isMusic) {
        this.name = name;
        this.content = content;
        this.profile = profile;
        this.isMusic = isMusic;
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

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public boolean isMusic() {
        return isMusic;
    }

    public void setMusic(boolean music) {
        isMusic = music;
    }
}
