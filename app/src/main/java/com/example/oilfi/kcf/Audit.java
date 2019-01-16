package com.example.oilfi.kcf;

import java.util.ArrayList;

class Audit {
	
	private String location = "######";
	private String districtName = "####";
	private String fleetName = "####";
	private String rotation = "####";
	private String shift = "####";
	private String auditType = "####";
	private String user = "####";
	private String date = "####";
	private String time = "####";
	private String datavan = "53DCT-####";
	private String baseStation = "####";
	private String repeater = "####";
	private String spareBatteries = "0";
	private String station = "0";
	private ArrayList<String> damageSensorsList;
	private ArrayList<String> spareSensorsList;
	private ArrayList<Pump_Audit> pumpArrayList;
	
	public Audit() {
    
    }
	
	public String getLocation() {
		return location;
    }
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDistrictName() {
		return districtName;
	}
	
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
    }
	
	public String getFleetName() {
		return fleetName;
    }
	
	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
    }
	
	public String getRotation() {
		return rotation;
    }
	
	public void setRotation(String rotation) {
		this.rotation = rotation;
    }
	
	public String getShift() {
		return shift;
    }
	
	public void setShift(String shift) {
		this.shift = shift;
    }
	
	public String getAuditType() {
		return auditType;
    }
	
	public void setAuditType(String auditType) {
		this.auditType = auditType;
    }
	
	public String getUser() {
		return user;
    }
	
	public void setUser(String user) {
		this.user = user;
    }
	
	public String getDate() {
		return date;
    }
	
	public void setDate(String date) {
		this.date = date;
    }
	
	public String getTime() {
		return time;
    }
	
	public void setTime(String time) {
		this.time = time;
    }
	
	public String getDatavan() {
		return datavan;
    }
	
	public void setDatavan(String datavan) {
		this.datavan = datavan;
    }
	
	public String getBaseStation() {
		return baseStation;
    }
	
	public void setBaseStation(String baseStation) {
		this.baseStation = baseStation;
    }
	
	public String getRepeater() {
		return repeater;
    }
	
	public void setRepeater(String repeater) {
		this.repeater = repeater;
    }
	
	public String getSpareBatteries() {
		return spareBatteries;
    }
	
	public void setSpareBatteries(String spareBatteries) {
		this.spareBatteries = spareBatteries;
    }
	
	public String getStation() {
		return station;
    }
	
	public void setStation(String station) {
		this.station = station;
    }
	
	public ArrayList<String> getDamageSensorsList() {
		return damageSensorsList;
    }
	
	public void setDamageSensorsList(ArrayList<String> damageSensorsList) {
		this.damageSensorsList = damageSensorsList;
    }
	
	public ArrayList<String> getSpareSensorsList() {
		return spareSensorsList;
    }
	
	public void setSpareSensorsList(ArrayList<String> spareSensorsList) {
		this.spareSensorsList = spareSensorsList;
    }
	
	public ArrayList<Pump_Audit> getPumpArrayList() {
		return pumpArrayList;
    }
	
	public void setPumpArrayList(ArrayList<Pump_Audit> pumpArrayList) {
		this.pumpArrayList = pumpArrayList;
    }
	
}
