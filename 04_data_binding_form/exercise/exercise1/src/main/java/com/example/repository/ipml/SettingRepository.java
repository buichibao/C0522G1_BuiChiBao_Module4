package com.example.repository.ipml;

import com.example.model.Setting;
import com.example.repository.ISettingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SettingRepository implements ISettingRepository {

    private  static List<String> listLanguage = new ArrayList<>();
    private  static List<Integer> listPageSize = new ArrayList<>();
    private  static List<Setting> listSetting = new ArrayList<>();

    static {

        listLanguage.add("English");
        listLanguage.add("Vietnamese");
        listLanguage.add("Japanese");
        listLanguage.add("Chinese");

        listPageSize.add(5);
        listPageSize.add(10);
        listPageSize.add(25);
        listPageSize.add(50);
        listPageSize.add(100);


        listSetting.add(new Setting(1,"English",5,true,"bùi"));
        listSetting.add(new Setting(2,"Vietnamese",10,false,"chí"));
        listSetting.add(new Setting(3,"Japanese",100,true,"bảo"));

    }

    @Override
    public List<String> findLanguages() {
        return listLanguage;
    }

    @Override
    public List<Integer> findSize() {
        return listPageSize;
    }

    @Override
    public List<Setting> findSettingAll() {
        return listSetting;
    }

    @Override
    public Setting findById(int id) {
        for (Setting setting: listSetting) {
            if(setting.getId()==id){
                return setting;
            }
        }
        return null;
    }

    @Override
    public void update(Setting setting) {
        for (Setting st:listSetting) {
            if(st.getId() == setting.getId()){
                listSetting.remove(st);
                listSetting.add(setting);
            }
        }
    }
}
