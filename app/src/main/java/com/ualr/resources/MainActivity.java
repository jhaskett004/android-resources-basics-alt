package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.res.Resources;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity{

    private TextView country_description_text;
    private Button lesson_learnt_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_description_text = findViewById(R.id.country_description_text);
        lesson_learnt_button = findViewById(R.id.lesson_learnt_button);

        Resources res = getResources();
        String description = res.getString(R.string.country_description_text);
        country_description_text.setText(description);
    }

    public void onLessonLearntClicked(View view) {
        Resources res = getResources();
        lesson_learnt_button.setBackgroundColor(res.getColor(R.color.colorOnClick));
    }
}


