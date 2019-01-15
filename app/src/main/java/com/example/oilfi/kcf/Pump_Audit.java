/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.oilfi.kcf;

import java.io.Serializable;

/**
 *
 * @author oilfi
 */
public class Pump_Audit implements Serializable
{

    private String PUMP_NAME = "53#-####";
    private String PUMP_SERIAL_NUMBER = "########";
    private String PUMP_PE_SERIAL_NUMBER = "########";
    private String PUMP_FE_SERIAL_NUMBER = "########";
    private String PUMP_FE_HOLE_NUMBER_1 = "0000####";
    private String PUMP_FE_HOLE_NUMBER_5 = "0000####";
    private String PUMP_PE_HOLE_NUMBER_1 = "0000####";
    private String PUMP_PE_HOLE_NUMBER_5 = "0000####";
    private String STATION = "#";
    private String PSI = "##";
    private String PSIGUAGE = "##";

    public Pump_Audit()
    {
    }

    public Pump_Audit( String PUMP_NAME ,
            String PUMP_SERIAL_NUMBER ,
            String PUMP_PE_SERIAL_NUMBER ,
            String PUMP_FE_SERIAL_NUMBER ,
            String PUMP_FE_HOLE_NUMBER_1 ,
            String PUMP_FE_HOLE_NUMBER_5 ,
            String PUMP_PE_HOLE_NUMBER_1 ,
            String PUMP_PE_HOLE_NUMBER_5 ,
            String STATION ,
            String PSI ,
            String PSIGUAGE )
    {
        this.PUMP_NAME = PUMP_NAME;
        this.PUMP_FE_SERIAL_NUMBER = PUMP_SERIAL_NUMBER;
        this.PUMP_PE_SERIAL_NUMBER = PUMP_PE_SERIAL_NUMBER;
        this.PUMP_FE_SERIAL_NUMBER = PUMP_FE_SERIAL_NUMBER;
        this.PUMP_FE_HOLE_NUMBER_1 = PUMP_FE_HOLE_NUMBER_1;
        this.PUMP_FE_HOLE_NUMBER_5 = PUMP_FE_HOLE_NUMBER_5;
        this.PUMP_PE_HOLE_NUMBER_1 = PUMP_PE_HOLE_NUMBER_1;
        this.PUMP_PE_HOLE_NUMBER_5 = PUMP_PE_HOLE_NUMBER_5;
        this.STATION = STATION;
        this.PSI = PSI;
        this.PSIGUAGE = PSIGUAGE;
    }

    public Pump_Audit(Pump_Audit pump_audit) {
        this.PUMP_NAME = pump_audit.getPUMP_NAME();
        this.PUMP_FE_SERIAL_NUMBER = pump_audit.getPUMP_SERIAL_NUMBER();
        this.PUMP_PE_SERIAL_NUMBER = pump_audit.getPUMP_PE_SERIAL_NUMBER();
        this.PUMP_FE_SERIAL_NUMBER = pump_audit.getPUMP_FE_SERIAL_NUMBER();
        this.PUMP_FE_HOLE_NUMBER_1 = pump_audit.getPUMP_FE_HOLE_NUMBER_1();
        this.PUMP_FE_HOLE_NUMBER_5 = pump_audit.getPUMP_FE_HOLE_NUMBER_5();
        this.PUMP_PE_HOLE_NUMBER_1 = pump_audit.getPUMP_PE_HOLE_NUMBER_1();
        this.PUMP_PE_HOLE_NUMBER_5 = pump_audit.getPUMP_PE_HOLE_NUMBER_5();
        this.STATION = pump_audit.getSTATION();
        this.PSI = pump_audit.getPSI();
        this.PSIGUAGE = pump_audit.getPSIGUAGE();
    }



    public String getPUMP_NAME()
    {
        return PUMP_NAME;
    }

    public void setPUMP_NAME( String PUMP_NAME )
    {
        this.PUMP_NAME = PUMP_NAME;
    }

    public String getPUMP_SERIAL_NUMBER()
    {
        return PUMP_SERIAL_NUMBER;
    }

    public void setPUMP_SERIAL_NUMBER( String PUMP_SERIAL_NUMBER )
    {
        this.PUMP_SERIAL_NUMBER = PUMP_SERIAL_NUMBER;
    }

    public String getPUMP_PE_SERIAL_NUMBER()
    {
        return PUMP_PE_SERIAL_NUMBER;
    }

    public void setPUMP_PE_SERIAL_NUMBER( String PUMP_PE_SERIAL_NUMBER )
    {
        this.PUMP_PE_SERIAL_NUMBER = PUMP_PE_SERIAL_NUMBER;
    }

    public String getPUMP_FE_SERIAL_NUMBER()
    {
        return PUMP_FE_SERIAL_NUMBER;
    }

    public void setPUMP_FE_SERIAL_NUMBER( String PUMP_FE_SERIAL_NUMBER )
    {
        this.PUMP_FE_SERIAL_NUMBER = PUMP_FE_SERIAL_NUMBER;
    }

    public String getPUMP_FE_HOLE_NUMBER_1()
    {
        return PUMP_FE_HOLE_NUMBER_1;
    }

    public void setPUMP_FE_HOLE_NUMBER_1( String PUMP_FE_HOLE_NUMBER_1 )
    {
        this.PUMP_FE_HOLE_NUMBER_1 = PUMP_FE_HOLE_NUMBER_1;
    }

    public String getPUMP_FE_HOLE_NUMBER_5()
    {
        return PUMP_FE_HOLE_NUMBER_5;
    }

    public void setPUMP_FE_HOLE_NUMBER_5( String PUMP_FE_HOLE_NUMBER_5 )
    {
        this.PUMP_FE_HOLE_NUMBER_5 = PUMP_FE_HOLE_NUMBER_5;
    }

    public String getPUMP_PE_HOLE_NUMBER_1()
    {
        return PUMP_PE_HOLE_NUMBER_1;
    }

    public void setPUMP_PE_HOLE_NUMBER_1( String PUMP_PE_HOLE_NUMBER_1 )
    {
        this.PUMP_PE_HOLE_NUMBER_1 = PUMP_PE_HOLE_NUMBER_1;
    }

    public String getPUMP_PE_HOLE_NUMBER_5()
    {
        return PUMP_PE_HOLE_NUMBER_5;
    }

    public void setPUMP_PE_HOLE_NUMBER_5( String PUMP_PE_HOLE_NUMBER_5 )
    {
        this.PUMP_PE_HOLE_NUMBER_5 = PUMP_PE_HOLE_NUMBER_5;
    }

    public String getSTATION()
    {
        return STATION;
    }

    public void setSTATION( String STATION )
    {
        this.STATION = STATION;
    }

    public String getPSI()
    {
        return PSI;
    }

    public void setPSI( String PSI )
    {
        this.PSI = PSI;
    }

    public String getPSIGUAGE()
    {
        return PSIGUAGE;
    }

    public void setPSIGUAGE( String PSIGUAGE )
    {
        this.PSIGUAGE = PSIGUAGE;
    }

    @Override
    public String toString()
    {
        return "Pump_Audit{" + "PUMP_NAME=" + PUMP_NAME + ", PUMP_SERIAL_NUMBER=" + PUMP_SERIAL_NUMBER + ", PUMP_PE_SERIAL_NUMBER=" + PUMP_PE_SERIAL_NUMBER + ", PUMP_FE_SERIAL_NUMBER=" + PUMP_FE_SERIAL_NUMBER + ", PUMP_FE_HOLE_NUMBER_1=" + PUMP_FE_HOLE_NUMBER_1 + ", PUMP_FE_HOLE_NUMBER_5=" + PUMP_FE_HOLE_NUMBER_5 + ", PUMP_PE_HOLE_NUMBER_1=" + PUMP_PE_HOLE_NUMBER_1 + ", PUMP_PE_HOLE_NUMBER_5=" + PUMP_PE_HOLE_NUMBER_5 + ", STATION=" + STATION + ", PSI=" + PSI + ", PSIGUAGE=" + PSIGUAGE + '}';
    }

}
