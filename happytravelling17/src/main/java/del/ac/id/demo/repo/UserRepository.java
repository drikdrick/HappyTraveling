package del.ac.id.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.demo.model.User;

public interface UserRepository extends JpaRepository<User,String> {
    Boolean existsByUsername(String username);
    User findByUsername(String username);
    Boolean existsByUsernameAndPassword(String username,String password);

    User findByUsernameAndPassword(String username,String password);
}
