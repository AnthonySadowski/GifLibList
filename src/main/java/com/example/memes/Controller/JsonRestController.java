package com.example.memes.Controller;

import com.example.memes.Dao.CategoryDao;
import com.example.memes.Dao.CategoryDaoImpl;
import com.example.memes.Dao.GifDao;
import com.example.memes.Model.Category;
import com.example.memes.Model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
    public class JsonRestController {

        @Autowired
        CategoryDao categoryDao;

        @Autowired
        GifDao gifDao;

        @RequestMapping("/api/categories/{id}")
        public Category category(@PathVariable Long id) {
            return categoryDao.getCategoryById(id);
        }

        @RequestMapping("/api/categories/")
        public List<Category> category() {
            return categoryDao.findAll();
        }

        @RequestMapping("/api/gifs/")
        public List<Gif> gifs(){
            return gifDao.getGifList();
        }
    }