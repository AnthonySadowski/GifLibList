package com.example.memes.Dao;

import com.example.memes.Model.Category;
import com.example.memes.Model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CategoryDaoImpl implements CategoryDao {

    private static List<Category> gifCategory= new ArrayList<>();
    static {
        gifCategory.add(new Category(new Long(1),"Android"));
        gifCategory.add(new Category(new Long(2),"smieszki"));
        gifCategory.add(new Category(new Long(3),"Gify"));

    }

    public static List <Category> getGifCategory(){
        return gifCategory;
    }

    @Override
    public List<Category> findAll() {
        return gifCategory;
    }

    public Category getCategoryById(Long id){
        for(Category find: gifCategory){
            if(find.getId().compareTo(id)==0){
                return find;
                }
            }
            return null;
        }
    }



