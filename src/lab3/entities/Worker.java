package lab3.entities;

public class Worker {
    private String id;
    public  static  int autoID;
    private String name;
    private int age;
    private double salary;
    private String workPlace;


    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Worker.autoID = autoID;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Worker(String name, int age, double salary, String workPlace) {
        this.id= "W"+ ++autoID;
        this.name = name;
        this.age =age;
        this.salary = salary;
        this.workPlace = workPlace;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }
}
