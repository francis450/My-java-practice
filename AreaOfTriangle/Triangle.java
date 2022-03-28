public class Triangle{
	private double side1 = 3;
	private double side2 = 4;
	private double side3 = 5;
	public double area,perimeter;
	
	Triangle(){
		area  = 0.5 * side1 * side2;
		perimeter = side2 + side1 + side3;
	}

	public static void main(String [] args){
		Triangle one = new Triangle();

		System.out.println("The Area: "+ one.area+"\nThe perimeter: "+one.perimeter);
	}
}