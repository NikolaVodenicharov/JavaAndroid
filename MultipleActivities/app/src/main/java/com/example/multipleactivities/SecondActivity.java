package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("transferData")){
            TextView textView = (TextView) findViewById(R.id.inputTextView);
            String data = getIntent().getExtras().get("transferData").toString();
            textView.setText(data);
        }
    }
}
