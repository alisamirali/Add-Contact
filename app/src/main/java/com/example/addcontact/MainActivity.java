package com.example.addcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayInfo(View view) {
        EditText editName = findViewById(R.id.nameId);
        EditText editNumber = findViewById(R.id.mobileId);

        String name = editName.getText().toString();
        String number = editNumber.getText().toString();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("nameOfContact", name);
        intent.putExtra("numberOfContact", number);
        startActivity(intent);

    }
}