package com.example.addcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String name;
    String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = getIntent().getStringExtra("nameOfContact");
        number = getIntent().getStringExtra("numberOfContact");

        TextView textViewName = findViewById(R.id.contactViewId);
        TextView textViewNumber = findViewById(R.id.numberViewId);

        textViewName.setText(name);
        textViewNumber.setText(number);

    }

    public void openDialer(View view) {

        Intent intentDialer = new Intent(ContactsContract.Intents.Insert.ACTION);
        intentDialer.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        intentDialer.putExtra(ContactsContract.Intents.Insert.NAME, name).putExtra(ContactsContract.Intents.Insert.PHONE, number);

        startActivity(intentDialer);
    }
}