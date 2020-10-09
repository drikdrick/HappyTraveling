package del.ac.id.demo.seeder;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import del.ac.id.demo.model.Jadwal;
import del.ac.id.demo.model.Role;
import del.ac.id.demo.model.User;
import del.ac.id.demo.repo.RoleRepository;
import del.ac.id.demo.repo.UserRepository;

import java.time.LocalDate;
import java.util.Date;

@Component
public class DataSeeder {
    @Autowired
    RoleRepository roleRepo;

    @Autowired
    UserRepository userRepository;

    public void checkRoleIfExists(String roleName) {
        if (!roleRepo.existsByRoleName(roleName)) {
            Role roles = new Role();
            roles.setRoleName(roleName);
            saveRoles(roles);
        }
    }
    public void insertDefaultUser(String username){
        if(!userRepository.existsByUsername(username)){
            User user = new User("admin","admin","admin123",1);
            userRepository.save(user);
        }
    }
//    public void insertDefaultSchedule(){
//
//        jadwalRepository.save(jadwal);
//    }
    public void saveRoles(Role roles) {
        roleRepo.save(roles);
    }
    public void saveUser(User user){
        userRepository.save(user);
    }
    @EventListener
    public void seeder(ContextRefreshedEvent contextRefreshedEvent) {
        checkRoleIfExists("Admin");
        checkRoleIfExists("User");
//        checkRoleIfExists(RoleName.ROLE_MERCHANT);
        insertDefaultUser("admin");
//        insertDefaultSchedule();
    }
}
