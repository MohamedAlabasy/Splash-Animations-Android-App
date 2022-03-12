package com.example.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.Ui.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private static final int SPLASH_SCREEN = 2000;
    Animation topAnimation, bottomAnimation, middleAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middel_anemtion);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_anmetion);


        binding.firstLine.setAnimation(topAnimation);
        binding.secondLine.setAnimation(topAnimation);
        binding.thirdLine.setAnimation(topAnimation);
        binding.fourthLine.setAnimation(topAnimation);
        binding.fifthLine.setAnimation(topAnimation);
        binding.sixthLine.setAnimation(topAnimation);

        binding.TextViewA.setAnimation(middleAnimation);
        binding.textViewAndroid.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, OnBoardSlidActivity.class));
                finish();
            }
        }, SPLASH_SCREEN);

    }
}