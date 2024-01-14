package smartquizapp.repository;

import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository {

    public default boolean existsByUsername(String username) {
        return false;
    }

    public default User save(User user) {
        return user;
    }

    Optional<Object> findByUsername(String username);

    Optional<User> findById(Long userId);

    void deleteById(Long userId);
}
