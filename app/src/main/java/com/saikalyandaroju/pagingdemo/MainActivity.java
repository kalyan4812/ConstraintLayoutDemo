package com.saikalyandaroju.pagingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layout;
    private Placeholder placeholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placeholder);
        layout = findViewById(R.id.layout);
        placeholder = findViewById(R.id.placeholder);
    }

    public void swapView(View v) {
        TransitionManager.beginDelayedTransition(layout); // for animation
        placeholder.setContentId(v.getId()); // replaces this view.
    }

    public void next(View view) {
        startActivity(new Intent(this, ConstarintSetActivity.class));
    }
}