package com.example.memes.Controller;


import com.example.memes.Dao.GifDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    GifDao gifDao;



    @GetMapping("/favorites")
    public String show(ModelMap modelMap){
        modelMap.addAttribute("memeList", gifDao.getMemeCategoryList());
        return "favorites";
    }
}
