package global;

import java.sql.Timestamp;
import model.CandleStick;

public class Builder {
	
	public static CandleStick createCandleStick(String[] arr) throws NumberFormatException, ArrayIndexOutOfBoundsException{
		
		Timestamp timeStamp = new Timestamp(Long.parseLong(arr[0]));
		double open = Double.parseDouble(arr[1]);
		double low = Double.parseDouble(arr[2]);
		double high = Double.parseDouble(arr[3]);
		double close = Double.parseDouble(arr[4]);
		double volume = Double.parseDouble(arr[5]);
		
		return new CandleStick(timeStamp, open, high, low, close, volume);
	}

}
