package model;

import java.sql.Timestamp;

public class RealTimeQuote {
	
	private double price;
	private double volume;
	private  Timestamp timeStamp;
	
	public RealTimeQuote(double price, double volume){
		this.price = price;
		this.volume = volume;
	}	
	
	public RealTimeQuote(Timestamp timeStamp, double price, double volume){
		this.timeStamp = timeStamp;
		this.price = price;
		this.volume = volume;
	}

	public double getPrice() {
		return price;
	}

	public double getVolume() {
		return volume;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}
}
