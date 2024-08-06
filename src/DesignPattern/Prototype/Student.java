package DesignPattern.Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age ;
    private String batch;
    private double averageBatchPsp ;
    private double studentpsp;

    public Student(){
    }
    public Student(Student s){
        this.age = s.age;
        this.name = s.name;
        this.batch = s.batch;
        this.averageBatchPsp = s.averageBatchPsp;
        this.studentpsp = s.studentpsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBatch() {
        return batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public double getStudentpsp() {
        return studentpsp;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public void setStudentpsp(double studentpsp) {
        this.studentpsp = studentpsp;
    }
}
