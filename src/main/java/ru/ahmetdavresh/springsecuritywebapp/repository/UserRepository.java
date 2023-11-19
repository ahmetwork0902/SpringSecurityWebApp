package ru.ahmetdavresh.springsecuritywebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ahmetdavresh.springsecuritywebapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}