import java.io.*;

public class UniversityEmployee extends Employee implements Serializable {
    private int UniversityID;

    public UniversityEmployee(int age, String name, int universityID) {
        super(age, name);
        UniversityID = universityID;
    }

    public int getUniversityID() {
        return UniversityID;
    }

    public void setUniversityID(int universityID) {
        UniversityID = universityID;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(getName());
        out.writeInt(getAge());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        setName((String) in.readObject()); //1. name
        setAge(in.readInt()); //2. age
    }

    @Override
    public String toString() {
        return "UniversityEmployee{" +
                "Name=" + getName() +
                "Age=" + getAge() +
                "UniversityID=" + UniversityID +
                '}';
    }
}
