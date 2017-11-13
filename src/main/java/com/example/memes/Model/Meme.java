package com.example.memes.Model;


public class Meme {

    private String memeUrl;

    public Meme(String memeUrl) {
        this.memeUrl = memeUrl;
    }

    public String getMemeUrl() {
        return memeUrl;
    }

    public void setMemeUrl(String memeUrl) {
        this.memeUrl = memeUrl;
    }

    @Override
    public String toString() {
        return memeUrl;
    }
}
