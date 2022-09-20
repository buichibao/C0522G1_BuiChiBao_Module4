package com.example.repository.ipml;

import com.example.repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;


import java.util.HashMap;

import java.util.Map;
@Repository
public class DictionaryRepository implements IDictionaryRepository {
    private  static  Map<String,String> stringMap = new HashMap<>();
    static {
        stringMap.put("fan","quạt");
        stringMap.put("pen","bút");
        stringMap.put("book","sách");
        stringMap.put("computer","máy tính");
        stringMap.put("car","xe");
    }
    //duyệt map bằng key và trả về value
    @Override
    public String change(String eng) {
        for (String key:stringMap.keySet()) {
            if(key.equals(eng)){
                return stringMap.get(key);
            }
        }
        return "NOT FIND";
    }
}
