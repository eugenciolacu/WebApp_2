package com.springapp.mvc.service;

import com.springapp.mvc.datasource.UsersDao;
import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {

    @Autowired
    private UsersDao usersDao;

    public boolean checkUser(User user) {
        for(User u: usersDao.getListOfUsers()) {
            if (user.equals(u)) return true;
        }
        return false;
    }

    public List<User> getAllUsers() {
        return usersDao.getListOfUsers();
    }

    public List<User> getAllByGender(Gender gender) {
        return getAllUsers().stream()
                .filter(user -> user.getGender() == gender)
                .collect(Collectors.toList());
    }

    public List<User> getAllByGenderAndAge(Gender gender, int age) {
        return getAllUsers().stream()
                .filter(user -> user.getGender() == gender && user.getAge() == age)
                .collect(Collectors.toList());
    }
}
