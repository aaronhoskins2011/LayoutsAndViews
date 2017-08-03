package com.example.cathyejohnson.layoutsandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "Second";
    TextView tvPassed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Log.d(TAG, "onCreate: " + intent.getStringExtra(getString(R.string.KEY_VALUE1)));

        switch(intent.getAction()){
            case "sendingPerson":
                Person person = (Person) intent.getSerializableExtra("person");
                tvPassed = (TextView)findViewById(R.id.tvPassed);
                tvPassed.setText(person.getName());
                break;
            case "sendingValue":
                tvPassed = (TextView)findViewById(R.id.tvPassed);
                tvPassed.setText(getString(R.string.KEY_VALUE1));

        }
        tvPassed = (TextView)findViewById(R.id.tvPassed);
        tvPassed.setText(getString(R.string.KEY_VALUE1));

    }
}
