package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //보행자 버튼
    public void walker_button(View view){
        Intent intent = new Intent(getApplicationContext(), TrafficActivity.class);
        intent.putExtra("image", R.drawable.walker_green2); // 이미지 뿌리기
        startActivity(intent);
    }

    //자동차 버튼
    public void car_button(View view){
        Intent intent = new Intent(getApplicationContext(), TrafficActivity.class);
        intent.putExtra("image",R.drawable.car_green3); // 이미지 뿌리기
        startActivity(intent);
    }

}
