public class InstructorManager extends UserManager{
    @Override
    public void add(User user) {
        System.out.println("The instructor named" + user.getName() +  " added.");
    }

    @Override
    public void delete(User user) {
        System.out.println("The instructor named" + user.getName() +  "was deleted");
    }

    @Override
    public void update(User user) {
        System.out.println("The instructor named" + user.getName() +  " updated.");
    }

    @Override
    public void email(User user) {
        super.email(user);
    }

    @Override
    public void password(User user) {
        super.password(user);
    }
    public void addCourseDescription(Instructor instructor) {
        System.out.println("Enter the course description : " + instructor.courseDescription);

    }
    public void updateCourseDescription(Instructor instructor) {
        System.out.println("Course description updated.");

    }
    public void deleteCourseDescription(Instructor instructor) {
        System.out.println("Course description deleted.");

    }
}
