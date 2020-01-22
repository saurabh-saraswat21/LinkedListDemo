package Student;

public class Student implements Comparable<Student> {
    private String name;
    private int rollno;

    public Student(String name ,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    @Override
    public String toString() {
        return "Student { " +name +" rollno "+rollno +"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    //Comparable
    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.getRollno(),student.getRollno());
    }

}
