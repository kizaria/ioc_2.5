package com.liuyunsong;

public class Song {
    private String songname;
    private Singer singer;
    private Style style;
    public String getSongname() {
        return songname;
    }
    public void setSongname(String songname) {
        this.songname = songname;
    }
    public Singer getSinger() {
        return singer;
    }
    public void setSinger(Singer singer) {
        this.singer = singer;
    }
    public Style getStyle() {
        return style;
    }
    public void setStyle(Style style) {
        this.style = style;
    }

}
