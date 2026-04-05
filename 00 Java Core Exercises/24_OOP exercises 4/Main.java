public class Main{
	public static void main(String[] args){
		Circle obj = new Circle(23.45);
		
		System.out.println("The Area is: "+obj.getArea());
		System.out.println("The Circumference is: "+obj.getCircumference());
		
		obj.setRadi(17.142);
		
		System.out.println("\nThe Area is: "+obj.getArea());
		System.out.println("The Circumference is: "+obj.getCircumference());
	}
}