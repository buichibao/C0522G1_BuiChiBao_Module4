package com.example.ve_xe.service;

import com.example.ve_xe.model.VeXe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IVeXeService {
    Page<VeXe> showListVeXe (String nameNhaXe ,Pageable pageable);
}
