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
    
    private final String usernameString = "admin";
    private final String passwordString = "test";
    EditText username;
    EditText password;
    ReadExcel readExcel;
    FirebaseHelper firebaseHelper;
    Button login;
    private ArrayList<Pump_Audit> pumpArrayList;
    private InputStream is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /////Activity Setup////////////////////////////////////////////////////////////
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        /////Opening audit.xls/////////////////////////////////////////////////////////
        is = getResources().openRawResource(R.raw.audit);
        /////Reading Audit.xls/////////////////////////////////////////////////////////
        readExcel = new ReadExcel();
        readExcel.setIS(is);
        readExcel.read();
        /////Setting PumpArrayList from file///////////////////////////////////////////
        pumpArrayList = readExcel.getPumpArrayList();
        /////Setting up Interface//////////////////////////////////////////////////////
        username = findViewById(R.id.UsernameEditText);
        password = findViewById(R.id.PasswordEditText);
        login = findViewById(R.id.LoginButton);
        login.setOnClickListener(this);
        FirebaseHelper firebaseHelper = new FirebaseHelper();
        firebaseHelper.insert(readExcel.getPumpArrayList().get(5));
        
    
    }

    @Override
    public void onClick(View v) {
        /////Correct Login//////////////////////////////////////////////////////////////
        if (username.getText().toString().toLowerCase().equals(usernameString)) {
            if (password.getText().toString().toLowerCase().equals(passwordString)) {
                Intent myIntent = new Intent(StartUp.this, SiteSetup.class);
                myIntent.putExtra("ReadExcel", this.readExcel);//Optional parameters
                myIntent.putExtra("pump", pumpArrayList);
                startActivity(myIntent);
            }
        }
        /////Incorrect Password//////////////////////////////////////////////////////////////
        if (username.getText().toString().toLowerCase().equals(usernameString)) {
            if (!(password.getText().toString().toLowerCase().equals(passwordString))) {
                Toast.makeText(this, "Incorrect Password", Integer.parseInt("1000")).show();
                password.setText("");
            }
        }
        /////Incorrect Username//////////////////////////////////////////////////////////////
        else if (!username.getText().toString().toLowerCase().equals(usernameString)) {
            Toast.makeText(this, "Incorrect Username", Integer.parseInt("1000")).show();
            password.setText("");
            username.setText("");
        }
    
    }
}


