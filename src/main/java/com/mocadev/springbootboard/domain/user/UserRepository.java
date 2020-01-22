package com.mocadev.springbootboard.domain.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-22
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
