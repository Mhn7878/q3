import java.util.ArrayList;
import  java.util.List;
public class Professor {
    private String name;
    private String lastname;
    private final List<Student> students = new ArrayList();

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Professor(String firstname, String lastname) {
        this.name = firstname;
        this.lastname = lastname;
    }
    public void addStudent(Student student) {
        student.addProfessor(this);
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
    public void print() {
        System.out.println("Professor " + this.name + "'s students are:");
        for (Student student:this.students) {
            System.out.println("- " + student.getName());
        }
    }

}
