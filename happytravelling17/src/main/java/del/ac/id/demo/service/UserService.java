package del.ac.id.demo.service;

import del.ac.id.demo.model.User;

public interface UserService {
    void save(User user);
    Boolean existByuser(String username);
    Boolean isSuccessLogin(String username, String password);
    User findUser(String username,String password);
}
