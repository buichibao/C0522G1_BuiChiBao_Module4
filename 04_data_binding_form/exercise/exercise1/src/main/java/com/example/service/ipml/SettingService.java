package com.example.service.ipml;

import com.example.model.Setting;
import com.example.repository.ISettingRepository;
import com.example.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SettingService implements ISettingService {

    @Autowired
    private ISettingRepository iSettingRepository;

    @Override
    public List<String> findLanguages() {
        return iSettingRepository.findLanguages();
    }

    @Override
    public List<Integer> findSize() {
        return iSettingRepository.findSize();
    }

    @Override
    public List<Setting> findSettingAll() {
        return iSettingRepository.findSettingAll();
    }

    @Override
    public Setting findById(int id) {
        return iSettingRepository.findById(id);
    }

    @Override
    public void update(Setting setting) {
        iSettingRepository.update(setting);
    }
}
