package ru.ahmetdavresh.springsecuritywebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ahmetdavresh.springsecuritywebapp.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}