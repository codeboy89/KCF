package com.example.oilfi.kcf;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private Button ScanUnitButton, ScanSensorButton, SaveButton, DeleteButton;
    private TextView UnitNumber, PESerialNumber, FESerialNumber, FEHole1Number, FEHole5Number, PEHole1Number, PEHole5Number;
    private RadioButton FEHole1Radio, FEHole5Radio, PEHole1Radio, PEHole5Radio;
    private FormData formData;
    private Pump_Audit pump_audit;
    private IntentIntegrator qrScanUnit;
    private IntentIntegrator qrScanSensor;
    private ReadExcel readExcel;
    private String Unit = "53q-####";
    private String Powerend = "##########";
    private String Fluidend = "##########";
    private String PowerendHole1 = "0000####";
    private String PowerendHole5 = "0000####";
    private String FluidendHole1 = "0000####";
    private String FluidendHole5 = "0000####";
    private int station = 0;
    private boolean ScanUnit = false;
    private boolean ScanSensor = false;
    private boolean DampenerPSI;
    private boolean DampenerPressureGuage;
    private ArrayList<Pump_Audit> pumpArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Intent intent = getIntent();
        readExcel = intent.getParcelableExtra("ReadExcel");
        station = intent.getIntExtra("station", 0);
        pumpArrayList = (ArrayList<Pump_Audit>) getIntent().getSerializableExtra("pump");
        Context context;
        Init();
    }

    private void Init()
    {
        pump_audit = pumpArrayList.get(station);
        this.Unit = pump_audit.getPUMP_NAME();
        this.Powerend = pump_audit.getPUMP_PE_SERIAL_NUMBER();
        this.Fluidend = pump_audit.getPUMP_FE_SERIAL_NUMBER();
        this.PowerendHole1 = pump_audit.getPUMP_PE_HOLE_NUMBER_1();
        this.PowerendHole5 = pump_audit.getPUMP_PE_HOLE_NUMBER_5();
        this.FluidendHole1 = pump_audit.getPUMP_FE_HOLE_NUMBER_1();
        this.FluidendHole5 = pump_audit.getPUMP_FE_HOLE_NUMBER_5();

    ScanSensorButton = findViewById(R.id.ScanSensorButton);
    ScanUnitButton = findViewById(R.id.ScanUnitButton);
    DeleteButton = findViewById(R.id.DeleteButton);
    SaveButton = findViewById(R.id.SaveButton);

    UnitNumber = findViewById(R.id.UnitNumber);
    PESerialNumber = findViewById(R.id.PESerialNumber);
    FESerialNumber = findViewById(R.id.FESerialNumber);
    FEHole1Number = findViewById(R.id.FEHole1Number);
    FEHole5Number = findViewById(R.id.FEHole5Number);
    PEHole1Number = findViewById(R.id.PEHole1Number);
    PEHole5Number = findViewById(R.id.PEHole5Number);

    FEHole1Radio = findViewById(R.id.FEHole1Radio);
    FEHole5Radio = findViewById(R.id.FEHole5Radio);
    PEHole1Radio = findViewById(R.id.PEHole1Radio);
    PEHole5Radio = findViewById(R.id.PEHole5Radio);

    qrScanSensor = new IntentIntegrator(this);
    qrScanUnit = new IntentIntegrator(this);

    ScanSensorButton.setOnClickListener(this);
    ScanUnitButton.setOnClickListener(this);
    SaveButton.setOnClickListener(this);
    DeleteButton.setOnClickListener(this);

    FEHole1Radio.setOnClickListener(this);
    FEHole5Radio.setOnClickListener(this);
    PEHole1Radio.setOnClickListener(this);
    PEHole5Radio.setOnClickListener(this);

    UnitNumber.setOnLongClickListener(this);
    PESerialNumber.setOnLongClickListener(this);
    FESerialNumber.setOnLongClickListener(this);
    FEHole1Number.setOnLongClickListener(this);
    FEHole5Number.setOnLongClickListener(this);
    PEHole1Number.setOnLongClickListener(this);
    PEHole5Number.setOnLongClickListener(this);


    formData = new FormData(this.Unit,
            this.Powerend,
            this.Fluidend,
            this.PowerendHole1,
            this.PowerendHole5,
            this.FluidendHole1,
            this.FluidendHole5,
            this.DampenerPSI,
            this.DampenerPressureGuage);

    UnitNumber.setText(this.Unit);
    PESerialNumber.setText(this.Powerend);
    FESerialNumber.setText(this.Fluidend);
    PEHole1Number.setText(this.PowerendHole1);
    PEHole5Number.setText(this.PowerendHole5);
    FEHole1Number.setText(this.FluidendHole1);
    FEHole5Number.setText(this.FluidendHole5);
}
    private void Save()
    {
        FormData formData = new FormData();
        formData.setUnit(UnitNumber.getText().toString().toUpperCase());
        formData.setFluidend(PESerialNumber.getText().toString().toUpperCase());
        formData.setPowerend(FESerialNumber.getText().toString().toUpperCase());
        formData.setFluidendHole1(FEHole1Number.getText().toString().toUpperCase());
        formData.setFluidendHole5(FEHole5Number.getText().toString().toUpperCase());
        formData.setPowerendHole1(PEHole1Number.getText().toString().toUpperCase());
        formData.setPowerendHole5(PEHole5Number.getText().toString().toUpperCase());
        formData.setDampenerPressureGuage(false);
        formData.setDampenerPSI(false);
        pump_audit.setPUMP_NAME(formData.getUnit());
        pump_audit.setPUMP_PE_SERIAL_NUMBER(formData.getPowerend());
        pump_audit.setPUMP_FE_SERIAL_NUMBER(formData.getFluidendHole1());
        pump_audit.setPUMP_FE_HOLE_NUMBER_1(formData.getFluidendHole1());
        pump_audit.setPUMP_FE_HOLE_NUMBER_5(formData.getFluidendHole5());
        pump_audit.setPUMP_PE_HOLE_NUMBER_1(formData.getPowerendHole1());
        pump_audit.setPUMP_PE_HOLE_NUMBER_5(formData.getPowerendHole5());
        pump_audit.setPUMP_NAME(formData.getUnit());
        pump_audit.setPUMP_PE_SERIAL_NUMBER(formData.getPowerend());
        pump_audit.setPUMP_FE_SERIAL_NUMBER(formData.getFluidendHole1());
        pump_audit.setPUMP_FE_HOLE_NUMBER_1(formData.getFluidendHole1());
        pump_audit.setPUMP_FE_HOLE_NUMBER_5(formData.getFluidendHole5());
        pump_audit.setPUMP_PE_HOLE_NUMBER_1(formData.getPowerendHole1());
        pump_audit.setPUMP_PE_HOLE_NUMBER_5(formData.getPowerendHole5());

        SQL sql = new SQL();
        Toast.makeText(this, "sql init", Toast.LENGTH_LONG).show();
        sql.connect();
        Toast.makeText(this, "connected", Toast.LENGTH_LONG).show();

            Toast.makeText(this, sql.getDatas() , Toast.LENGTH_LONG).show();


    }
    private void Delete()
    {
        UnitNumber.setText("");
        PESerialNumber.setText("");
        FESerialNumber.setText("");
        PEHole1Number.setText("");
        PEHole5Number.setText("");
        FEHole1Number.setText("");
        FEHole5Number.setText("");

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            //if qrcode has nothing in it
            //if qr contains data
            if (result.getContents() == null) {
                Toast.makeText(this, "Result Not Found", Toast.LENGTH_LONG).show();
            } else {
                if(FEHole1Radio.isChecked() & ScanSensor) {
                    FEHole1Number.setText(result.getContents());
                }
                if(FEHole5Radio.isChecked() & ScanSensor) {
                    FEHole5Number.setText(result.getContents());
                }
                if(PEHole1Radio.isChecked()& ScanSensor) {
                    PEHole1Number.setText(result.getContents());
                }
                if(PEHole5Radio.isChecked()& ScanSensor) {
                    PEHole5Number.setText(result.getContents());
                }
                if(ScanUnit)
                {
                    UnitNumber.setText(result.getContents());
                }

                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                ScanUnit = false;
                ScanSensor = false;
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onClick(View v) {


        int id = v.getId();
        if (id == R.id.ScanSensorButton) {
            ScanSensor = true;
            qrScanSensor.initiateScan();
        } else if (id == R.id.ScanUnitButton) {
            ScanUnit = true;
            qrScanUnit.initiateScan();
        } else if (id == R.id.DeleteButton) {
            Delete();
        } else if (id == R.id.SaveButton) {
            Save();
        }
    }

    @Override
    public boolean onLongClick(View v) {

        int id = v.getId();

        if (id == R.id.FEHole1Number)
        {
            manual(FEHole1Number);
        }
        if (id == R.id.FEHole5Number)
        {
            manual(FEHole5Number);
        }
        if (id == R.id.PEHole1Number)
        {
            manual(PEHole1Number);
        }
        if (id == R.id.PEHole5Number)
        {
            manual(PEHole5Number);
        }
        if (id == R.id.UnitNumber)
        {
            manual(UnitNumber);
        }
        if (id == R.id.PESerialNumber)
        {
            manual(PESerialNumber);
        }
        if (id == R.id.FESerialNumber)
        {
            manual(FESerialNumber);
        }

        return false;
    }

    public void manual(final TextView textView) {
        Toast.makeText(getApplicationContext(), "Dialog opening", Toast.LENGTH_SHORT).show();

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Manual Entry");
        if (textView == FEHole1Number) {
            alertDialog.setMessage("FE HOLE 1");
        }
        if (textView == FEHole5Number) {
            alertDialog.setMessage("FE HOLE 5");
        }
        if (textView == PEHole1Number) {
            alertDialog.setMessage("PE HOLE 1");
        }
        if (textView == PEHole5Number) {
            alertDialog.setMessage("PE HOLE 5");
        }
        if (textView == UnitNumber) {
            alertDialog.setMessage("UNIT NUMBER");
        }
        if (textView == PESerialNumber) {
            alertDialog.setMessage("PE SERIAL#");
        }
        if (textView == FESerialNumber) {
            alertDialog.setMessage("FE SERIAL#");
        }

        final EditText input = new EditText(MainActivity.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        alertDialog.setView(input);

        alertDialog.setPositiveButton("Save",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (textView == FEHole1Number) {
                            alertDialog.setMessage("FE HOLE 1");
                            FEHole1Number.setText(input.getText().toString().toUpperCase());
                            Toast.makeText(getApplicationContext(), "Saving", Toast.LENGTH_SHORT).show();
                        }
                        if (textView == FEHole5Number) {
                            FEHole5Number.setText(input.getText().toString().toUpperCase());
                            Toast.makeText(getApplicationContext(), "Saving", Toast.LENGTH_SHORT).show();
                        }
                        if (textView == PEHole1Number) {
                            PEHole1Number.setText(input.getText().toString().toUpperCase());
                            Toast.makeText(getApplicationContext(), "Saving", Toast.LENGTH_SHORT).show();
                        }
                        if (textView == PEHole5Number) {
                            PEHole5Number.setText(input.getText().toString().toUpperCase());
                            Toast.makeText(getApplicationContext(), "Saving", Toast.LENGTH_SHORT).show();
                        }
                        if (textView == UnitNumber) {
                            UnitNumber.setText(input.getText().toString().toUpperCase());
                            Toast.makeText(getApplicationContext(), "Saving", Toast.LENGTH_SHORT).show();
                        }
                        if (textView == PESerialNumber) {
                            PESerialNumber.setText(input.getText().toString().toUpperCase());
                            Toast.makeText(getApplicationContext(), "Saving", Toast.LENGTH_SHORT).show();
                        }
                        if (textView == FESerialNumber) {
                            FESerialNumber.setText(input.getText().toString().toUpperCase());
                            Toast.makeText(getApplicationContext(), "Saving", Toast.LENGTH_SHORT).show();
                        }
                    }

                });
            alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog
                dialog.cancel();
            }
        });

        // closed

        // Showing Alert Message
        alertDialog.show();


    }
}
