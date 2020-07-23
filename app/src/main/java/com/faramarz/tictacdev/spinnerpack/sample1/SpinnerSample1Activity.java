package com.faramarz.tictacdev.spinnerpack.sample1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.faramarz.tictacdev.spinnerpack.R;

import java.util.ArrayList;
import java.util.List;

public class SpinnerSample1Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner, spinner2, spinner3, spinner4;
    String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_sample1);
        bind();
        clickEvents();
        setSpinner1Data();
        setSpinner2Data();
        setSpinner3Data();
        setSpinner4Data();

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (view.getId()) {
            case R.id.spinner:
            case R.id.spinner3:
            case R.id.spinner2:
                item = parent.getItemAtPosition(position).toString();
                Toast.makeText(this, "Selected: " + item, Toast.LENGTH_SHORT).show();
                break;

        }

    }

    public void onNothingSelected(AdapterView<?> arg0) {

    }

    private void bind() {
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);

    }

    private void clickEvents() {

        spinner.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);
    }

    private void setSpinner1Data() {
        // Spinner Drop down elements
        List<String> categories = new ArrayList<>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }


    private void setSpinner2Data() {
        List<String> categories = new ArrayList<>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        spinner2.setPrompt("Seeeeeeeeee");
        spinner2.setAdapter(dataAdapter);

    }


    private void setSpinner3Data() {
        List<String> categories = new ArrayList<>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.test_list_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.test_list_item);
        spinner3.setAdapter(dataAdapter);
    }

    private void setSpinner4Data() {
        List<String> categories = new ArrayList<>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.preference_category, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.preference_category);
        spinner4.setAdapter(dataAdapter);
    }

}

