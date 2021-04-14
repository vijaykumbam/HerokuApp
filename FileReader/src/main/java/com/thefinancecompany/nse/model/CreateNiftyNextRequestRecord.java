package com.thefinancecompany.nse.model;

import java.time.LocalDateTime;

public class CreateNiftyNextRequestRecord {

	private String symbol;
	private double open;
	private double high;
	private double low;
	private double previous;
	private double lastTradingPoint;
	private double change;
	private double changePercentage;
	private double volume;
	private double value;
	private double _52WeekHigh;
	private double _52WeekLow;
	private double yearlyChange;
	private double monthlyChange;
	private LocalDateTime insertedDateTime;
	
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getPrevious() {
		return previous;
	}
	public void setPrevious(double previous) {
		this.previous = previous;
	}
	public double getLastTradingPoint() {
		return lastTradingPoint;
	}
	public void setLastTradingPoint(double lastTradingPoint) {
		this.lastTradingPoint = lastTradingPoint;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	public double getChangePercentage() {
		return changePercentage;
	}
	public void setChangePercentage(double changePercentage) {
		this.changePercentage = changePercentage;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double get_52WeekHigh() {
		return _52WeekHigh;
	}
	public void set_52WeekHigh(double _52WeekHigh) {
		this._52WeekHigh = _52WeekHigh;
	}
	public double get_52WeekLow() {
		return _52WeekLow;
	}
	public void set_52WeekLow(double _52WeekLow) {
		this._52WeekLow = _52WeekLow;
	}
	public double getYearlyChange() {
		return yearlyChange;
	}
	public void setYearlyChange(double yearlyChange) {
		this.yearlyChange = yearlyChange;
	}
	public double getMonthlyChange() {
		return monthlyChange;
	}
	public void setMonthlyChange(double monthlyChange) {
		this.monthlyChange = monthlyChange;
	}
	public LocalDateTime getInsertedDateTime() {
		return insertedDateTime;
	}
	public void setInsertedDateTime(LocalDateTime insertedDateTime) {
		this.insertedDateTime = insertedDateTime;
	}
	
	
}
