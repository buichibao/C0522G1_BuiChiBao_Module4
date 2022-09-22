package com.example.blog.service.ipml;

import com.example.blog.dto.IBlogDto;
import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogService implements IBlogService {

   @Autowired
   private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findByCategoryId(Pageable pageable, int id) {
        return iBlogRepository.findByCategoryId(pageable,id);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findByName(Pageable pageable, String name) {
        return iBlogRepository.findByBlogNameContaining(pageable,name);
    }

}
