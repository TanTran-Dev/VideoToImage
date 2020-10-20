package com.trantan.videotoimage.ui.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.trantan.videotoimage.R;
import com.trantan.videotoimage.ui.list_video.VideoListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.card_select_video)
    CardView cardSelectVideo;
    @BindView(R.id.card_gallery)
    CardView cardGallery;
    @BindView(R.id.card_slide_show)
    CardView cardSlideShow;
    @BindView(R.id.card_settings)
    CardView cardSettings;
    @BindView(R.id.card_share)
    CardView cardShare;
    @BindView(R.id.card_rating)
    CardView cardRating;
    @BindView(R.id.card_about)
    CardView cardAbout;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        initView();
        initAnimation();
    }

    @Override
    protected void onResume() {
        super.onResume();
        initAnimation();
    }

    private void initView() {
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("");
            toolbarTitle.setText(R.string.app_name);
        }

        cardSelectVideo.setOnClickListener(this);
        cardGallery.setOnClickListener(this);
        cardSlideShow.setOnClickListener(this);
        cardSettings.setOnClickListener(this);
    }

    private void initAnimation() {
        YoYo.with(Techniques.Landing)
                .duration(2000)
                .repeat(0)
                .playOn(cardSelectVideo);

        YoYo.with(Techniques.Pulse)
                .duration(2000)
                .repeat(0)
                .playOn(cardGallery);

        YoYo.with(Techniques.Landing)
                .duration(2000)
                .repeat(0)
                .playOn(cardSlideShow);

        YoYo.with(Techniques.Pulse)
                .duration(2000)
                .repeat(0)
                .playOn(cardSettings);

        YoYo.with(Techniques.Swing)
                .duration(2000)
                .repeat(0)
                .playOn(cardShare);

        YoYo.with(Techniques.Swing)
                .duration(2000)
                .repeat(0)
                .playOn(cardRating);

        YoYo.with(Techniques.Swing)
                .duration(2000)
                .repeat(0)
                .playOn(cardAbout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card_select_video: {
                startActivity(new Intent(this, VideoListActivity.class));
            }
            break;

            case R.id.card_gallery: {

            }
            break;

            case R.id.card_slide_show: {

            }
            break;

            case R.id.card_settings: {

            }
            break;
        }
    }
}