package day7.p2;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public Student() {}
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks
                + "]";
    }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getMarks(), this.getMarks());
    }
   
   
   
}
