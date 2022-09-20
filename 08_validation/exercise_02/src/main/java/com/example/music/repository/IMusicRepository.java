package com.example.music.repository;

import com.example.music.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public class IMusicRepository extends JpaRepository<Music,Integer> {
    Music findById(int id);
}
