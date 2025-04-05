//Practical 3
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends Vehicle implements Externalizable {
    private static final long serialVersionUID = 1L;
    private double speed;
    private transient int gear;

    //default constructor
    public Car() {
    }

    public Car(String color, int gear, double speed) {
        super(color);
        this.gear = gear;
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //parent clz
        out.writeObject(getColor());

        //child clz
        out.writeInt(gear);
        out.writeDouble(speed);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //parent clz
        setColor((String) in.readObject());

        //child clz
        setGear(in.readInt());
        setSpeed(in.readDouble());
    }

    @Override
    public String toString() {
        return "Car{" +
                " color=" + getColor() +
                " gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
