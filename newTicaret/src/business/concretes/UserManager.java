package business.concretes;


import business.abstracts.LoginService;
import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;


public class UserManager implements UserService {


    private UserDao userDao;
    private UserCheckService userCheckService;
    private LoginService loginService;

    public UserManager(UserDao userDao,UserCheckService userCheckService,LoginService loginService){
        this.userDao = userDao;
        this.userCheckService = userCheckService;
        this.loginService = loginService;

    }

    @Override
    public void add(User user) {

        if(userCheckService.mail(user))
        {
            if(!user.getFirsName().isEmpty()&& !user.getLastName().isEmpty()){

                userDao.add(user);
            }
        }
        }


    @Override
    public void update(User user) {
        userDao.update(user);

    }

    @Override
    public void delete(User user) {
        userDao.delete(user);

    }

    @Override
    public void login(User user) {

       if(userCheckService.mail(user) == true && loginService.login(user) == true){
           System.out.println("giriş başarılı");

       }

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
