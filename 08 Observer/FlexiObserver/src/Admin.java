//import java.util.Scanner;
//
////concrete subject
//public class Admin implements MySubject{
//    private MyObserver student; //to store single student
//    private String msg; //msg to send student
//    @Override
//    public void registerObserver(MyObserver observer) {
//        student = observer; //register one student
//    }
//
//    @Override
//    public void removeObserver(MyObserver observer) {
//        student = null; //to remove student
//    }
//
//    @Override
//    public void notifyObserver() {
//        student.update(msg);
//    }
//
//    //Other concrete methods
//    public void getMsg(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter msg: ");
//        msg = scanner.nextLine();
//        notifyObserver();
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Scanner;

public class Admin implements MySubject{
    //private MyObserver student; // to store a single student
    private List <MyObserver> student = new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(MyObserver observer) {
        //student = observer; //to register 1 student
        student.add(observer);

    }

    @Override
    public void removeObserver(MyObserver observer) {
        student = null; // to remove a single student
    }

    @Override
    public void notifyObserver() {
        // student.update();
        for (MyObserver observer : student) {
            observer.update(msg);
        }

    }

    // state changing concrete methods
    Scanner sc = new Scanner(System.in);

    public void sendMessage(){
        System.out.println("Please enter your msg to send to students: ");
        msg = sc.nextLine();
        notifyObserver();

    }

}