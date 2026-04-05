public class Dog{
	private String name;
	private String breed;
	
	public Dog(String Dname, String Dbreed){
		this.name = Dname;
		this.breed = Dbreed;
	}
	
	public void setDog(String Sname, String Sbreed){
		this.name = Sname;
		this.breed = Sbreed;
	}
	
	public String getName(){
		return name;
	}
	
	public String getBreed(){
		return breed;
	}
}