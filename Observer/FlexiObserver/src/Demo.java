public class Demo {
    public static void main(String[] args) {
        Admin admin = new Admin();

        Student kamal = new Student("TG1001");
        Student nimal = new Student("TG1002");

        admin.registerObserver(kamal);
        admin.registerObserver(nimal);
        admin.sendMessage();
    }
}
