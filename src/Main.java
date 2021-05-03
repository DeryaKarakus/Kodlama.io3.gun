public class Main {
    public static void main(String[] args) {

        Student derya = new Student(12,"Derya Karakuş","12345","derya@gmail.com","Yazılım Geliştirici Yetiştirme Kampı ");
        Instructor engin = new Instructor(23,"Engin Demiroğ","4567","engin@gmail.com","azılım Geliştirici Yetiştirme Kampı (JAVA + REACT");

        UserManager userManager = new UserManager();

        User[] users = {derya, engin};

        userManager.addMultiple(users);



      


    }
}
