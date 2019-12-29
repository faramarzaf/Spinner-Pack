package com.faramarz.tictacdev.spinnerpack.sample2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.faramarz.tictacdev.spinnerpack.R;

public class SpinnerSample2Activity extends AppCompatActivity {
    Spinner spinner;
    ArrayAdapter<String> countryCodeAdapter;
    String[] countryCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_sample2);
        spinner = findViewById(R.id.codeSpinner);

        countryCodes = getResources().getStringArray(R.array.codes);
        countryCodeAdapter = new ArrayAdapter<>(this, R.layout.code_spinner_layout, R.id.textView, countryCodes);
        spinner.setAdapter(countryCodeAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String code = String.valueOf(spinner.getSelectedItem());
                Toast.makeText(SpinnerSample2Activity.this, code, Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    spinner.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}
