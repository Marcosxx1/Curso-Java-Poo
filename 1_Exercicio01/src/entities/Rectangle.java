package entities;

public class Rectangle {

	public double Width;
	public double Height;

	
	public double Area() {
		return Width * Height;
		
	}
	
	public double Perimeter() {
		return 2 * (Width + Height);
	}
	
	
	public double Diagonal() {
		double a = Math.pow(Width, 2);
		double b = Math.pow(Height, 2);
		double diagonal ;
		
		return  diagonal = Math.sqrt(a + b);
	
	}
	
	public String toString() {
		
		return "AREA = "+Area()
			  +"\nPerimeter = "+Perimeter()
			  +"\nDiagonal = "+Diagonal();
		
		
		
		
	}
	
}
