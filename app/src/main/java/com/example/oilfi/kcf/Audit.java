
package com.example.oilfi.kcf;

import java.util.ArrayList;

class Audit
{

    private String LOCATION = "######";
    private String DISTRICT_NAME = "####";
    private String FLEET_NAME = "####";
    private String ROTATION = "####";
    private String SHIFT = "####";
    private String AUDIT_TYPE = "####";
    private String USER = "####";
    private String DATE = "####";
    private String TIME = "####";
    private String DATAVAN = "53DCT-####";
    private String BASE_STATION = "####";
    private String REPEATER = "####";
    private String SPARE_BATTERIES = "0";

    public String getSTATION() {
        return STATION;
    }

    public void setSTATION(String STATION) {
        this.STATION = STATION;
    }

    private String STATION = "0";
    private ArrayList<String> DAMAGE_SENSOR_LIST;
    private ArrayList<String> SPARE_SENSOR_LIST;

    public Audit()
    {

    }

    public String getLOCATION()
    {
        return LOCATION;
    }

    public void setLOCATION( String LOCATION )
    {
        this.LOCATION = LOCATION;
    }

    public String getDISTRICT_NAME()
    {
        return DISTRICT_NAME;
    }

    public void setDISTRICT_NAME( String DISTRICT_NAME )
    {
        this.DISTRICT_NAME = DISTRICT_NAME;
    }

    public String getFLEET_NAME()
    {
        return FLEET_NAME;
    }

    public void setFLEET_NAME( String FLEET_NAME )
    {
        this.FLEET_NAME = FLEET_NAME;
    }

    public String getROTATION()
    {
        return ROTATION;
    }

    public void setROTATION( String ROTATION )
    {
        this.ROTATION = ROTATION;
    }

    public String getSHIFT()
    {
        return SHIFT;
    }

    public void setSHIFT( String SHIFT )
    {
        this.SHIFT = SHIFT;
    }

    public String getAUDIT_TYPE()
    {
        return AUDIT_TYPE;
    }

    public void setAUDIT_TYPE( String AUDIT_TYPE )
    {
        this.AUDIT_TYPE = AUDIT_TYPE;
    }

    public String getUSER()
    {
        return USER;
    }

    public void setUSER( String USER )
    {
        this.USER = USER;
    }

    public String getDATE()
    {
        return DATE;
    }

    public void setDATE( String DATE )
    {
        this.DATE = DATE;
    }

    public String getTIME()
    {
        return TIME;
    }

    public void setTIME( String TIME )
    {
        this.TIME = TIME;
    }

    public String getDATAVAN()
    {
        return DATAVAN;
    }

    public void setDATAVAN( String DATAVAN )
    {
        this.DATAVAN = DATAVAN;
    }

    public String getBASE_STATION()
    {
        return BASE_STATION;
    }

    public void setBASE_STATION( String BASE_STATION )
    {
        this.BASE_STATION = BASE_STATION;
    }

    public String getREPEATER()
    {
        return REPEATER;
    }

    public void setREPEATER( String REPEATER )
    {
        this.REPEATER = REPEATER;
    }

    public String getSPARE_BATTERIES()
    {
        return SPARE_BATTERIES;
    }

    public void setSPARE_BATTERIES( String SPARE_BATTERIES )
    {
        this.SPARE_BATTERIES = SPARE_BATTERIES;
    }

    public ArrayList<String> getDAMAGE_SENSOR_LIST()
    {
        return DAMAGE_SENSOR_LIST;
    }

    public void setDAMAGE_SENSOR_LIST( ArrayList<String> DAMAGE_SENSOR_LIST )
    {
        this.DAMAGE_SENSOR_LIST = DAMAGE_SENSOR_LIST;
    }

    public ArrayList<String> getSPARE_SENSOR_LIST()
    {
        return SPARE_SENSOR_LIST;
    }

    public void setSPARE_SENSOR_LIST( ArrayList<String> SPARE_SENSOR_LIST )
    {
        this.SPARE_SENSOR_LIST = SPARE_SENSOR_LIST;
    }

    @Override
    public String toString()
    {
        return "Audit{" + "LOCATION=" + LOCATION + ", DISTRICT_NAME=" + DISTRICT_NAME + ", FLEET_NAME=" + FLEET_NAME + ", ROTATION=" + ROTATION + ", SHIFT=" + SHIFT + ", AUDIT_TYPE=" + AUDIT_TYPE + ", USER=" + USER + ", DATE=" + DATE + ", TIME=" + TIME + ", DATAVAN=" + DATAVAN + ", BASE_STATION=" + BASE_STATION + ", REPEATER=" + REPEATER + ", SPARE_BATTERIES=" + SPARE_BATTERIES + ", DAMAGE_SENSOR_LIST=" + DAMAGE_SENSOR_LIST.toString().toUpperCase().replaceAll("[^a-zA-Z0-9,]" , "").replaceAll("\\s+" , "") + ", SPARE_SENSOR_LIST=" + SPARE_SENSOR_LIST.toString().toUpperCase().replaceAll("[^a-zA-Z0-9,]" , "").replaceAll("\\s+" , "") + '}';
    }

}
