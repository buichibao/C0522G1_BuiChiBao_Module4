package com.dictionary.service.impl;

import com.dictionary.repository.IDictionaryRepository;
import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {

    @Autowired

    IDictionaryRepository iDictionaryRepository;

    @Override
    public String translate(String string) {
        return iDictionaryRepository.translate(string);
    }
}
