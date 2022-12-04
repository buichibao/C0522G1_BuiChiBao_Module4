package com.example.ve_xe.service.impl;

import com.example.ve_xe.model.VeXe;
import com.example.ve_xe.repository.IVeXeRepository;
import com.example.ve_xe.service.IVeXeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VeXeService implements IVeXeService {

    @Autowired
    private IVeXeRepository iVeXeRepository;
    @Override
    public Page<VeXe> showListVeXe(String nameNhaXe,Pageable pageable) {
        return iVeXeRepository.showListVeXe(nameNhaXe,pageable);
    }
}
