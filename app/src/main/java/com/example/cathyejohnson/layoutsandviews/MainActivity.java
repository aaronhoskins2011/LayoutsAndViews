package com.example.cathyejohnson.layoutsandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    EditText etNumber1;
    EditText etNumber2;
    EditText name;
    EditText gender;
    Button btnName;
    TextView tvName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = (EditText) findViewById(R.id.etNumber1);
        etNumber2 = (EditText) findViewById(R.id.etNumber2);

        btnName = (Button)findViewById(R.id.btnDoMagic);

        tvName = (TextView)findViewById(R.id.tvName);

        btnName.setOnClickListener(  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int etValue1 = parseInt(etNumber1.getText().toString());
                int etValue2 = parseInt(etNumber2.getText().toString());
                int total;
                total = etValue1 + etValue2;
                tvName.setText(String.valueOf(total));
                }
            });
        Log.d(TAG, "onCreate: ");
        
        

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }


    public void secondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        String value = etNumber1.getText().toString();
        intent.putExtra(getString(R.string.KEY_VALUE1),value);
        startActivity(intent);
    }

    public void passInfo(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        Person person = new Person("Bob", "Something");
        intent.putExtra(getString(R.string.KEY_VALUE1), person);
        startActivity(intent);
        intent.setAction("SendingPerson");

    }
}
