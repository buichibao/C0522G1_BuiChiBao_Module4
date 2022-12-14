package com.example.blog.service;

import com.example.blog.dto.BlogDto;
import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IBlogService {
    Page<Blog> findByCategoryId(Pageable pageable,int id);

    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    Blog findById(int id);

    void update(Blog blog);

    void remove(int id);

    Page<Blog> findByName(Pageable pageable,String title);

    Page<BlogDto> findAllTitle(Pageable pageable);
}
