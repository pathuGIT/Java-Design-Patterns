public class Mani{
	public static void main(String[] args){
		Dog dog1 = new Dog("Pupy","Waltesion");
		
		System.out.println("The dog name: "+dog1.getName());
		System.out.println("The dog breed: "+dog1.getBreed());
		
		//Change the Dog values
		dog1.setDog("Kubi","Waltesion");
		
		System.out.println("\nThe dog name: "+dog1.getName());
		System.out.println("The dog breed: "+dog1.getBreed());
	}
}