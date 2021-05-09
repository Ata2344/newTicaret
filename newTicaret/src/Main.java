import business.abstracts.LoginService;
import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import business.concretes.LoginManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;
import business.concretes.CheckManager;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1,"Ahmet Turan","Turan","Ahmetaydn354@gmail.com", "123456");
        User user2 = new User(1,"ahmet","asdfs","asdfa.com","123456");

        UserService userService = new UserManager(new HibernateUserDao(), new CheckManager(), new LoginManager() );
        User [] users = {user1,user2};
            for(User user:users) {
                userService.add(user);
            }

        System.out.println("\n***********NEW LOG***********\n");

        userService.login(user1);
        userService.login(user2);
        userService.delete(user2);

/*
        userService.add(user);
        userService.login(user);
        userService.delete(user);
        userService.login(user);
*/




    }
}
