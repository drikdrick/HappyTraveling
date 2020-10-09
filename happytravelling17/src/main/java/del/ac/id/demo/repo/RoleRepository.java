package del.ac.id.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Boolean existsByRoleName(String rolename);
}
