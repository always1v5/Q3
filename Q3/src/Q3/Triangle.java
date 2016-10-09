package Q3;

public class Triangle extends GeometricObject{

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	
	public Triangle(){
		
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	


	@Override
	public double getArea() {
	
		double area = side3 * (Math.sqrt(Math.sqrt(side1) - Math.sqrt(side3/2)));
		return area ;
	}

	@Override
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3; 
		return perimeter;
	}
	
	public String toString(){
		
		String string001 = "A triangle is a closed figure with three sides.";
		return  string001 ;
	}
}
