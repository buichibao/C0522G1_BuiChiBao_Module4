package com.example.blog.repository;

import com.example.blog.dto.BlogDto;
import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
      Blog findById(int id);

      Page<Blog> findByCategoryId(Pageable pageable,int id);

      Page<Blog> findByTitleContaining(Pageable pageable,String title);

      @Query(value = "select blog.title from  blog", nativeQuery = true)
      Page<BlogDto> findAllTitle(Pageable pageable);
}
