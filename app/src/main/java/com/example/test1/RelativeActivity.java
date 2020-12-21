package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_main);

        Intent intent = getIntent();

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(view.getContext(),ConstraintActivity.class);
                view.getContext().startActivity(intent1);
            }
        });
    }

    /*public void sendMessage2(View view) {
        Intent intent = new Intent(this, ConstraintActivity.class);
        this.startActivity(intent);
    }*/

}
