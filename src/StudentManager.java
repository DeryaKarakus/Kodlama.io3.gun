public class StudentManager extends UserManager{

    @Override
    public void add(User user) {
        System.out.println("The student named" + user.getName() +  " added.");
    }

    @Override
    public void delete(User user) {
        System.out.println("The student named"+ user.getName() + " was deleted.");
    }

    @Override
    public void update(User user) {
        System.out.println("The student named" + user.getName()+  " updated.");
    }

    @Override
    public void email(User user) {
        super.email(user);
    }

    @Override
    public void password(User user) {
        super.password(user);
    }

    public void courseAdd(Student student) {
        System.out.println("The course named" + student.getCourseName() + " added ");
    }


}
