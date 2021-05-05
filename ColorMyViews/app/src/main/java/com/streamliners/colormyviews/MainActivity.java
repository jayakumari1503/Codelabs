package com.streamliners.colormyviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.streamliners.colormyviews.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //setup event handlers
        setupEventHandlers();
    }

    private void setupEventHandlers() {
        //list all the clickableViews
        List<View> clickableViews = new ArrayList<>(
                Arrays.asList(binding.boxOneText, binding.boxTwoText,
                        binding.boxThreeText, binding.boxFourText,
                        binding.boxFiveText, binding.constraintLayout,
                        binding.redButton, binding.yellowButton, binding.greenButton)

        );

        //using loop set on click listener to all views
        for (View item : clickableViews) {
            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    makeColored(item);
                }
            });
        }
    }

    private void makeColored(View view) {
        //Boxes using color class colors for the background
        if(view.getId() == binding.boxOneText.getId()) {
            view.setBackgroundColor(Color.DKGRAY);
        }

        else if(view.getId() == binding.boxTwoText.getId()) {
            view.setBackgroundColor(Color.GRAY);
        }
        else if(view.getId() == binding.boxThreeText.getId()) {
            view.setBackgroundColor(Color.BLUE);
        }
        else if(view.getId() == binding.boxFourText.getId()) {
            view.setBackgroundColor(Color.MAGENTA);
        }
        else if(view.getId() == binding.boxFiveText.getId()) {
            view.setBackgroundColor(Color.BLUE);
        }
        else if(view.getId() == binding.redButton.getId()) {
            binding.boxThreeText.setBackgroundColor(getResources().getColor(R.color.my_red));
        }
        else if(view.getId() == binding.yellowButton.getId()) {
            binding.boxFourText.setBackgroundColor(getResources().getColor(R.color.my_yellow));
        }
        else if(view.getId() == binding.greenButton.getId()) {
            binding.boxFiveText.setBackgroundColor(getResources().getColor(R.color.my_green));
        }
        else {
            view.setBackgroundColor(Color.LTGRAY);
        }
    }
    }