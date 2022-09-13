package com.example.service;

import com.example.model.Declaration;

import java.util.List;

public interface IDeclarationService {
    List<Declaration> findAll();

    void save(Declaration declaration);
}
