public class Student extends User  {

    String courseName;

    public Student(int id, String name, String password, String email, String courseName) {
        super(id, name, password, email);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

}
