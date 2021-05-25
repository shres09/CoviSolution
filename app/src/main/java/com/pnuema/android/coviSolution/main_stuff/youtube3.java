package com.pnuema.android.coviSolution.main_stuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.pnuema.android.coviSolution.R;

public class youtube3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube3);


        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> openyoutube2());
    }

    public void openyoutube2() {
        Intent intent = new Intent(this, youtube2.class);
        startActivity(intent);
    }
}