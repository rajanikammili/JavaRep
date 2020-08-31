package abstractClassesExample3;

public abstract class Shapes {
	
	abstract void rectangleMethod();
	abstract void circleMethod();
	
	public static void main(String[] args) {
		
		Shapes rect = new AbstractRectangle();
		Shapes circ= new AbstractCircle();
		
		rect.circleMethod();
		circ.rectangleMethod();
		
	}

}
