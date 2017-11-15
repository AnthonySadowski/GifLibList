package com.example.memes.Controller;


import com.example.memes.Dao.CategoryDao;
import com.example.memes.Dao.GifDao;
import com.example.memes.Model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    GifDao gifDao;

    @Autowired
    CategoryDao categoryDao;



    @GetMapping("/")
    public String show(ModelMap modelMap){
        modelMap.addAttribute("gif", gifDao.getGifList());
        return "home";
    }
    @GetMapping("/gif-details/{name}")
    public String show(@PathVariable String name, ModelMap modelMap){
        modelMap.addAttribute("gif", gifDao.findByName(name));
        System.out.println(gifDao.findByName(name));
        return "gif-details";
    }
    @GetMapping("/categories")
    public String categories(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryDao.findAll());
        return "categories";
    }
    @GetMapping("/favorites")
    public String favorite(ModelMap modelMap){
        modelMap.addAttribute("favorite", gifDao.findByFavorite());
        System.out.println(gifDao.findByFavorite());
        return "favorites";
    }
    @GetMapping("/category/{id}")
    public String category(@PathVariable Long id, ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDao.getGifsByCategory(categoryDao.getCategoryById(id)));
        modelMap.addAttribute("category",categoryDao.getCategoryById(id));
        return "category";
    }
    @GetMapping("/search")
    public String searchByname(@RequestParam String q, ModelMap modelMap){
        modelMap.addAttribute("gif", gifDao.getSearchByName(q));
        System.out.println(gifDao.findByName(q));
        return "search";
    }




}
