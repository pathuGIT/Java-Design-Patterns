abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape{
    final double PI = 1.34;
    double radius;

    Circle(double r){
        radius = r;
    }
    @Override
    void calculateArea(){
        double ans = PI*radius*radius;
        System.out.println("Circle area : "+ans);
    }
    @Override
    void calculatePerimeter(){
        double ans = 2*PI*radius;
        System.out.println("Circle parameter : "+ans);
    }
}
class Rectangle extends Shape{
    double w;
    double h;

    Rectangle(double x, double y){
        w = x;
        h = y;
    }
    @Override
    void calculateArea(){
        double ans = w*h;
        System.out.println("Rectangle area : "+ans);
    }
    @Override
    void calculatePerimeter(){
        double ans = (w+2)*2;
        System.out.println("Rectangle parameter : "+ans);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        circle.calculateArea();
        circle.calculatePerimeter();

        Shape rectangle = new Rectangle(7,5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}