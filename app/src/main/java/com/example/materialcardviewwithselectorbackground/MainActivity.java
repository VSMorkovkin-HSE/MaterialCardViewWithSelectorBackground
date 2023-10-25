package com.example.materialcardviewwithselectorbackground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.materialcardviewwithselectorbackground.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.card1.setOnClickListener(v -> {
            binding.card1.setChecked(!binding.card1.isChecked());
            Toast.makeText(this, "Card1", Toast.LENGTH_SHORT).show();
        });

        binding.card2.setOnClickListener(v -> {
            binding.card2.setChecked(!binding.card2.isChecked());
            Toast.makeText(this, "Card2", Toast.LENGTH_SHORT).show();
        });
    }


}