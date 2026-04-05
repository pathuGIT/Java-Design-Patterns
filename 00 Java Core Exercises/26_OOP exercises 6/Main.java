public class Main{
	public static void main(String[] args){
		Employee emp1 = new Employee("Saman","IT",40000.0f);
		Employee emp2 = new Employee("Kasthuri","BST",35000.0f);
		
		emp1.showEmp();
		emp2.showEmp();
		
		emp1.updtSalery(8);
		
		System.out.println("\nUpter updaeing salery of emp1");
		emp1.showEmp();
		emp2.showEmp();
	}
}