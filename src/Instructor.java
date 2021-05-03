public class Instructor extends User {

    String courseDescription;

    public Instructor(int id, String name, String password, String email, String courseDescription) {
        super(id, name, password, email);
        this.courseDescription = courseDescription;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
