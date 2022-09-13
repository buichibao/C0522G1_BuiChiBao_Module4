package com.example.service.ipml;

import com.example.model.Declaration;
import com.example.service.IDeclarationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DeclarationService implements IDeclarationService {
    private List<Declaration> declarationList = new ArrayList<>();

    @Override
    public List<Declaration> findAll() {
        return declarationList;
    }

    @Override
    public void save(Declaration declaration) {
        declarationList.add(declaration);
    }
}
