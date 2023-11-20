package ru.ahmetdavresh.springsecuritywebapp.service;

import ru.ahmetdavresh.springsecuritywebapp.dto.UserDto;
import ru.ahmetdavresh.springsecuritywebapp.entity.User;
import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}