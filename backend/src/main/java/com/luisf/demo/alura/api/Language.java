package com.luisf.demo.alura.api;

public class Language {
  private int id;
  private String title;
  private String urlImage;
  private String rating;

  public Language(int id, String title, String urlImage, String rating) {
    this.id = id;
    this.title = title;
    this.urlImage = urlImage;
    this.rating = rating;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrlImage() {
    return urlImage;
  }

  public void setUrlImage(String urlImage) {
    this.urlImage = urlImage;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }
}
