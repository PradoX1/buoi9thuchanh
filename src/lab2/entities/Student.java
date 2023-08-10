package lab2.entities;

public class Student {
    private int id;
    private String name;
    private  double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;
    private double avgScore;
    public static int autoID;

    public Student( String name, double avgScore) {
        this.id = ++autoID;
        this.name = name;
       this.avgScore = avgScore;
    }

    public Student(int id, String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.id = id;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                '}';
    }
}
