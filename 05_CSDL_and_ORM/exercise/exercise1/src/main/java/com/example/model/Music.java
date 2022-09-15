package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {

    @Id
    private int id;
    private String nameSong;
    private String singer;
    private String link;

    public Music() {
    }

    public Music(int id, String nameSong, String singer, String link) {
        this.id = id;
        this.nameSong = nameSong;
        this.singer = singer;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
