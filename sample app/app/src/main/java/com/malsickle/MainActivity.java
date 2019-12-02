package com.malsickle;

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

        Button btn_identify = findViewById(R.id.btn_identify);
        btn_identify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this, ClassifierActivity.class);
              startActivity(intent);
              overridePendingTransition(R.anim.slide_left_entering,R.anim.slide_left_exiting);
              finish();
            }
        });
    }
}
