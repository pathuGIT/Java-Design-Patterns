public class Main{	
	public static void main(String[] args){	
		TrafficLight obj = new TrafficLight();
		try {
            obj.my();
        } catch (InterruptedException e) {
            // Handle the InterruptedException, or print the stack trace
            e.printStackTrace();
        }
			
	}
}

