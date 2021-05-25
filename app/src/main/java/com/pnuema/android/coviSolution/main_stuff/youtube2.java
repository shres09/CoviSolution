package com.pnuema.android.coviSolution.main_stuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.pnuema.android.coviSolution.R;

public class youtube2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube2);

        Button button4 = findViewById(R.id.button40);
        button4.setOnClickListener(v -> openyoutube());

        Button button5 = findViewById(R.id.button50);
        button5.setOnClickListener(v -> openyoutube3());
    }

    public void openyoutube() {
        Intent intent = new Intent(this, youtube.class);
        startActivity(intent);
    }

    public void openyoutube3() {
        Intent intent = new Intent(this, youtube3.class);
        startActivity(intent);
    }

}