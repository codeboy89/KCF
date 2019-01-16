package com.example.oilfi.kcf;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SiteSetup extends AppCompatActivity implements View.OnClickListener {
    private ReadExcel readExcel;
    private ArrayList<Pump_Audit> pumpArrayList;
    private Spinner DistricsSpinner, FleetSpinner, RotationSpinner, ShiftSpinner, AuditTypeSpinner;
    private Button Continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	    //////Setting up Activity///////////////////////////////////////////////////////////////////
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_setup);
	    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	    //////Receiving Intent Extras///////////////////////////////////////////////////////////////
        Intent intent = getIntent();
        this.readExcel = intent.getParcelableExtra("ReadExcel");
        pumpArrayList = (ArrayList<Pump_Audit>) getIntent().getSerializableExtra("pump");
	    //////Setting up Interface//////////////////////////////////////////////////////////////////
        DistricsSpinner = findViewById(R.id.DistrictSpinner);
        FleetSpinner = findViewById(R.id.FleetSpinner);
        RotationSpinner = findViewById(R.id.RotationSpinner);
        ShiftSpinner = findViewById(R.id.ShiftSpinner);
        AuditTypeSpinner = findViewById(R.id.AuditTypeSpinner);
        Continue = findViewById(R.id.ContinueButton);
	    ///////Setting OnClickListener for button///////////////////////////////////////////////////
        Continue.setOnClickListener(this);
	    ///////Populating Array Adapters/////////////////////////////////////////////////////////////
        String[] districsArray = {"Elk City", "Shreveport", "Aledo", "Longview", "Pleasington", "Odessa", "Eighty Four"};
	    ArrayAdapter<String> DistricsSpinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, districsArray);
        DistricsSpinnerArrayAdapter.setDropDownViewResource(R.layout.spinner);
        DistricsSpinner.setAdapter(DistricsSpinnerArrayAdapter);

        String[] fleetArray = {"Fleet 1", "Fleet 2", "Fleet 3", "Fleet 4", "Fleet 5", "Fleet 6"};
	    ArrayAdapter<String> FleetSpinnerSpinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fleetArray);
        FleetSpinnerSpinnerArrayAdapter.setDropDownViewResource(R.layout.spinner);
        FleetSpinner.setAdapter(FleetSpinnerSpinnerArrayAdapter);
	
	    String[] rotationArray = {"Red Crew", "Green Crew", "Blue Crew"};
	    ArrayAdapter<String> RotationSpinnerSpinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, rotationArray);
        RotationSpinnerSpinnerArrayAdapter.setDropDownViewResource(R.layout.spinner);
        RotationSpinner.setAdapter(RotationSpinnerSpinnerArrayAdapter);

        String[] shiftArray = {"Days", "Nights"};
	    ArrayAdapter<String> ShiftSpinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, shiftArray);
        ShiftSpinnerArrayAdapter.setDropDownViewResource(R.layout.spinner);
        ShiftSpinner.setAdapter(ShiftSpinnerArrayAdapter);

        String[] auditTyprArray = {"New", " Update"};
	    ArrayAdapter<String> AuditTypeSpinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, auditTyprArray);
        AuditTypeSpinnerArrayAdapter.setDropDownViewResource(R.layout.spinner);
        AuditTypeSpinner.setAdapter(AuditTypeSpinnerArrayAdapter);

    }

    @Override
    public void onClick(View v) {
	    ///////OnClick read Values////////////////////////////////////////////////////////////////
	    // readExcel.getAudit().setDISTRICT_NAME(DistricsSpinner.getSelectedItem().toString().toUpperCase());
	    // readExcel.getAudit().setFLEET_NAME(FleetSpinner.getSelectedItem().toString().toUpperCase());
	    // readExcel.getAudit().setROTATION(RotationSpinner.getSelectedItem().toString().toUpperCase());
	    // readExcel.getAudit().setSHIFT(ShiftSpinner.getSelectedItem().toString().toUpperCase());
	    // readExcel.getAudit().setAUDIT_TYPE(AuditTypeSpinner.getSelectedItem().toString().toUpperCase());
	    //////Setting up new intent///////////////////////////////////////////////////////////////
	    Intent myIntent = new Intent(SiteSetup.this, StationSelect.class);
        myIntent.putExtra("ReadExcel", readExcel); //Optional parameters
	    myIntent.putExtra("pump", pumpArrayList);
        startActivity(myIntent);
    }
}
