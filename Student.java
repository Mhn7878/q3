import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String lastName;
    private int term;
    private String fieldOfStudy;
    private double score;

    public int getTerm() {
        return term;
    }

    private final List<Professor> professors = new ArrayList<>();

    public double getScore() {
        return score;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

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

    public Student(String name, String lastName, int term , String fieldOfStudy , double score) {
        this.name = name;
        this.lastName = lastName;
        this.term = term;
        this.fieldOfStudy = fieldOfStudy;
        this.score = score;
    }

    public void print() {
        System.out.println("Student " + this.name + this.lastName + this.term + this.fieldOfStudy + this.score + "'s professors are:");
        for (Professor teacher : this.professors) {
            System.out.println("- " + teacher.getName());
        }
    }

}
