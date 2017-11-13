package com.example.memes.Model;

import com.example.memes.Dao.GifDao;

import java.util.List;

public class Category implements GifDao {
    private static List<Meme> memeCategoryList;

    public List<Meme> getMemeCategoryList() {
        return memeCategoryList;
    }

    public Category(List<Meme> memeCategoryList) {
        this.memeCategoryList = memeCategoryList;
    }
    public Category(){}
}
