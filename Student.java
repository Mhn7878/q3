import java.util.ArrayList;
import  java.util.List;
public class Student {
    private String name;
    private String lastName;
    private final List<Professor> professors = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public void print() {
        System.out.println("Student " + this.name + "'s teachers are:");
        for (Professor teacher:this.professors) {
            System.out.println("- " + teacher.getName());
        }
    }

}
