package smartquizapp.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import smartquizapp.dto.UserDto;
import smartquizapp.enums.Role;
import smartquizapp.repository.UserRepository;

import java.util.Optional;
import java.util.function.Function;

public class UserServiceImpl implements UserDetailsService {


    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Function<UserDto, User> saveUser = (userDto)->{
        User user = new ObjectMapper().convertValue(userDto, User.class);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.EDUCATOR);
        return userRepository.save(user);
    };



    public  void removeUser(Long userId) {
        userRepository.deleteById(userId);
    }


    public User findByUsername(String username){
        return (User) userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User not found with username" + username));
    }

    public User findUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not found with ID: " + userId));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}