package com.example.memes.Dao;

import com.example.memes.Model.Category;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CategoryDao {
    List<Category> findAll();
    Category getCategoryById(Long id);
}
