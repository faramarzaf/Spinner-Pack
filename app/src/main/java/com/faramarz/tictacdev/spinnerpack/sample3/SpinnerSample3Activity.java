package com.faramarz.tictacdev.spinnerpack.sample3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.faramarz.tictacdev.spinnerpack.R;

public class SpinnerSample3Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    String[] countryNames={"Germany","China","Denmark","France","Iran","Spain"};
    int[] flags = {R.drawable.flag_de, R.drawable.flag_cn, R.drawable.flag_dk, R.drawable.flag_fr, R.drawable.flag_ir, R.drawable.flag_es};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_sample3);

        Spinner spin =  findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),flags,countryNames);
        spin.setAdapter(customAdapter);


    }
    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), countryNames[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
