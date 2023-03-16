import java.util.ArrayList;
import  java.util.List;
public class Professor {
    private String firstname;
    private String lastname;
    private final List<Student> students = new ArrayList();

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Professor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void addStudent(Student student) {
        student.addProfessor(this);
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

}
