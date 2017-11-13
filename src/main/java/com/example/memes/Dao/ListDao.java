package com.example.memes.Dao;

import com.example.memes.Model.Meme;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ListDao implements GifDao {
    @Override
    public List<Meme> getMemeCategoryList() {
        List<Meme> memeList = new ArrayList<>();

        memeList.add(new Meme("android-explosion"));
        memeList.add(new Meme("ben-and-mike"));
        memeList.add(new Meme("book-dominos"));
        memeList.add(new Meme("compiler-bot"));
        memeList.add(new Meme("cowboy-coder"));
        memeList.add(new Meme("infinite-andrew"));
        return memeList;
    }
}
