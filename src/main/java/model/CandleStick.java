package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CandleStick {
	
	Date date;
	final double open;
	final double high;
	final double low;
	final double close;
	final double volume;
	
	public CandleStick(String[] arr) {

		DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		try {
			this.date = format.parse(arr[0]);
		} catch (ParseException e) {	
			e.printStackTrace();
		}
		this.open = Double.parseDouble(arr[1]);
		this.low = Double.parseDouble(arr[2]);
		this.high = Double.parseDouble(arr[3]);
		this.close = Double.parseDouble(arr[4]);
		this.volume = Double.parseDouble(arr[5]);
	}

}
