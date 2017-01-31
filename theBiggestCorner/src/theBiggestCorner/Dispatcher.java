package theBiggestCorner;
public class Dispatcher {
	static void isTheSame(double fA, double sA) {
		if(fA > sA) new Display().display("OA");
		else if(fA < sA) new Display().display("OB");
		else new Display().display("Identical angles !!!");
	}
	public static void main(String[] args) {
		Coordinates coords = new Coordinates(-5,5,5,-4);
		Calculation calc = new Calculation();
		double lengthOA = calc.length(coords.x1, coords.y1);
		double lengthOB = calc.length(coords.x2, coords.y2);
		double firstAngle = calc.corner(lengthOA, coords.x1);
		double secondAngle = calc.corner(lengthOB, coords.x2);
		Dispatcher.isTheSame(firstAngle, secondAngle);
	}
}
class Coordinates {
	int x1, y1, x2, y2;
	Coordinates(int x1, int y1, int x2, int y2) {
		this.x1 = Math.abs(x1);
		this.y1 = Math.abs(y1);
		this.x2 = Math.abs(x2);
		this.y2 = Math.abs(y2);
	}
}
class Calculation {
	private double length;
	private double degrees;
	double length(int x, int y) {
		length = Math.sqrt(Math.pow(x - 0,2) + Math.pow(y - 0,2));
		return length;
	}
	double corner(double length1, int x1) {
		degrees = Math.acos(x1/length1);
		return degrees;
	}
}
class Display {
	void display(String s) {
		System.out.println(s);
	}
}