package del.ac.id.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import del.ac.id.dto.UserRegistrationDto;
import del.ac.id.model.User;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
}
