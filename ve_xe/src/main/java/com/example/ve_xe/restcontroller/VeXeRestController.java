package com.example.ve_xe.restcontroller;

import com.example.ve_xe.model.VeXe;
import com.example.ve_xe.service.IVeXeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class VeXeRestController {

    @Autowired
    private IVeXeService iVeXeService;

    @GetMapping()
    public ResponseEntity<?> showList(@RequestParam("nameNhaXe") String nameNhaXe,
                                      @PageableDefault( value = 10) Pageable pageable){
        Page<VeXe> veXeList = iVeXeService.showListVeXe(nameNhaXe,pageable);
        if(veXeList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(veXeList,HttpStatus.OK);
    }
}
