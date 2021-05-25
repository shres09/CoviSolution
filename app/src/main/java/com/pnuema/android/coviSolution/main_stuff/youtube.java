package com.pnuema.android.coviSolution.main_stuff;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.pnuema.android.coviSolution.R;

public class youtube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);


        Button button8 = findViewById(R.id.backbro);
        button8.setOnClickListener(v -> openMainActivity());

        Button button9 = findViewById(R.id.button30);
        button9.setOnClickListener(v -> openyoutube2());

    }
    public void openMainActivity() {
        Intent intent = new Intent(this, VideoAct.class);
        startActivity(intent);
    }

    public void openyoutube2() {
        Intent intent = new Intent(this, youtube2.class);
        startActivity(intent);
    }



}
