package com.example.appandroid;

public class Movie {
    private String id_movie;
    private String id_loai;
    private String image;
    private  String studio;
    private String title;
    private String description;
    //private String rating;
    public Movie(){

    }
    public Movie(String image) {
        this.image = image;
    }
    public Movie(String title, String image) {
        this.title = title;
        this.image = image;

    }

    public Movie(String title, String image, String description) {
        this.title = title;
        this.image = image;
        this.description = description;
    }

    public Movie(String id_movie, String id_loai, String image, String studio, String title, String description) {
        this.id_movie = id_movie;
        this.id_loai = id_loai;
        this.image = image;
        this.studio = studio;
        this.title = title;
        this.description = description;
    }

    public String getId_movie() {
        return id_movie;
    }

    public void setId_movie(String id_movie) {
        this.id_movie = id_movie;
    }

    public String getId_loai() {
        return id_loai;
    }

    public void setId_loai(String id_loai) {
        this.id_loai = id_loai;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
