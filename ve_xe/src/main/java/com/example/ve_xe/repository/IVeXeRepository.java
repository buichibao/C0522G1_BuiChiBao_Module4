package com.example.ve_xe.repository;

import com.example.ve_xe.model.VeXe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IVeXeRepository extends JpaRepository<VeXe,Integer> {

    @Query(value = "select * from ve_xe join nha_xe on nha_xe.id = ve_xe.nha_xe_id where nha_xe.name like %:nameNhaXe% and ve_xe.is_delete = 0 ",nativeQuery = true)
    Page<VeXe> showListVeXe (@Param("nameNhaXe") String nameNhaXe,
                             Pageable pageable);
}
