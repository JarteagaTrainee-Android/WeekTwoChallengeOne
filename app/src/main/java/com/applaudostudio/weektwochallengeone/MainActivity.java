package com.applaudostudio.weektwochallengeone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView callButton;

        callButton = findViewById(R.id.imageViewCall);

        callButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
         Intent intent;

        switch (v.getId()) {
            case R.id.imageViewCall:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+"+503 79866986"));
                startActivity(intent);
        }
    }



}
