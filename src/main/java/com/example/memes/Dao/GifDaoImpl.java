package com.example.memes.Dao;

import com.example.memes.Model.Category;
import com.example.memes.Model.Gif;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class GifDaoImpl implements GifDao {

    private static List<Gif> gifList = new ArrayList<>();
static{
        gifList.add(new Gif("android-explosion",new Long(1),false, CategoryDaoImpl.getGifCategory().get(1)));
        gifList.add(new Gif("ben-and-mike",new Long(1), false, CategoryDaoImpl.getGifCategory().get(1)));
        gifList.add(new Gif("book-dominos",new Long(2), true, CategoryDaoImpl.getGifCategory().get(2)));
        gifList.add(new Gif("compiler-bot",new Long(2),true, CategoryDaoImpl.getGifCategory().get(2)));
        gifList.add(new Gif("cowboy-coder",new Long(3),true, CategoryDaoImpl.getGifCategory().get(0)));
        gifList.add(new Gif("infinite-andrew",new Long(3),false, CategoryDaoImpl.getGifCategory().get(0)));}

    @Override
    public List<Gif> getGifList() {
return gifList;
    }

    public static void setGifList(List<Gif> gifList) {
        GifDaoImpl.gifList = gifList;
    }

    public Gif findByName(String name) {
        for(Gif gif: gifList){
            if(gif.getName().equals(name)) return gif;
        }
        return null;
    }

    public List<Gif> findByFavorite(){
       List<Gif> favoritList = new ArrayList<>();
       for(Gif favorit: gifList){
           if(favorit.isFavorite()){
               favoritList.add(favorit);
           }
       }
       return favoritList;
    }

    public List<Gif> getGifsByCategory(Category category ){
        List<Gif> gifInCategory = new ArrayList<>();
        for(Gif addGif: gifList){
            if(addGif.getCategory().getId().compareTo(category.getId())==0){
                gifInCategory.add(addGif);
            }
        }
        return gifInCategory;
    }



}
