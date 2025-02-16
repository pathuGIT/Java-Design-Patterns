public class ShapeFactory {
    public Shape getShape(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}
