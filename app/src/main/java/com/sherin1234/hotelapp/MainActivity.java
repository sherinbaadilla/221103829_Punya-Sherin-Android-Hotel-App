package com.sherin1234.hotelapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Atur padding biar UI nggak ketutupan status bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Load gambar dari internet ke ImageView
        ImageView beachImage = findViewById(R.id.beachImage);
        String imageUrl = "https://www.joglowisata.com/wp-content/uploads/2019/07/Queen-of-South-Resort-Jogja.jpg";
        Picasso.with(this).load(imageUrl).into(beachImage);
    }
}
