
public class TrafficLight{
	public static int k = 1;
	
	public void my() throws InterruptedException{
			if(k<=20){
				System.out.println("\nThe Color is: Red");
				
				for(int i=k; i<=20; i++){
					System.out.print(i+" ");
					k += 1;
					Thread.sleep(1000);
				}
			}else{
				System.out.println("\nThe Color is: Green");
				for(int i=k; i<=60; i++){
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
				k = 1;
			}
		my();
	}
	
}