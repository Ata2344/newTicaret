package core.abstracts;

import entities.concretes.User;

public interface CheckService {

    boolean  checkName(User user);
    boolean  checkLastName(User user);
    boolean  checkPassword(User user);
    boolean  checkEMail(User user);
    boolean  checkMailConfirm(User user);

}
