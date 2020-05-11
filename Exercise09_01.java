public class Exercise09_01 {
	
	public static void main(String[] args)
	{
		MyRectangle myRectangle = new MyRectangle(4, 40);
		System.out.println("The area of a rectangle with width "
				           + myRectangle.width + " and height " + myRectangle.height
				           + " is " + myRectangle.getArea());
		System.out.println("The perimeter of a rectangle is "
				           + myRectangle.getPerimeter());

		MyRectangle yourRectangle = new MyRectangle(3.5, 35.9);
		System.out.print("The area of a rectangle with width "
				           + yourRectangle.width + " and height " + yourRectangle.height
				           + " is ");
		System.out.printf("%.2f \n",yourRectangle.getArea());
		System.out.println("The perimeter of a rectangle is "
				           + yourRectangle.getPerimeter());
	}
}

class MyRectangle {
	double width = 1;
	double height = 1;
	MyRectangle() {	
	}
	MyRectangle(double newHight, double newWidth){
		height = newHight;
		width = newWidth;
	}
	Double getArea() {
		return height*width;
	}
	Double getPerimeter() {
		return 2*(width+height);
	}

	
	
	
	
}