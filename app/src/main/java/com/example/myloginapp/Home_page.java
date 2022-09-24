package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_page extends AppCompatActivity {
    private Button moved;
    private Button mover;
    private Button moveYou;
    private Button moveGift;
    private Button moveSet;
    private Button moveExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        moved=findViewById(R.id.Home);
        moved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home_page.this,BirthdayWishes.class);
                startActivity(intent);
            }
        });

        mover=findViewById(R.id.Chat);
        mover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home_page.this,ChatPage.class);
                startActivity(intent);
            }
        });


        moveYou=findViewById(R.id.You);
        moveYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home_page.this,ItzYou.class);
                startActivity(intent);
            }
        });

        moveGift=findViewById(R.id.Gifts);
        moveGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home_page.this,Gifts.class);
                startActivity(intent);
            }
        });


        moveSet=findViewById(R.id.Settings);
        moveSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home_page.this,Set.class);
                startActivity(intent);
            }
        });

        moveExit=findViewById(R.id.Logout);
        moveExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home_page.this,Exit.class);
                startActivity(intent);
            }
        });


    }

}



