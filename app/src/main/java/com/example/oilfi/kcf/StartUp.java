package com.example.oilfi.kcf;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class StartUp extends AppCompatActivity implements View.OnClickListener {

    private Audits audits;
    private final String usernameString = "admin";
    private final String passwordString = "test";
    EditText username;
    EditText password;
    ReadExcel readExcel;

    private ArrayList<Pump_Audit> pumpArrayList;
    Button login;
    private InputStream is;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        is = getResources().openRawResource(R.raw.audit);
        readExcel = new ReadExcel();
        readExcel.setIS(is);
        readExcel.read();
        pumpArrayList = readExcel.getPumpArrayList();
        Toast.makeText(this, pumpArrayList.toString(), Toast.LENGTH_SHORT).show();
        username = findViewById(R.id.UsernameEditText);
        password = findViewById(R.id.PasswordEditText);
        login = findViewById(R.id.LoginButton);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(username.getText().toString().toLowerCase().equals(usernameString)) {
            if (password.getText().toString().toLowerCase().equals(passwordString)) {
                Toast.makeText(this, "Valid Login", Integer.parseInt("100")).show();
                Intent myIntent = new Intent(StartUp.this , SiteSetup.class);
                myIntent.putExtra("ReadExcel", this.readExcel);//Optional parameters
                myIntent.putExtra("pump",pumpArrayList);
                startActivity(myIntent);
            }
        }
            if(username.getText().toString().toLowerCase().equals(usernameString)) {
            if (!(password.getText().toString().toLowerCase().equals(passwordString))) {
                Toast.makeText(this, "Incorrect Password", Integer.parseInt("1000")).show();
                password.setText("");
            }
            }else if(!username.getText().toString().toLowerCase().equals(usernameString)) {
                Toast.makeText(this, "Incorrect Username", Integer.parseInt("1000")).show();
                password.setText("");
                username.setText("");
            }

        }
}


