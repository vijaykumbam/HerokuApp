package com.thefinancecompany.nse.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nse_records")
public class NiftyFiftyRecords {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long dbId;
	@Column(nullable = false) //To get the complete entity.
	private String symbol;
	@Column(nullable = false)
	double open;
	@Column(nullable = false)
	private double high;
	@Column(nullable = false)
	private double low;
	@Column(nullable = false)
	private double previous;
	@Column(nullable = false)
	private double lastTradingPoint;
	@Column(nullable = false)
	private double change;
	@Column(nullable = false)
	private double changePercentage;
	@Column(nullable = false)
	private long volume;
	@Column(nullable = false)
	private double _52WeekHigh;
	@Column(nullable = false)
	private double _52WeekLow;
	@Column(nullable = false)
	private double yearlyChange;
	@Column(nullable = false)
	private double monthlyChange;
	@Column(nullable = false)
	private LocalDateTime insertedDateTime;
	
	
	public NiftyFiftyRecords() {}
	public NiftyFiftyRecords (String symbol, double open, double high, double low, double previous, double lastTradingPoint,
			double change, double changePercentage, long volume, double _52WeekHigh, double _52WeekLow,
			double yearlyChange, double monthlyChange, LocalDateTime insertedDateTime) {
		super();
		this.symbol = symbol;
		this.open = open;
		this.high = high;
		this.low = low;
		this.previous = previous;
		this.lastTradingPoint = lastTradingPoint;
		this.change = change;
		this.changePercentage = changePercentage;
		this.volume = volume;
		this._52WeekHigh = _52WeekHigh;
		this._52WeekLow = _52WeekLow;
		this.yearlyChange = yearlyChange;
		this.monthlyChange = monthlyChange;
		this.insertedDateTime = insertedDateTime;
	}
	
	
	public long getDbId() {
		return dbId;
	}
	public void setDbId(long dbId) {
		this.dbId = dbId;
	}
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
	public long getVolume() {
		return volume;
	}
	public void setVolume(long volume) {
		this.volume = volume;
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
