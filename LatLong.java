package hemin.test;

import java.io.ObjectInputStream.GetField;
import java.math.BigDecimal;

public class LatLong {


	private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == "K") {
			dist = dist * 1.609344;
		} else if (unit == "N") {
			dist = dist * 0.8684;
		}

		return (dist);
	}
	
	static double deg2rad(double deg) {
		return (deg * 3.14 / 180);
	}
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}

	public static void main(String[] args) {

		System.out.println("Distance is:" + distance(20.5937, 78.9629, 28.3949, 84.1240,"K"));

	}

}
