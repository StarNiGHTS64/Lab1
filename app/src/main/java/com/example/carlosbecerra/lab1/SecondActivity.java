package com.example.carlosbecerra.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = (TextView)findViewById(R.id.tv1);

        String data = getIntent().getStringExtra("data");
        tv1.setText("Hello " + data);

    }

    //Back Button Method
    public void Back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }

}
