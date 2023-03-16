public class UniversityApplication {
    public static void main(String[] args) {
        Professor professor1 = new Professor("ali", "nassery", "math");
        Professor professor2 = new Professor("amir", "jafary", "physics");
        Student student1 = new Student("arman", "zanbili", 6, "Computer", 19);
        Student student2 = new Student("mohammad", "sedghi", 7, "computer science", 20);
        professor1.addStudent(student1);
        professor1.addStudent(student2);
        professor2.addStudent(student2);
        professor1.print();
        professor2.print();
        student1.print();
        student2.print();
    }
}
