package com.example.oilfi.kcf;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_AUDIT = "audit";
    private String VALUES = ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    private String PUMP_NAME = "PUMP_NAME";
    private String PUMP_PE_SERIAL_NUMBER = "PUMP_PE_SERIAL_NUMBER";
    private String PUMP_SERIAL_NUMBER = "PUMP_SERIAL_NUMBER";
    private String PUMP_FE_HOLE_NUMBER_1 = "PUMP_FE_HOLE_NUMBER_1";
    private String PUMP_FE_HOLE_NUMBER_5 = "PUMP_FE_HOLE_NUMBER_5";
    private String PUMP_PE_HOLE_NUMBER_1 = "PUMP_PE_HOLE_NUMBER_1";
    private String PUMP_PE_HOLE_NUMBER_5 = "PUMP_PE_HOLE_NUMBER_5";
    private String PUMP_FE_SERIAL_NUMBER = "PUMP_FE_SERIAL_NUMBER";
    private String DISTRICT_NAME = "DISTRICT_NAME";
    private String FLEET_NAME = "FLEET_NAME";
    private String ROTATION = "ROTATION";
    private String SHIFT = "SHIFT";
    private String AUDIT_TYPE  = "AUDIT_TYPE";
    private String USER = "USER";
    private String DATE = "DATE";
    private String TIME = "TIME";
    private String PSI = "PSI";
    private String PSIGUAGE = "PSIGUAGE";
    private String ID = "ID";
    private String STATION = "STATION";


    String  queryOnCreate =
            " CREATE TABLE "
            + TABLE_AUDIT + " ("
            + PUMP_NAME + ","
            + PUMP_SERIAL_NUMBER + ","
            + PUMP_PE_SERIAL_NUMBER + ","
            + PUMP_FE_SERIAL_NUMBER + ","
            + PUMP_FE_HOLE_NUMBER_1 + ","
            + PUMP_FE_HOLE_NUMBER_5 + ","
            + PUMP_PE_HOLE_NUMBER_1 + ","
            + PUMP_PE_HOLE_NUMBER_5 + ","
            + DISTRICT_NAME + ","
            + FLEET_NAME + ","
            + ROTATION + ","
            + SHIFT + ","
            + AUDIT_TYPE + ","
            + PSI + ","
            + PSIGUAGE + ","
            + USER + ","
            + DATE + ","
            + TIME + ","
            + ID + ","
            + STATION
            + VALUES;

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(queryOnCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_AUDIT);
    onCreate(db);
    }

    public void addAudit(Audits audits)
    {
        ContentValues values = new ContentValues();

        values.put(PUMP_NAME, audits.getPUMP_NAME());
        values.put(PUMP_FE_SERIAL_NUMBER, audits.getPUMP_SERIAL_NUMBER());
        values.put(PUMP_PE_SERIAL_NUMBER, audits.getPUMP_PE_SERIAL_NUMBER());
        values.put(PUMP_FE_SERIAL_NUMBER, audits.getPUMP_FE_SERIAL_NUMBER());
        values.put(PUMP_FE_HOLE_NUMBER_1, audits.getPUMP_FE_HOLE_NUMBER_1());
        values.put(PUMP_FE_HOLE_NUMBER_5, audits.getPUMP_FE_HOLE_NUMBER_5());
        values.put(PUMP_PE_HOLE_NUMBER_1, audits.getPUMP_PE_HOLE_NUMBER_1());
        values.put(PUMP_PE_HOLE_NUMBER_5, audits.getPUMP_PE_HOLE_NUMBER_5());
        values.put(DISTRICT_NAME, audits.getDISTRICT_NAME());
        values.put(FLEET_NAME, audits.getFLEET_NAME());
        values.put(ROTATION, audits.getROTATION());
        values.put(SHIFT, audits.getSHIFT());
        values.put(AUDIT_TYPE, audits.getAUDIT_TYPE());
        values.put(PSI, audits.isPSI());
        values.put(PSIGUAGE, audits.isPSIGUAGE());
        values.put(USER, audits.getUSER());
        values.put(DATE, audits.getDATE());
        values.put(TIME, audits.getTIME());
        values.put(ID, audits.getID());
        values.put(STATION, audits.getSTATION());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_AUDIT,null, values);
        db.close();

    }

    public void deleteAudit(String pumpName)
    {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_AUDIT + " WHERE " + PUMP_NAME + "=\"" + pumpName + "\";" );
    }

    public String auditToString()
    {
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_AUDIT + " WHERE 1";
        Cursor c = db.rawQuery(query, null);
        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("PUMP_NAME")) != null) {
                dbString += c.getString(c.getColumnIndex("PUMP_NAME"));
                dbString += "\n";
            }
        }
            db.close();
            return dbString;
    }

}

