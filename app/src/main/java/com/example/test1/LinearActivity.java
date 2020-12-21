package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_main);
        Button button = findViewById(R.id.Submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RelativeActivity.class);
                view.getContext().startActivity(intent);
            }
        });

    }

   /* public void sendMessage(View view) {
        Intent intent = new Intent(this, RelativeActivity.class);
        this.startActivity(intent);
    }*/

}