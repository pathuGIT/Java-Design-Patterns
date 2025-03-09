public class MyInheritSirDirDemo {
    public static void main(String[] args) {
        MySerializer mySerializer = new MySerializer();
        MyDesrializer myDesrializer = new MyDesrializer();

        //Cat cat1 = new Cat(100, "red");
        //Cat cat2 = new Cat(75, "Yellow");
        //mySerializer.serializer(cat1);
        //mySerializer.serializer(cat2);

        //UniversityEmployee uniemp1 = new UniversityEmployee(10, "naml", 2001);
        //UniversityEmployee uniemp2 = new UniversityEmployee(10, "Kamal", 2005);
        //mySerializer.universitySerializer(uniemp1);
        //mySerializer.universitySerializer(uniemp2);

        Car car1 = new Car("red",3,160);
        mySerializer.carSerializer(car1);
        myDesrializer.carDesrializer();
    }
}
