
public class Circle implements GeometricObject{

	protected double radius = 1;

	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getP() {
		return 2 * Math.PI * radius;
	}
}
