public class Employee{
	private String name;
	private String title;
	private float salery;
	
	public Employee(String name, String title, float salery){
		this.name = name;
		this.title = title;
		this.salery = salery;
	}
	
	public void showEmp(){
		System.out.println("Emp name: "+name);
		System.out.println("Emp title: "+title);
		System.out.println("Emp salery: "+salery);
	}
	
	public void updtSalery(float x){
		float y = salery + ((salery * 8)/100);
		this.salery = y;
	}
}