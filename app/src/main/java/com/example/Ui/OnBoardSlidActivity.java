package com.example.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.Ui.databinding.ActivityOnBoardSlidBinding;

public class OnBoardSlidActivity extends AppCompatActivity {
    private ActivityOnBoardSlidBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOnBoardSlidBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        @SuppressLint("SetTextI18n")
        Thread thread = new Thread(() -> {
            for (int i = 4; i >= 0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int finalI = i;
                runOnUiThread(() -> {
                    binding.numberOfSecond.setText(finalI + "");
                });
            }
            finish();
        });
        thread.start();

    }
}