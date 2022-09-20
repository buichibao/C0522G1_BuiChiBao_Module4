package com.example.service.ipml;


import com.example.repository.IDictionaryRepository;
import com.example.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {

    @Autowired
    IDictionaryRepository iDictionaryRepository;
    @Override
    public String change(String eng) {
        return iDictionaryRepository.change(eng);
    }
}
