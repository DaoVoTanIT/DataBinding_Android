package com.votandao.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.votandao.databinding.databinding.ActivityFeedBackBinding;

import java.util.ArrayList;
import java.util.List;

public class FeedBack extends AppCompatActivity {
    ActivityFeedBackBinding activityFeedBackBinding;
    private RatingBar ratingBarYours;


    private TextView textViewYourCurrentRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
         activityFeedBackBinding = DataBindingUtil.setContentView(this, R.layout.activity_feed_back);
        this.ratingBarYours = (RatingBar) this.findViewById(R.id.ratingBar_yours);

        this.textViewYourCurrentRating = (TextView) this.findViewById(R.id.textView_yourCurrentRating);

        this.ratingBarYours.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textViewYourCurrentRating.setText("Your current Rating: " + rating);
                Toast.makeText(FeedBack.this, String.valueOf(rating), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void contentRated(View view){
        activityFeedBackBinding.txtContent.setText(activityFeedBackBinding.edtContent.getText().toString());
    }
}