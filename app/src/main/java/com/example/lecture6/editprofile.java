package com.example.lecture6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class editprofile extends AppCompatActivity {

    private Spinner spinnerCountry;
    private Spinner spinnerCity;
    private String selectedCountry;
    private boolean isCountrySelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        // Find the Spinners by their IDs
        spinnerCountry = findViewById(R.id.spinnerCountry);
        spinnerCity = findViewById(R.id.spinnerCity);

        // Create an ArrayAdapter for the country Spinner
        ArrayAdapter<CharSequence> countryAdapter = ArrayAdapter.createFromResource(
                this, R.array.countries_array, android.R.layout.simple_spinner_item);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCountry.setAdapter(countryAdapter);

        // Set a listener for the country Spinner to enable/disable the city Spinner
        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                selectedCountry = parentView.getItemAtPosition(position).toString();
                if (selectedCountry.equals("Select a country")) {
                    isCountrySelected = false;
                    spinnerCity.setEnabled(false);
                } else {
                    isCountrySelected = true;
                    spinnerCity.setEnabled(true);
                    updateCitySpinner(selectedCountry);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }
        });

        // Create an ArrayAdapter for the city Spinner (initially empty)
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCity.setAdapter(cityAdapter);

    }

    private void updateCitySpinner(String country) {
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Populate the cityAdapter based on the selected country
        if (country.equals("Pakistan")) {
            cityAdapter.addAll("Karachi", "Lahore", "Islamabad");
        } else if (country.equals("India")) {
            cityAdapter.addAll("Delhi", "Mumbai", "Bangalore");
        } else if (country.equals("UAE")) {
            cityAdapter.addAll("Dubai", "Abu Dhabi", "Sharjah");
        }

        spinnerCity.setAdapter(cityAdapter);
    }

}