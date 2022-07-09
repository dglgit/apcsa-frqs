package apcsa;

public class CombinedTable {
	private SingleTable t1;
	private SingleTable t2;
	public CombinedTable(SingleTable t1, SingleTable t2) {
		this.t1=t1;
		this.t2=t2;

	}
	public boolean canSeat(int num) {
		boolean result= num<=(t1.getNumSeats()+t2.getNumSeats()-2);
		System.out.println(result);
		return result;
	}
	public double getDesirability() {
		double result;
		Double q1=t1.getViewQuality();
		Double q2=t2.getViewQuality();
		result=(q1+q2)/2;
		if(t1.getHeight()!=t2.getHeight()) {
			result-=10;
		}
		System.out.println(result);
		return result;
	}
	public static void test() {
		SingleTable t1=new SingleTable(4,60,74);
		SingleTable t2=new SingleTable(8,70,74);
		SingleTable t3=new SingleTable(12,75,76);
		CombinedTable c1=new CombinedTable(t1,t2);
		c1.canSeat(9);
		c1.canSeat(11);
		c1.getDesirability();
		CombinedTable c2=new CombinedTable(t2,t3);
		c2.canSeat(18);
		c2.getDesirability();
		t2.setViewQuality(80);
		c2.getDesirability();
	}
}
