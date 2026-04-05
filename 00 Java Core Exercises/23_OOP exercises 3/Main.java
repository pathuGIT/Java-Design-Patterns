class Main extends Rectangle{
	public static void main(String[] args){
		Main obj = new Main(); 
		obj.set(10, 5);
		
		System.out.println("The area is: "+obj.Area());
		System.out.println("The perimeter is: " + obj.Perameter());
	}
}