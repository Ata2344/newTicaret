package business.concretes;

import business.abstracts.UserCheckService;
import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckManager implements UserCheckService {
    @Override
    public boolean mail(User user) {

        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.getMail());
        if(!matcher.matches()) {
            System.out.println("e-mail address is not correct."+user.getMail());
            return false;
        }
        return true;

    }
}
