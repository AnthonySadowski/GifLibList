package com.example.memes.Dao;

import com.example.memes.Model.Meme;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface GifDao  {
    List<Meme> getMemeCategoryList();
}
