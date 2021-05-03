public class UserManager {

    public void add(User user) {
        System.out.println(user.getName() + " added");
    }

    public void delete(User user) {
        System.out.println(user.getName() + " deleted");
    }

    public void update(User user) {
        System.out.println(user.getName() + " updated");
    }

    public void email(User user) {
        System.out.println("Please enter email address : " + user.getEmail());
    }

    public void password(User user) {
        System.out.println("Please enter password : " + user.getPassword());
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            add(user);
        }
    }

}
