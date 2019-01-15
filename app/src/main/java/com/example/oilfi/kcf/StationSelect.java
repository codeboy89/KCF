package com.example.oilfi.kcf;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StationSelect extends AppCompatActivity implements View.OnClickListener {
//private Spinner spinner;
private Button continueButton;

    private ReadExcel readExcel;
    private Pump_Audit pump_audit;
    private ArrayList<Pump_Audit> pumpArrayList;
    private ArrayList<String> unitList = new ArrayList<>();
    private ArrayList<String> stationList = new ArrayList<>();


    private int station;
    private RecyclerView recyclerView;
    private StationAdapter adapter;

    public  void setStation(int position) {
        this.station = position;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_select);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Intent intent = getIntent();
        readExcel = intent.getParcelableExtra("ReadExcel");
        pumpArrayList = (ArrayList<Pump_Audit>) getIntent().getSerializableExtra("pump");
    initList();

        continueButton = findViewById(R.id.ContinueStation);
      /*  spinner = findViewById(R.id.spinnerStation);

        String[] stationArray = {"1", "2", "3", "4", "5", "6", "7"};
        ArrayAdapter<String> stationSpinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stationArray );
        stationSpinnerArrayAdapter.setDropDownViewResource(R.layout.spinner);
        spinner.setAdapter(stationSpinnerArrayAdapter);
        */
        continueButton.setOnClickListener(this);

    }
private void initList()
{
    for (int i = 1; i < pumpArrayList.size(); i++) {
        unitList.add(pumpArrayList.get(i).getPUMP_NAME());
        stationList.add(pumpArrayList.get(i).getSTATION());
    }
    initRecyclerView();
    }

    private void initRecyclerView()
    {
        recyclerView = findViewById(R.id.StationRecycler);
        adapter = new StationAdapter(unitList, stationList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View v) {
        int station = adapter.getStationSelected() + 1;
        Intent myIntent = new Intent(StationSelect.this , MainActivity.class);
        myIntent.putExtra("Read_Excel", readExcel); //Optional parameters
        myIntent.putExtra("pump",pumpArrayList);
        myIntent.putExtra("station", station);
        startActivity(myIntent);
    }
}
