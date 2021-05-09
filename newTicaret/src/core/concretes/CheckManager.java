package core.concretes;

import core.abstracts.CheckService;
import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckManager implements CheckService {
    @Override
    public boolean checkName(User user) {
        if(!user.getFirsName().isEmpty()){
            return true;
        }
        System.out.println("Name cannot be empty !");
        return false;
    }

    @Override
    public boolean checkLastName(User user) {

        if(!user.getLastName().isEmpty()){
            return true;
        }
        System.out.println("Surname cannot be empty !");
        return false;

    }

    @Override
    public boolean checkPassword(User user) {
        if(user.getPass().length()>= 6 ){
            return true;
        }
        System.out.println("Password must be a minimum of 6 characters.");
        return false;
    }

    @Override
    public boolean checkEMail(User user) {

        //"^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        Pattern pattern  = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.getMail());
        if (matcher.matches()){
            return true;

        }
        System.out.println("Mail is not in the correct format.");
        return false;

    }

    @Override
    public boolean checkMailConfirm(User user) {
        return true;
    }
}
