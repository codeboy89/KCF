/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.oilfi.kcf;

import java.io.Serializable;

/**
 * @author oilfi
 */
public class Pump_Audit implements Serializable {
	
	private String pumpName = "53#-####";
	private String pumpSerialNumber = "########";
	private String pumpPeSerialNumber = "########";
	private String pumpFeSerialNumber = "########";
	private String pumpFeHoleNumber1 = "0000####";
	private String pumpFeHoleNumber5 = "0000####";
	private String pumpPeHoleNumber1 = "0000####";
	private String pumpPeHoleNumber5 = "0000####";
	private String station = "#";
	private String psi = "##";
	private String psiguage = "##";
	
	public Pump_Audit() {
    }
	
	public Pump_Audit(String PUMP_NAME, String PUMP_SERIAL_NUMBER, String PUMP_PE_SERIAL_NUMBER, String PUMP_FE_SERIAL_NUMBER, String PUMP_FE_HOLE_NUMBER_1, String PUMP_FE_HOLE_NUMBER_5, String PUMP_PE_HOLE_NUMBER_1, String PUMP_PE_HOLE_NUMBER_5, String STATION, String PSI, String PSIGUAGE) {
		this.pumpName = PUMP_NAME;
		this.pumpFeSerialNumber = PUMP_SERIAL_NUMBER;
		this.pumpPeSerialNumber = PUMP_PE_SERIAL_NUMBER;
		this.pumpFeSerialNumber = PUMP_FE_SERIAL_NUMBER;
		this.pumpFeHoleNumber1 = PUMP_FE_HOLE_NUMBER_1;
		this.pumpFeHoleNumber5 = PUMP_FE_HOLE_NUMBER_5;
		this.pumpPeHoleNumber1 = PUMP_PE_HOLE_NUMBER_1;
		this.pumpPeHoleNumber5 = PUMP_PE_HOLE_NUMBER_5;
		this.station = STATION;
		this.psi = PSI;
		this.psiguage = PSIGUAGE;
    }

    public Pump_Audit(Pump_Audit pump_audit) {
	    this.pumpName = pump_audit.getPumpName();
	    this.pumpFeSerialNumber = pump_audit.getPumpSerialNumber();
	    this.pumpPeSerialNumber = pump_audit.getPumpPeSerialNumber();
	    this.pumpFeSerialNumber = pump_audit.getPumpFeSerialNumber();
	    this.pumpFeHoleNumber1 = pump_audit.getPumpFeHoleNumber1();
	    this.pumpFeHoleNumber5 = pump_audit.getPumpFeHoleNumber5();
	    this.pumpPeHoleNumber1 = pump_audit.getPumpPeHoleNumber1();
	    this.pumpPeHoleNumber5 = pump_audit.getPumpPeHoleNumber5();
	    this.station = pump_audit.getStation();
	    this.psi = pump_audit.getPsi();
	    this.psiguage = pump_audit.getPsiguage();
    }
	
	
	public String getPumpName() {
		return pumpName;
    }
	
	public void setPumpName(String pumpName) {
		this.pumpName = pumpName;
    }
	
	public String getPumpSerialNumber() {
		return pumpSerialNumber;
    }
	
	public void setPumpSerialNumber(String pumpSerialNumber) {
		this.pumpSerialNumber = pumpSerialNumber;
    }
	
	public String getPumpPeSerialNumber() {
		return pumpPeSerialNumber;
    }
	
	public void setPumpPeSerialNumber(String pumpPeSerialNumber) {
		this.pumpPeSerialNumber = pumpPeSerialNumber;
    }
	
	public String getPumpFeSerialNumber() {
		return pumpFeSerialNumber;
    }
	
	public void setPumpFeSerialNumber(String pumpFeSerialNumber) {
		this.pumpFeSerialNumber = pumpFeSerialNumber;
    }
	
	public String getPumpFeHoleNumber1() {
		return pumpFeHoleNumber1;
    }
	
	public void setPumpFeHoleNumber1(String pumpFeHoleNumber1) {
		this.pumpFeHoleNumber1 = pumpFeHoleNumber1;
    }
	
	public String getPumpFeHoleNumber5() {
		return pumpFeHoleNumber5;
    }
	
	public void setPumpFeHoleNumber5(String pumpFeHoleNumber5) {
		this.pumpFeHoleNumber5 = pumpFeHoleNumber5;
    }
	
	public String getPumpPeHoleNumber1() {
		return pumpPeHoleNumber1;
    }
	
	public void setPumpPeHoleNumber1(String pumpPeHoleNumber1) {
		this.pumpPeHoleNumber1 = pumpPeHoleNumber1;
    }
	
	public String getPumpPeHoleNumber5() {
		return pumpPeHoleNumber5;
    }
	
	public void setPumpPeHoleNumber5(String pumpPeHoleNumber5) {
		this.pumpPeHoleNumber5 = pumpPeHoleNumber5;
    }
	
	public String getStation() {
		return station;
    }
	
	public void setStation(String station) {
		this.station = station;
    }
	
	public String getPsi() {
		return psi;
    }
	
	public void setPsi(String psi) {
		this.psi = psi;
    }
	
	public String getPsiguage() {
		return psiguage;
    }
	
	public void setPsiguage(String psiguage) {
		this.psiguage = psiguage;
    }

    @Override
    public String toString() {
	    return "Pump_Audit{" + "pumpName=" + pumpName + ", pumpSerialNumber=" + pumpSerialNumber + ", pumpPeSerialNumber=" + pumpPeSerialNumber + ", pumpFeSerialNumber=" + pumpFeSerialNumber + ", pumpFeHoleNumber1=" + pumpFeHoleNumber1 + ", pumpFeHoleNumber5=" + pumpFeHoleNumber5 + ", pumpPeHoleNumber1=" + pumpPeHoleNumber1 + ", pumpPeHoleNumber5=" + pumpPeHoleNumber5 + ", station=" + station + ", psi=" + psi + ", psiguage=" + psiguage + '}';
    }

}
