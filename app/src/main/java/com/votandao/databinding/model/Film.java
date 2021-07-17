package com.votandao.databinding.model;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;

import com.bumptech.glide.Glide;
import com.votandao.databinding.BR;

public class Film extends BaseObservable {
    private String nameFilm;
    private String author;
    private boolean active;
    private String imageUrl;
    public ObservableField <Integer> numTym = new ObservableField<>();

    public Film(String nameFilm, String author, boolean active, String imageUrl, int numTym) {
        this.nameFilm = nameFilm;
        this.author = author;
        this.active = active;
        this.imageUrl = imageUrl;
        this.numTym.set(numTym);
    }

    @Bindable
    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
        notifyPropertyChanged(BR.nameFilm);
    }
    @Bindable
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        notifyPropertyChanged(BR.author);
    }
    @Bindable
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
        notifyPropertyChanged(BR.active);
    }
    @Bindable
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        notifyPropertyChanged(BR.imageUrl);
    }
    @Override
    public String toString() {
        return  nameFilm  + "|"+
                 author ;
    }


    @BindingAdapter("android:loadImage")
    public static void loadImage(ImageView imageView, String imageUrl) {
        Glide.with(imageView)
                .load(imageUrl)
                .into(imageView);
    }

    public int onClickLogin() {
        this.numTym.set(this.numTym.get()+1);
        return this.numTym.get();
    }
}
