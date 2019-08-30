package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TrafficActivity extends Activity {

    private ImageView traffic_image;
    private TextView traffic_count; //보행자 시간

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traffic_light);

        traffic_image = (ImageView)findViewById(R.id.traffic_light_image);
        traffic_count = (TextView)findViewById(R.id.traffic_count);

        traffic_image.setImageResource(getIntent().getIntExtra("image",2));

        traffic_count.setText("");
    }
}
