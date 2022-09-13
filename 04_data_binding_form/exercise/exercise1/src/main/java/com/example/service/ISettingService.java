package com.example.service;

import com.example.model.Setting;

import java.util.List;

public interface ISettingService {

    List<String> findLanguages();

    List<Integer> findSize();

    List<Setting> findSettingAll();

    Setting findById(int id);

    void update(Setting setting);
}
