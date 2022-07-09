package apcsa;

public class SingleTable {
	private int seats;
	private int height;
	private double quality;
	public SingleTable(int seats, double quality,int height) {
		this.seats=seats;
		this.height=height;
		this.quality=quality;
	}
	public int getNumSeats() {
		return seats;
	}
	public int getHeight() {
		return height;
	}
	public double getViewQuality() {
		return quality;
	}
	public void setViewQuality(double value) {
		quality=value;
	}
}
