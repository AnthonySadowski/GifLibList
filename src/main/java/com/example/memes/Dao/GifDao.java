package com.example.memes.Dao;

import com.example.memes.Model.Category;
import com.example.memes.Model.Gif;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface GifDao  {
    List<Gif> getGifList();
    Gif findByName(String name);
    List<Gif> findByFavorite();
    List<Gif> getGifsByCategory(Category category);
    List<Gif> getSearchByName(String name);
}
