package com.pnuema.android.coviSolution.main_stuff;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.pnuema.android.coviSolution.R;

public class VideoAct extends AppCompatActivity {

public CardView c5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);






        c5 = (CardView) findViewById(R.id.c5);
        c5.setOnClickListener(v -> youtube());


    }



    public void youtube() {
        Intent intent = new Intent(this, youtube.class);
        startActivity(intent);
    }




}

