import java.util.ArrayList;
import  java.util.List;
public class Professor {
    private final String name;
    private final String lastname;
    private final String course;
    private final List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getLastname() {
        return lastname;
    }

    public Professor(String firstname, String lastname, String course) {
        this.name = firstname;
        this.lastname = lastname;
        this.course = course ;
    }
    public void addStudent(Student student) {
        student.addProfessor(this);
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
    public void print() {
        System.out.println("Professor " + this.name + this.lastname + this.course + "'s students are:");
        for (Student student:this.students) {
            System.out.println("- " + student.getName() +student.getLastName() + student.getTerm() + student.getTerm()
                    + student.getFieldOfStudy() + student.getScore());
        }
    }

}
