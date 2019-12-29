package com.faramarz.tictacdev.spinnerpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.faramarz.tictacdev.spinnerpack.sample1.SpinnerSample1Activity;
import com.faramarz.tictacdev.spinnerpack.sample2.SpinnerSample2Activity;
import com.faramarz.tictacdev.spinnerpack.sample3.SpinnerSample3Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button spinnerSample1, spinnerSample2, spinnerSample3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind();
        clickEvents();
    }


    private void bind() {
        spinnerSample1 = findViewById(R.id.spinnerSample1);
        spinnerSample2 = findViewById(R.id.spinnerSample2);
        spinnerSample3 = findViewById(R.id.spinnerSample3);
    }


    private void clickEvents() {

        spinnerSample1.setOnClickListener(this);
        spinnerSample2.setOnClickListener(this);
        spinnerSample3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.spinnerSample1:
                startActivity(new Intent(this, SpinnerSample1Activity.class));
                break;

            case R.id.spinnerSample2:
                startActivity(new Intent(this, SpinnerSample2Activity.class));
                break;


            case R.id.spinnerSample3:
                startActivity(new Intent(this, SpinnerSample3Activity.class));
                break;
        }


    }


}
