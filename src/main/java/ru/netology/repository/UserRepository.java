package ru.netology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.model.User;

/**
 * @author Aleksandr Polochkin
 * 20.04.2023
 */

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername(String username);
}