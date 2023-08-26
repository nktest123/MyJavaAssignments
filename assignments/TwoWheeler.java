package week1.assignments;

public class TwoWheeler {

	public static void main(String[] args) {
		int noOfWheels = 2;
		short noOfMirrors = 2;
		long chassisNumber = 456789;
		boolean isPunctured = false;
		String bikeName = "Ducati";
		double runningKM = 450.7890 ;
		TwoWheeler obj = new TwoWheeler();
		System.out.println("Print bike details:");
		System.out.println("Number of Wheels in your bike:"+noOfWheels);
		System.out.println("Number of Mirrors in your bike:"+noOfMirrors);
		System.out.println("Chassis Number of your bike:"+chassisNumber);
		System.out.println("Is your bike punctured:"+isPunctured);
		System.out.println("Enter your bike name:"+bikeName);
		System.out.println("Running KM speed of your bike:"+ String.format("%.2f",runningKM));

	}

}
