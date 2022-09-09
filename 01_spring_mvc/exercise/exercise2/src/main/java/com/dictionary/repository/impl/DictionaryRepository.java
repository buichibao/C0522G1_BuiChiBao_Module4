package com.dictionary.repository.impl;

import com.dictionary.repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class DictionaryRepository implements IDictionaryRepository {
    private static Map<String,String> list = new HashMap<>();
    static {
        list.put("fan","quạt");
        list.put("note book","quyển vở");
        list.put("phone","điện thoại");
        list.put("door","cửa chính");
        list.put("win down","cửa số");
    }
    @Override
    public String translate(String string) {
        return list.get(string);
    }
}
