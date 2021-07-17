package com.votandao.databinding.model;

import android.widget.RatingBar;

import androidx.databinding.BaseObservable;
import androidx.databinding.BindingAdapter;


public class Rate extends BaseObservable {
   private String inputContent;
   private String content;

    public Rate(String inputContent, String content) {
        this.inputContent = inputContent;
        this.content = content;
    }

    public String getInputContent() {
        return inputContent;
    }

    public void setInputContent(String inputContent) {
        this.inputContent = inputContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
