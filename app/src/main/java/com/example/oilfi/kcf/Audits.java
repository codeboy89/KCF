package com.example.oilfi.kcf;

import android.os.Parcel;
import android.os.Parcelable;

class Audits implements Parcelable {
    private String PUMP_NAME = "53Q-11450";
    private String PUMP_SERIAL_NUMBER = "753159";
    private String PUMP_PE_SERIAL_NUMBER = "123987456";
    private String PUMP_FE_SERIAL_NUMBER = "213145466";
    private String PUMP_FE_HOLE_NUMBER_1 = "0000A12F";
    private String PUMP_FE_HOLE_NUMBER_5 = "0000B34E";
    private String PUMP_PE_HOLE_NUMBER_1 = "0000C56D";
    private String PUMP_PE_HOLE_NUMBER_5 = "0000E31F";
    private String DISTRICT_NAME = "ELK CITY";
    private String FLEET_NAME = "FLLET 3";
    private String ROTATION = "BLUE";
    private String SHIFT = "DAYS";
    private String AUDIT_TYPE  = "NEW";
    private String USER = "JSTUTSMAN";
    private String DATE = "1/10/18";
    private String TIME = "7:16 PM";
    private boolean PSI = false;
    private boolean PSIGUAGE = false;
    private int ID = 0;
    private int STATION = 0;

    protected Audits(Parcel in) {
        PUMP_NAME = in.readString();
        PUMP_SERIAL_NUMBER = in.readString();
        PUMP_PE_SERIAL_NUMBER = in.readString();
        PUMP_FE_SERIAL_NUMBER = in.readString();
        PUMP_FE_HOLE_NUMBER_1 = in.readString();
        PUMP_FE_HOLE_NUMBER_5 = in.readString();
        PUMP_PE_HOLE_NUMBER_1 = in.readString();
        PUMP_PE_HOLE_NUMBER_5 = in.readString();
        DISTRICT_NAME = in.readString();
        FLEET_NAME = in.readString();
        ROTATION = in.readString();
        SHIFT = in.readString();
        AUDIT_TYPE = in.readString();
        USER = in.readString();
        DATE = in.readString();
        TIME = in.readString();
        PSI = in.readByte() != 0;
        PSIGUAGE = in.readByte() != 0;
        ID = in.readInt();
        STATION = in.readInt();
    }



    public Audits() {

    }

    public static final Creator<Audits> CREATOR = new Creator<Audits>() {
        @Override
        public Audits createFromParcel(Parcel in) {
            return new Audits(in);
        }

        @Override
        public Audits[] newArray(int size) {
            return new Audits[size];
        }
    };

    public String getPUMP_NAME() {
        return PUMP_NAME;
    }

    public void setPUMP_NAME(String PUMP_NAME) {
        this.PUMP_NAME = PUMP_NAME;
    }

    public String getPUMP_PE_SERIAL_NUMBER() {
        return PUMP_PE_SERIAL_NUMBER;
    }

    public void setPUMP_PE_SERIAL_NUMBER(String PUMP_PE_SERIAL_NUMBER) {
        this.PUMP_PE_SERIAL_NUMBER = PUMP_PE_SERIAL_NUMBER;
    }

    public String getPUMP_SERIAL_NUMBER() {
        return PUMP_SERIAL_NUMBER;
    }

    public void setPUMP_SERIAL_NUMBER(String PUMP_SERIAL_NUMBER) {
        this.PUMP_SERIAL_NUMBER = PUMP_SERIAL_NUMBER;
    }

    public String getPUMP_FE_HOLE_NUMBER_1() {
        return PUMP_FE_HOLE_NUMBER_1;
    }

    public void setPUMP_FE_HOLE_NUMBER_1(String PUMP_FE_HOLE_NUMBER_1) {
        this.PUMP_FE_HOLE_NUMBER_1 = PUMP_FE_HOLE_NUMBER_1;
    }

    public String getPUMP_FE_HOLE_NUMBER_5() {
        return PUMP_FE_HOLE_NUMBER_5;
    }

    public void setPUMP_FE_HOLE_NUMBER_5(String PUMP_FE_HOLE_NUMBER_5) {
        this.PUMP_FE_HOLE_NUMBER_5 = PUMP_FE_HOLE_NUMBER_5;
    }

    public String getPUMP_PE_HOLE_NUMBER_1() {
        return PUMP_PE_HOLE_NUMBER_1;
    }

    public void setPUMP_PE_HOLE_NUMBER_1(String PUMP_PE_HOLE_NUMBER_1) {
        this.PUMP_PE_HOLE_NUMBER_1 = PUMP_PE_HOLE_NUMBER_1;
    }

    public String getPUMP_PE_HOLE_NUMBER_5() {
        return PUMP_PE_HOLE_NUMBER_5;
    }

    public void setPUMP_PE_HOLE_NUMBER_5(String PUMP_PE_HOLE_NUMBER_5) {
        this.PUMP_PE_HOLE_NUMBER_5 = PUMP_PE_HOLE_NUMBER_5;
    }

    public String getPUMP_FE_SERIAL_NUMBER() {
        return PUMP_FE_SERIAL_NUMBER;
    }

    public void setPUMP_FE_SERIAL_NUMBER(String PUMP_FE_SERIAL_NUMBER) {
        this.PUMP_FE_SERIAL_NUMBER = PUMP_FE_SERIAL_NUMBER;
    }

    public String getDISTRICT_NAME() {
        return DISTRICT_NAME;
    }

    public void setDISTRICT_NAME(String DISTRICT_NAME) {
        this.DISTRICT_NAME = DISTRICT_NAME;
    }

    public String getFLEET_NAME() {
        return FLEET_NAME;
    }

    public void setFLEET_NAME(String FLEET_NAME) {
        this.FLEET_NAME = FLEET_NAME;
    }

    public String getROTATION() {
        return ROTATION;
    }

    public void setROTATION(String ROTATION) {
        this.ROTATION = ROTATION;
    }

    public String getSHIFT() {
        return SHIFT;
    }

    public void setSHIFT(String SHIFT) {
        this.SHIFT = SHIFT;
    }

    public String getAUDIT_TYPE() {
        return AUDIT_TYPE;
    }

    public void setAUDIT_TYPE(String AUDIT_TYPE) {
        this.AUDIT_TYPE = AUDIT_TYPE;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    public boolean isPSI() {
        return PSI;
    }

    public void setPSI(boolean PSI) {
        this.PSI = PSI;
    }

    public boolean isPSIGUAGE() {
        return PSIGUAGE;
    }

    public void setPSIGUAGE(boolean PSIGUAGE) {
        this.PSIGUAGE = PSIGUAGE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSTATION() {
        return STATION;
    }

    public void setSTATION(int STATION) {
        this.STATION = STATION;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "PUMP_NAME='" + PUMP_NAME + '\'' +
                ", PUMP_SERIAL_NUMBER='" + PUMP_SERIAL_NUMBER + '\'' +
                ", PUMP_PE_SERIAL_NUMBER='" + PUMP_PE_SERIAL_NUMBER + '\'' +
                ", PUMP_FE_SERIAL_NUMBER='" + PUMP_FE_SERIAL_NUMBER + '\'' +
                ", PUMP_FE_HOLE_NUMBER_1='" + PUMP_FE_HOLE_NUMBER_1 + '\'' +
                ", PUMP_FE_HOLE_NUMBER_5='" + PUMP_FE_HOLE_NUMBER_5 + '\'' +
                ", PUMP_PE_HOLE_NUMBER_1='" + PUMP_PE_HOLE_NUMBER_1 + '\'' +
                ", PUMP_PE_HOLE_NUMBER_5='" + PUMP_PE_HOLE_NUMBER_5 + '\'' +
                ", DISTRICT_NAME='" + DISTRICT_NAME + '\'' +
                ", FLEET_NAME='" + FLEET_NAME + '\'' +
                ", ROTATION='" + ROTATION + '\'' +
                ", SHIFT='" + SHIFT + '\'' +
                ", AUDIT_TYPE='" + AUDIT_TYPE + '\'' +
                ", USER='" + USER + '\'' +
                ", DATE='" + DATE + '\'' +
                ", TIME='" + TIME + '\'' +
                ", PSI=" + PSI +
                ", PSIGUAGE=" + PSIGUAGE +
                ", ID=" + ID +
                ", STATION=" + STATION +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(PUMP_NAME);
        dest.writeString(PUMP_SERIAL_NUMBER);
        dest.writeString(PUMP_PE_SERIAL_NUMBER);
        dest.writeString(PUMP_FE_SERIAL_NUMBER);
        dest.writeString(PUMP_FE_HOLE_NUMBER_1);
        dest.writeString(PUMP_FE_HOLE_NUMBER_5);
        dest.writeString(PUMP_PE_HOLE_NUMBER_1);
        dest.writeString(PUMP_PE_HOLE_NUMBER_5);
        dest.writeString(DISTRICT_NAME);
        dest.writeString(FLEET_NAME);
        dest.writeString(ROTATION);
        dest.writeString(SHIFT);
        dest.writeString(AUDIT_TYPE);
        dest.writeString(USER);
        dest.writeString(DATE);
        dest.writeString(TIME);
        dest.writeByte((byte) (PSI ? 1 : 0));
        dest.writeByte((byte) (PSIGUAGE ? 1 : 0));
        dest.writeInt(ID);
        dest.writeInt(STATION);
    }
}
