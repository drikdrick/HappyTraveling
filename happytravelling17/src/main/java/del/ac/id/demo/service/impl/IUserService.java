package del.ac.id.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.demo.model.User;
import del.ac.id.demo.repo.UserRepository;
import del.ac.id.demo.service.UserService;

@Service
public class IUserService implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public Boolean existByuser(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public Boolean isSuccessLogin(String username, String password) {
        return userRepository.existsByUsernameAndPassword(username,password);
    }

    @Override
    public User findUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username,password);
    }
}
