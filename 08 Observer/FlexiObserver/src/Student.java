public class Student implements MyObserver{
    String regno;
    public Student(String regno) {
        this.regno = regno;
    }

    @Override
    public void update(String msg) {
        System.out.println("I am the "+this.regno+" I got he msg: "+msg);
    }
}
