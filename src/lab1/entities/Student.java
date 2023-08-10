package lab1.entities;

public class Student {
    private int id;
    public  static  int autoID;
    private String name;
    private String address;

    public Student(String name, String address) {
        this.id = ++autoID;
        this.name = name;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
