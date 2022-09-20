package com.example.music.service;

import com.example.music.model.Music;

import java.util.List;

public class IMusicService {
    List<Music> findAll();

    public void save(Music music);

    Music findById(int id);

    void update(Music music);
}
