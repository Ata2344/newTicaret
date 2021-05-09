package dataAccess.concretes;
import business.concretes.UserManager;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import java.util.List;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {

        System.out.println("Added to database : " +user.getMail() );


    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {
        System.out.println("Delete from database : "+user.getMail());

    }


    @Override
    public List<User> getAll() {
        return null;
    }
}
