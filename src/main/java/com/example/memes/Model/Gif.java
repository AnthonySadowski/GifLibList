package com.example.memes.Model;


public class Gif {

    private String name;

    private Long id;

    private boolean favorite;

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gif(String name, Long id, boolean favorite) {

        this.name = name;
        this.id = id;
        this.favorite = favorite;
    }

    public Gif(String name, Long id, boolean favorite, Category category) {
        this.category=category;
        this.name = name;
        this.id = id;
        this.favorite = favorite;
    }

    public Gif(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
