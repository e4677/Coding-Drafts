package com.example.forms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Forms extends AppCompatActivity {
    EditText username, password, email, phone, interest, birthdate, birthtime;
    AutoCompleteTextView country;
    Spinner states;
    Button submit;
    ArrayAdapter<String> arrayAdapter, arrayAdapter1;

    String[] Country = {"India", "Indonesia", "Africa", "Afghanistan"};
    String[] state = {"Gujarat", "Goa", "Maharashtra", "Rajasthan", "Assam", "Bihar", "West Bengal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.regi);
        states = findViewById(R.id.state);
        country = findViewById(R.id.country);

        arrayAdapter = new ArrayAdapter<>(Forms.this, android.R.layout.simple_spinner_item, state);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        states.setAdapter(arrayAdapter);

        arrayAdapter1 = new ArrayAdapter<>(Forms.this, android.R.layout.simple_list_item_1, Country);
        country.setAdapter(arrayAdapter1);
        country.setThreshold(1);  // Start suggesting after 1 character input

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Forms.this, "Registered successfully ... ",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
