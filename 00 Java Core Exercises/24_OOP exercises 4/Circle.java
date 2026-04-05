public class Circle{
	private double radius;
	final double PI = 3.147;
	
	public Circle(double r){
		this.radius = r;
	}
	
	public void setRadi(double R){
		this.radius = R;
	}
	
	public double getCircumference(){
		double x = 2*PI*radius;
		return x;
	}
	
	public double getArea(){
		double y = 2*PI*radius*radius;
		return y;
	}
}