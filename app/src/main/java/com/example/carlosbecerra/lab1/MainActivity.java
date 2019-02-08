package com.example.carlosbecerra.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
    }

    //Next Button Method
    public void Next(View view){
        Intent next = new Intent(this, SecondActivity.class);
        next.putExtra("data", et1.getText().toString());
        startActivity(next);
    }
}
