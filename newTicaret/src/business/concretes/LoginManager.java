package business.concretes;

import business.abstracts.LoginService;
import entities.concretes.User;

public class LoginManager implements LoginService {

    @Override
    public boolean login(User user) {

        if (user.getMail()== "Ahmetaydn354@gmail.com" && user.getPass() == "123456"){
            return  true;
        }else{
            return false;
        }
    }
}
