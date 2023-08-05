package af.mcitp.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import af.mcitp.jwt.domain.User;

public interface userRepository extends JpaRepository<User, Long>{
    Optional<User> findByEmail(String email);
}
