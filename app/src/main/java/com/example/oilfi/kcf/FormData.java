package com.example.oilfi.kcf;

public class FormData {
    
    private String Unit;
    private String Powerend;
    private String Fluidend;
    private String PowerendHole1;
    private String PowerendHole5;
    private String FluidendHole1;
    private String FluidendHole5;
    
    private boolean DampenerPSI;
    private boolean DampenerPressureGuage;

    public FormData() {

    }

    public FormData(String unit) {
        Unit = unit;
    }

    @Override
    public String toString() {
        return "FormData{" +
                "Unit='" + Unit + '\'' +
                ", Powerend='" + Powerend + '\'' +
                ", Fluidend='" + Fluidend + '\'' +
                ", PowerendHole1='" + PowerendHole1 + '\'' +
                ", PowerendHole5='" + PowerendHole5 + '\'' +
                ", FluidendHole1='" + FluidendHole1 + '\'' +
                ", FluidendHole5='" + FluidendHole5 + '\'' +
                ", DampenerPSI=" + DampenerPSI +
                ", DampenerPressureGuage=" + DampenerPressureGuage +
                '}';
    }

    public FormData(String unit, String powerend, String fluidend, String powerendHole1, String powerendHole5, String fluidendHole1, String fluidendHole5, boolean dampenerPSI, boolean dampenerPressureGuage) {
        Unit = unit;
        Powerend = powerend;
        Fluidend = fluidend;
        PowerendHole1 = powerendHole1;
        PowerendHole5 = powerendHole5;
        FluidendHole1 = fluidendHole1;
        FluidendHole5 = fluidendHole5;
        DampenerPSI = dampenerPSI;
        DampenerPressureGuage = dampenerPressureGuage;
    }


    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getPowerend() {
        return Powerend;
    }

    public void setPowerend(String powerend) {
        Powerend = powerend;
    }

    public String getFluidend() {
        return Fluidend;
    }

    public void setFluidend(String fluidend) {
        Fluidend = fluidend;
    }

    public String getPowerendHole1() {
        return PowerendHole1;
    }

    public void setPowerendHole1(String powerendHole1) {
        PowerendHole1 = powerendHole1;
    }

    public String getPowerendHole5() {
        return PowerendHole5;
    }

    public void setPowerendHole5(String powerendHole5) {
        PowerendHole5 = powerendHole5;
    }

    public String getFluidendHole1() {
        return FluidendHole1;
    }

    public void setFluidendHole1(String fluidendHole1) {
        FluidendHole1 = fluidendHole1;
    }

    public String getFluidendHole5() {
        return FluidendHole5;
    }

    public void setFluidendHole5(String fluidendHole5) {
        FluidendHole5 = fluidendHole5;
    }

    public boolean isDampenerPSI() {
        return DampenerPSI;
    }

    public void setDampenerPSI(boolean dampenerPSI) {
        DampenerPSI = dampenerPSI;
    }

    public boolean isDampenerPressureGuage() {
        return DampenerPressureGuage;
    }

    public void setDampenerPressureGuage(boolean dampenerPressureGuage) {
        DampenerPressureGuage = dampenerPressureGuage;
    }



}
