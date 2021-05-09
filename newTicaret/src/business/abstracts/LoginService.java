package business.abstracts;

import entities.concretes.User;

public interface LoginService {
    boolean login(User user);
}
